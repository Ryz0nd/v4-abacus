package exchange.dydx.abacus.functional.vault

import exchange.dydx.abacus.output.input.ErrorType
import kollections.iListOf
import kollections.toIList
import kotlin.test.Test
import kotlin.test.assertEquals

class VaultFormTests {

    private fun makeVaultAccount(balanceShares: Double, balanceUsdc: Double, withdrawableUsdc: Double): VaultAccount {
        return VaultAccount(
            balanceShares = balanceShares,
            lockedShares = null, // currently ignored but we should probably populate this at some point
            vaultTransfers = null,
            allTimeReturnUsdc = null,
            totalVaultTransfersCount = null,
            withdrawableUsdc = withdrawableUsdc,
            balanceUsdc = balanceUsdc,
        )
    }

    @Test
    fun testDepositValidation() {
        val result = VaultDepositWithdrawFormValidator.validateVaultForm(
            formData = VaultFormData(
                action = VaultFormAction.DEPOSIT,
                amount = 100.0,
                acknowledgedSlippage = true,
                inConfirmationStep = true,
            ),
            accountData = VaultFormAccountData(
                marginUsage = 0.5,
                freeCollateral = 1000.0,
            ),
            vaultAccount = makeVaultAccount(
                balanceUsdc = 500.0,
                balanceShares = 250.0,
                withdrawableUsdc = 500.0,
            ),
            slippageResponse = null,
        )

        assertEquals(
            VaultFormValidationResult(
                errors = listOf<VaultFormValidationError>().toIList(),
                submissionData = VaultDepositWithdrawSubmissionData(
                    deposit = VaultDepositData(
                        subaccountFrom = "0",
                        amount = 100.0,
                    ),
                    withdraw = null,
                ),
                summaryData = VaultFormSummaryData(
                    needSlippageAck = false,
                    marginUsage = 0.5263157894736843,
                    freeCollateral = 900.0,
                    vaultBalance = 600.0,
                    estimatedSlippage = 0.0,
                    estimatedAmountReceived = null,
                ),
            ),
            result,
        )
    }

    @Test
    fun testWithdrawValidation() {
        val result = VaultDepositWithdrawFormValidator.validateVaultForm(
            formData = VaultFormData(
                action = VaultFormAction.WITHDRAW,
                amount = 100.0,
                acknowledgedSlippage = true,
                inConfirmationStep = true,
            ),
            accountData = VaultFormAccountData(
                marginUsage = 0.5,
                freeCollateral = 1000.0,
            ),
            vaultAccount = makeVaultAccount(
                balanceUsdc = 500.0,
                withdrawableUsdc = 500.0,
                balanceShares = 500.0,
            ),
            slippageResponse = VaultDepositWithdrawSlippageResponse(
                shares = 100.0,
                expectedAmount = 98.0,
            ),
        )

        assertEquals(
            VaultFormValidationResult(
                errors = iListOf(
                    VaultFormValidationError(ErrorType.warning, VaultFormValidationErrorType.SLIPPAGE_TOO_HIGH),
                ),
                submissionData = VaultDepositWithdrawSubmissionData(
                    deposit = null,
                    withdraw = VaultWithdrawData(
                        subaccountTo = "0",
                        shares = 100.0,
                        minAmount = 98 * .99,
                    ),
                ),
                summaryData = VaultFormSummaryData(
                    needSlippageAck = true,
                    marginUsage = 0.4766444232602478,
                    freeCollateral = 1098.0,
                    vaultBalance = 400.0,
                    estimatedSlippage = 0.020000000000000018,
                    estimatedAmountReceived = 98.0,
                ),
            ),
            result,
        )
    }

    @Test
    fun testWithdrawBadSlippageResponse() {
        // same as previous but your slippage response is out of date
        val result = VaultDepositWithdrawFormValidator.validateVaultForm(
            formData = VaultFormData(
                action = VaultFormAction.WITHDRAW,
                amount = 100.0,
                acknowledgedSlippage = true,
                inConfirmationStep = true,
            ),
            accountData = VaultFormAccountData(
                marginUsage = 0.5,
                freeCollateral = 1000.0,
            ),
            vaultAccount = makeVaultAccount(
                balanceUsdc = 500.0,
                withdrawableUsdc = 500.0,
                balanceShares = 500.0,
            ),
            slippageResponse = VaultDepositWithdrawSlippageResponse(
                shares = 120.0,
                expectedAmount = 98.0,
            ),
        )

        assertEquals(
            VaultFormValidationResult(
                errors = iListOf(
                    VaultFormValidationError(ErrorType.error, VaultFormValidationErrorType.SLIPPAGE_RESPONSE_WRONG_SHARES),
                    VaultFormValidationError(ErrorType.warning, VaultFormValidationErrorType.SLIPPAGE_TOO_HIGH),
                ),
                submissionData = null,
                summaryData = VaultFormSummaryData(
                    needSlippageAck = true,
                    marginUsage = 0.4766444232602478,
                    freeCollateral = 1098.0,
                    vaultBalance = 400.0,
                    estimatedSlippage = 0.020000000000000018, // unfortunate precision issues with direct equality checks
                    estimatedAmountReceived = 98.0,
                ),
            ),
            result,
        )
    }

    @Test
    fun testInvalidWithdraw() {
        val result = VaultDepositWithdrawFormValidator.validateVaultForm(
            formData = VaultFormData(
                action = VaultFormAction.WITHDRAW,
                amount = 600.0,
                acknowledgedSlippage = false,
                inConfirmationStep = true,
            ),
            accountData = VaultFormAccountData(
                marginUsage = 0.5,
                freeCollateral = 1000.0,
            ),
            vaultAccount = makeVaultAccount(
                balanceUsdc = 500.0,
                withdrawableUsdc = 500.0,
                balanceShares = 500.0,
            ),
            slippageResponse = VaultDepositWithdrawSlippageResponse(
                shares = 600.0,
                expectedAmount = 500.0,
            ),
        )

        assertEquals(
            VaultFormValidationResult(
                errors = iListOf(
                    VaultFormValidationError(ErrorType.error, VaultFormValidationErrorType.WITHDRAW_TOO_HIGH),
                    VaultFormValidationError(ErrorType.warning, VaultFormValidationErrorType.SLIPPAGE_TOO_HIGH),
                    VaultFormValidationError(ErrorType.error, VaultFormValidationErrorType.MUST_ACK_SLIPPAGE),
                ),
                submissionData = null,
                summaryData = VaultFormSummaryData(
                    needSlippageAck = true,
                    marginUsage = 0.4,
                    freeCollateral = 1500.0,
                    vaultBalance = -100.0,
                    estimatedSlippage = 0.16666666666666663,
                    estimatedAmountReceived = 500.0,
                ),
            ),
            result,
        )
    }
}
