package exchange.dydx.abacus.tests.payloads

object RPCMock {
    internal val json = """
        {
          "1": {
            "name": "Ethereum",
            "rpc": "https://cloudflare-eth.com"
          },
          "5": {
            "name": "Goerli",
            "rpc": "https://rpc.ankr.com/eth_goerli"
          },
          "7": {
            "name": "ThaiChain",
            "rpc": "https://rpc.thaichain.org"
          },
          "10": {
            "name": "OP Mainnet",
            "rpc": "https://mainnet.optimism.io"
          },
          "14": {
            "name": "Flare Mainnet",
            "rpc": "https://flare-api.flare.network/ext/C/rpc"
          },
          "16": {
            "name": "Coston",
            "rpc": "https://coston-api.flare.network/ext/C/rpc"
          },
          "19": {
            "name": "Songbird Mainnet",
            "rpc": "https://songbird-api.flare.network/ext/C/rpc"
          },
          "25": {
            "name": "Cronos Mainnet",
            "rpc": "https://evm.cronos.org"
          },
          "30": {
            "name": "Rootstock Mainnet",
            "rpc": "https://public-node.rsk.co"
          },
          "31": {
            "name": "Rootstock Testnet",
            "rpc": "https://public-node.testnet.rsk.co"
          },
          "40": {
            "name": "Telos",
            "rpc": "https://mainnet.telos.net/evm"
          },
          "41": {
            "name": "Telos",
            "rpc": "https://testnet.telos.net/evm"
          },
          "42": {
            "name": "LUKSO",
            "rpc": "https://rpc.mainnet.lukso.network"
          },
          "44": {
            "name": "Crab Network",
            "rpc": "https://crab-rpc.darwinia.network"
          },
          "46": {
            "name": "Darwinia Network",
            "rpc": "https://rpc.darwinia.network"
          },
          "50": {
            "name": "XinFin Network",
            "rpc": "https://rpc.xinfin.network"
          },
          "51": {
            "name": "Apothem Network",
            "rpc": "https://erpc.apothem.network"
          },
          "56": {
            "name": "BNB Smart Chain",
            "rpc": "https://rpc.ankr.com/bsc"
          },
          "57": {
            "name": "Syscoin Mainnet",
            "rpc": "https://rpc.syscoin.org"
          },
          "61": {
            "name": "Ethereum Classic",
            "rpc": "https://etc.rivet.link"
          },
          "66": {
            "name": "OKC",
            "rpc": "https://exchainrpc.okex.org"
          },
          "71": {
            "name": "Conflux eSpace Testnet",
            "rpc": "https://evmtestnet.confluxrpc.com"
          },
          "82": {
            "name": "Meter",
            "rpc": "https://rpc.meter.io"
          },
          "83": {
            "name": "Meter Testnet",
            "rpc": "https://rpctest.meter.io"
          },
          "96": {
            "name": "Bitkub",
            "rpc": "https://rpc.bitkubchain.io"
          },
          "97": {
            "name": "Binance Smart Chain Testnet",
            "rpc": "https://data-seed-prebsc-1-s1.bnbchain.org:8545"
          },
          "100": {
            "name": "Gnosis",
            "rpc": "https://rpc.gnosischain.com"
          },
          "109": {
            "name": "Shibarium",
            "rpc": "https://rpc.shibrpc.com"
          },
          "114": {
            "name": "Coston2",
            "rpc": "https://coston2-api.flare.network/ext/C/rpc"
          },
          "122": {
            "name": "Fuse",
            "rpc": "https://rpc.fuse.io"
          },
          "123": {
            "name": "Fuse Sparknet",
            "rpc": "https://rpc.fusespark.io"
          },
          "137": {
            "name": "Polygon",
            "rpc": "https://polygon-rpc.com"
          },
          "148": {
            "name": "Shimmer",
            "rpc": "https://json-rpc.evm.shimmer.network"
          },
          "153": {
            "name": "Redbelly Network Testnet",
            "rpc": "https://governors.testnet.redbelly.network"
          },
          "157": {
            "name": "Puppynet Shibarium",
            "rpc": "https://puppynet.shibrpc.com"
          },
          "169": {
            "name": "Manta Pacific Mainnet",
            "rpc": "https://pacific-rpc.manta.network/http"
          },
          "195": {
            "name": "X1 Testnet",
            "rpc": "https://xlayertestrpc.okx.com"
          },
          "196": {
            "name": "X Layer Mainnet",
            "rpc": "https://rpc.xlayer.tech"
          },
          "199": {
            "name": "BitTorrent",
            "rpc": "https://rpc.bittorrentchain.io"
          },
          "202": {
            "name": "Edgeless Testnet",
            "rpc": "https://edgeless-testnet.rpc.caldera.xyz/http"
          },
          "204": {
            "name": "opBNB",
            "rpc": "https://opbnb-mainnet-rpc.bnbchain.org"
          },
          "240": {
            "name": "Nexilix Smart Chain",
            "rpc": "https://rpcurl.pos.nexilix.com"
          },
          "242": {
            "name": "Plinga",
            "rpc": "https://rpcurl.mainnet.plgchain.com"
          },
          "248": {
            "name": "Oasys",
            "rpc": "https://rpc.mainnet.oasys.games"
          },
          "250": {
            "name": "Fantom",
            "rpc": "https://rpc.ankr.com/fantom"
          },
          "252": {
            "name": "Fraxtal",
            "rpc": "https://rpc.frax.com"
          },
          "255": {
            "name": "Kroma",
            "rpc": "https://api.kroma.network"
          },
          "260": {
            "name": "zkSync InMemory Node",
            "rpc": "http://localhost:8011"
          },
          "270": {
            "name": "zkSync CLI Local Node",
            "rpc": "http://localhost:3050"
          },
          "280": {
            "name": "zkSync Era Testnet",
            "rpc": "https://testnet.era.zksync.dev"
          },
          "288": {
            "name": "Boba Network",
            "rpc": "https://mainnet.boba.network"
          },
          "295": {
            "name": "Hedera Mainnet",
            "rpc": "https://mainnet.hashio.io/api"
          },
          "296": {
            "name": "Hedera Testnet",
            "rpc": "https://testnet.hashio.io/api"
          },
          "297": {
            "name": "Hedera Previewnet",
            "rpc": "https://previewnet.hashio.io/api"
          },
          "300": {
            "name": "zkSync Sepolia Testnet",
            "rpc": "https://sepolia.era.zksync.dev"
          },
          "314": {
            "name": "Filecoin Mainnet",
            "rpc": "https://api.node.glif.io/rpc/v1"
          },
          "321": {
            "name": "KCC Mainnet",
            "rpc": "https://kcc-rpc.com"
          },
          "324": {
            "name": "zkSync Era",
            "rpc": "https://mainnet.era.zksync.io"
          },
          "338": {
            "name": "Cronos Testnet",
            "rpc": "https://evm-t3.cronos.org"
          },
          "369": {
            "name": "PulseChain",
            "rpc": "https://rpc.pulsechain.com"
          },
          "420": {
            "name": "Optimism Goerli",
            "rpc": "https://goerli.optimism.io"
          },
          "424": {
            "name": "PGN",
            "rpc": "https://rpc.publicgoods.network"
          },
          "462": {
            "name": "Areon Network Testnet",
            "rpc": "https://testnet-rpc.areon.network"
          },
          "463": {
            "name": "Areon Network",
            "rpc": "https://mainnet-rpc.areon.network"
          },
          "545": {
            "name": "FlowEVM Testnet",
            "rpc": "https://testnet.evm.nodes.onflow.org"
          },
          "570": {
            "name": "Rollux Mainnet",
            "rpc": "https://rpc.rollux.com"
          },
          "571": {
            "name": "MetaChain Mainnet",
            "rpc": "https://rpc.metatime.com"
          },
          "592": {
            "name": "Astar",
            "rpc": "https://astar.api.onfinality.io/public"
          },
          "595": {
            "name": "Mandala TC9",
            "rpc": "https://eth-rpc-tc9.aca-staging.network"
          },
          "599": {
            "name": "Metis Goerli",
            "rpc": "https://goerli.gateway.metisdevops.link"
          },
          "646": {
            "name": "FlowEVM Previewnet",
            "rpc": "https://previewnet.evm.nodes.onflow.org"
          },
          "686": {
            "name": "Karura",
            "rpc": "https://eth-rpc-karura.aca-api.network"
          },
          "690": {
            "name": "Redstone",
            "rpc": "https://rpc.redstonechain.com"
          },
          "701": {
            "name": "Koi Network",
            "rpc": "https://koi-rpc.darwinia.network"
          },
          "747": {
            "name": "FlowEVM Mainnet",
            "rpc": "https://mainnet.evm.nodes.onflow.org"
          },
          "787": {
            "name": "Acala",
            "rpc": "https://eth-rpc-acala.aca-api.network"
          },
          "841": {
            "name": "Taraxa Mainnet",
            "rpc": "https://rpc.mainnet.taraxa.io"
          },
          "842": {
            "name": "Taraxa Testnet",
            "rpc": "https://rpc.testnet.taraxa.io"
          },
          "919": {
            "name": "Mode Testnet",
            "rpc": "https://sepolia.mode.network"
          },
          "943": {
            "name": "PulseChain V4",
            "rpc": "https://rpc.v4.testnet.pulsechain.com"
          },
          "957": {
            "name": "Lyra Chain",
            "rpc": "https://rpc.lyra.finance"
          },
          "997": {
            "name": "5ireChain Thunder Testnet",
            "rpc": "https://rpc-testnet.5ire.network"
          },
          "999": {
            "name": "Zora Goerli Testnet",
            "rpc": "https://testnet.rpc.zora.energy"
          },
          "1001": {
            "name": "Klaytn Baobab Testnet",
            "rpc": "https://public-en-baobab.klaytn.net"
          },
          "1004": {
            "name": "Ekta Testnet",
            "rpc": "https://test.ekta.io:8545"
          },
          "1017": {
            "name": "BNB Greenfield Chain",
            "rpc": "https://greenfield-chain.bnbchain.org"
          },
          "1028": {
            "name": "BitTorrent Chain Testnet",
            "rpc": "https://testrpc.bittorrentchain.io"
          },
          "1030": {
            "name": "Conflux eSpace",
            "rpc": "https://evm.confluxrpc.com"
          },
          "1038": {
            "name": "Bronos Testnet",
            "rpc": "https://evm-testnet.bronos.org"
          },
          "1039": {
            "name": "Bronos",
            "rpc": "https://evm.bronos.org"
          },
          "1073": {
            "name": "Shimmer Testnet",
            "rpc": "https://json-rpc.evm.testnet.shimmer.network"
          },
          "1088": {
            "name": "Metis",
            "rpc": "https://andromeda.metis.io/?owner=1088"
          },
          "1101": {
            "name": "Polygon zkEVM",
            "rpc": "https://zkevm-rpc.com"
          },
          "1111": {
            "name": "WEMIX",
            "rpc": "https://api.wemix.com"
          },
          "1112": {
            "name": "WEMIX Testnet",
            "rpc": "https://api.test.wemix.com"
          },
          "1116": {
            "name": "Core Dao",
            "rpc": "https://rpc.coredao.org"
          },
          "1130": {
            "name": "DeFiChain EVM Mainnet",
            "rpc": "https://eth.mainnet.ocean.jellyfishsdk.com"
          },
          "1131": {
            "name": "DeFiChain EVM Testnet",
            "rpc": "https://eth.testnet.ocean.jellyfishsdk.com"
          },
          "1135": {
            "name": "Lisk",
            "rpc": "https://rpc.api.lisk.com"
          },
          "1281": {
            "name": "Moonbeam Development Node",
            "rpc": "http://127.0.0.1:9944"
          },
          "1284": {
            "name": "Moonbeam",
            "rpc": "https://moonbeam.public.blastapi.io"
          },
          "1285": {
            "name": "Moonriver",
            "rpc": "https://moonriver.public.blastapi.io"
          },
          "1287": {
            "name": "Moonbase Alpha",
            "rpc": "https://rpc.api.moonbase.moonbeam.network"
          },
          "1328": {
            "name": "Sei Testnet",
            "rpc": "https://evm-rpc-testnet.sei-apis.com"
          },
          "1329": {
            "name": "Sei Network",
            "rpc": "https://evm-rpc.sei-apis.com/"
          },
          "1337": {
            "name": "Localhost",
            "rpc": "http://127.0.0.1:8545"
          },
          "1442": {
            "name": "Polygon zkEVM Testnet",
            "rpc": "https://rpc.public.zkevm-test.net"
          },
          "1453": {
            "name": "MetaChain Istanbul",
            "rpc": "https://istanbul-rpc.metachain.dev"
          },
          "1559": {
            "name": "Tenet",
            "rpc": "https://rpc.tenet.org"
          },
          "1663": {
            "name": "Horizen Gobi Testnet",
            "rpc": "https://gobi-testnet.horizenlabs.io/ethv1"
          },
          "1686": {
            "name": "Mint Sepolia Testnet",
            "rpc": "https://testnet-rpc.mintchain.io"
          },
          "1729": {
            "name": "Reya Network",
            "rpc": "https://rpc.reya.network"
          },
          "1750": {
            "name": "Metal L2",
            "rpc": "https://rpc.metall2.com"
          },
          "1890": {
            "name": "LightLink Phoenix Mainnet",
            "rpc": "https://replicator.phoenix.lightlink.io/rpc/v1"
          },
          "1891": {
            "name": "LightLink Pegasus Testnet",
            "rpc": "https://replicator.pegasus.lightlink.io/rpc/v1"
          },
          "1994": {
            "name": "Ekta",
            "rpc": "https://main.ekta.io"
          },
          "2000": {
            "name": "Dogechain",
            "rpc": "https://rpc.dogechain.dog"
          },
          "2017": {
            "name": "Telcoin Adiri Testnet",
            "rpc": "https://rpc.telcoin.network"
          },
          "2020": {
            "name": "Ronin",
            "rpc": "https://api.roninchain.com/rpc"
          },
          "2021": {
            "name": "Saigon Testnet",
            "rpc": "https://saigon-testnet.roninchain.com/rpc"
          },
          "2022": {
            "name": "Beresheet BereEVM Testnet",
            "rpc": "https://beresheet-evm.jelliedowl.net"
          },
          "2026": {
            "name": "Edgeless Network",
            "rpc": "https://rpc.edgeless.network/http"
          },
          "2221": {
            "name": "Kava EVM Testnet",
            "rpc": "https://evm.testnet.kava.io"
          },
          "2222": {
            "name": "Kava EVM",
            "rpc": "https://evm.kava.io"
          },
          "2331": {
            "name": "RSS3 VSL Sepolia Testnet",
            "rpc": "https://rpc.testnet.rss3.io"
          },
          "2358": {
            "name": "Kroma Sepolia",
            "rpc": "https://api.sepolia.kroma.network"
          },
          "2442": {
            "name": "Polygon zkEVM Cardona",
            "rpc": "https://rpc.cardona.zkevm-rpc.com"
          },
          "2522": {
            "name": "Fraxtal Testnet",
            "rpc": "https://rpc.testnet.frax.com"
          },
          "2525": {
            "name": "inEVM Mainnet",
            "rpc": "https://mainnet.rpc.inevm.com/http"
          },
          "2710": {
            "name": "Morph Sepolia",
            "rpc": "https://rpc-testnet.morphl2.io"
          },
          "2730": {
            "name": "XR Sepolia",
            "rpc": "https://xr-sepolia-testnet.rpc.caldera.xyz/http"
          },
          "2810": {
            "name": "Morph Holesky",
            "rpc": "https://rpc-quicknode-holesky.morphl2.io"
          },
          "3109": {
            "name": "SatoshiVM Alpha Mainnet",
            "rpc": "https://alpha-rpc-node-http.svmscan.io"
          },
          "3110": {
            "name": "SatoshiVM Testnet",
            "rpc": "https://test-rpc-node-http.svmscan.io"
          },
          "3141": {
            "name": "Filecoin Hyperspace",
            "rpc": "https://api.hyperspace.node.glif.io/rpc/v1"
          },
          "3737": {
            "name": "Crossbell",
            "rpc": "https://rpc.crossbell.io"
          },
          "3776": {
            "name": "Astar zkEVM",
            "rpc": "https://rpc.startale.com/astar-zkevm"
          },
          "3993": {
            "name": "APEX Testnet",
            "rpc": "https://rpc-testnet.apexlayer.xyz"
          },
          "4002": {
            "name": "Fantom Testnet",
            "rpc": "https://rpc.testnet.fantom.network"
          },
          "4090": {
            "name": "Oasis Testnet",
            "rpc": "https://rpc1.oasis.bahamutchain.com"
          },
          "4200": {
            "name": "Merlin",
            "rpc": "https://rpc.merlinchain.io"
          },
          "4201": {
            "name": "LUKSO Testnet",
            "rpc": "https://rpc.testnet.lukso.network"
          },
          "4202": {
            "name": "Lisk Sepolia",
            "rpc": "https://rpc.sepolia-api.lisk.com"
          },
          "4242": {
            "name": "Nexi",
            "rpc": "https://rpc.chain.nexi.technology"
          },
          "4337": {
            "name": "Beam",
            "rpc": "https://build.onbeam.com/rpc"
          },
          "4689": {
            "name": "IoTeX",
            "rpc": "https://babel-api.mainnet.iotex.io"
          },
          "4690": {
            "name": "IoTeX Testnet",
            "rpc": "https://babel-api.testnet.iotex.io"
          },
          "4759": {
            "name": "MEVerse Chain Testnet",
            "rpc": "https://rpc.meversetestnet.io"
          },
          "4777": {
            "name": "BlackFort Exchange Network Testnet",
            "rpc": "https://testnet.blackfort.network/rpc"
          },
          "4999": {
            "name": "BlackFort Exchange Network",
            "rpc": "https://mainnet.blackfort.network/rpc"
          },
          "5000": {
            "name": "Mantle",
            "rpc": "https://rpc.mantle.xyz"
          },
          "5001": {
            "name": "Mantle Testnet",
            "rpc": "https://rpc.testnet.mantle.xyz"
          },
          "5003": {
            "name": "Mantle Sepolia Testnet",
            "rpc": "https://rpc.sepolia.mantle.xyz"
          },
          "5112": {
            "name": "Ham",
            "rpc": "https://rpc.ham.fun"
          },
          "5611": {
            "name": "opBNB Testnet",
            "rpc": "https://opbnb-testnet-rpc.bnbchain.org"
          },
          "5700": {
            "name": "Syscoin Tanenbaum Testnet",
            "rpc": "https://rpc.tanenbaum.io"
          },
          "7000": {
            "name": "ZetaChain",
            "rpc": "https://zetachain-evm.blockpi.network/v1/rpc/public"
          },
          "7001": {
            "name": "ZetaChain Athens Testnet",
            "rpc": "https://zetachain-athens-evm.blockpi.network/v1/rpc/public"
          },
          "7332": {
            "name": "Horizen EON",
            "rpc": "https://eon-rpc.horizenlabs.io/ethv1"
          },
          "7518": {
            "name": "MEVerse Chain Mainnet",
            "rpc": "https://rpc.meversemainnet.io"
          },
          "7560": {
            "name": "Cyber",
            "rpc": "https://cyber.alt.technology"
          },
          "7700": {
            "name": "Canto",
            "rpc": "https://canto.gravitychain.io"
          },
          "8082": {
            "name": "Shardeum Sphinx",
            "rpc": "https://sphinx.shardeum.org"
          },
          "8217": {
            "name": "Klaytn",
            "rpc": "https://public-en-cypress.klaytn.net"
          },
          "8453": {
            "name": "Base",
            "rpc": "https://mainnet.base.org"
          },
          "8899": {
            "name": "JIBCHAIN L1",
            "rpc": "https://rpc-l1.jibchain.net"
          },
          "9000": {
            "name": "Evmos Testnet",
            "rpc": "https://eth.bd.evmos.dev:8545"
          },
          "9001": {
            "name": "Evmos",
            "rpc": "https://eth.bd.evmos.org:8545"
          },
          "9700": {
            "name": "OORT MainnetDev",
            "rpc": "https://dev-rpc.oortech.com"
          },
          "10200": {
            "name": "Gnosis Chiado",
            "rpc": "https://rpc.chiadochain.net"
          },
          "11235": {
            "name": "HAQQ Mainnet",
            "rpc": "https://rpc.eth.haqq.network"
          },
          "11501": {
            "name": "BEVM Mainnet",
            "rpc": "https://rpc-mainnet-1.bevm.io"
          },
          "11822": {
            "name": "Artela Testnet",
            "rpc": "https://betanet-rpc1.artela.network"
          },
          "12306": {
            "name": "Fibo Chain",
            "rpc": "https://network.hzroc.art"
          },
          "12324": {
            "name": "L3X Protocol",
            "rpc": "https://rpc-mainnet.l3x.com"
          },
          "12325": {
            "name": "L3X Protocol Testnet",
            "rpc": "https://rpc-testnet.l3x.com"
          },
          "12553": {
            "name": "RSS3 VSL Mainnet",
            "rpc": "https://rpc.rss3.io"
          },
          "13337": {
            "name": "Beam Testnet",
            "rpc": "https://build.onbeam.com/rpc/testnet"
          },
          "13371": {
            "name": "Immutable zkEVM",
            "rpc": "https://rpc.immutable.com"
          },
          "13381": {
            "name": "Phoenix Blockchain",
            "rpc": "https://rpc.phoenixplorer.com"
          },
          "13473": {
            "name": "Immutable zkEVM Testnet",
            "rpc": "https://rpc.testnet.immutable.com"
          },
          "15557": {
            "name": "EOS EVM Testnet",
            "rpc": "https://api.testnet.evm.eosnetwork.com"
          },
          "17000": {
            "name": "Holesky",
            "rpc": "https://ethereum-holesky-rpc.publicnode.com"
          },
          "17777": {
            "name": "EOS EVM",
            "rpc": "https://api.evm.eosnetwork.com"
          },
          "18233": {
            "name": "Unreal",
            "rpc": "https://rpc.unreal-orbit.gelato.digital"
          },
          "22222": {
            "name": "Nautilus Mainnet",
            "rpc": "https://api.nautilus.nautchain.xyz"
          },
          "23294": {
            "name": "Oasis Sapphire",
            "rpc": "https://sapphire.oasis.io"
          },
          "23295": {
            "name": "Oasis Sapphire Testnet",
            "rpc": "https://testnet.sapphire.oasis.dev"
          },
          "23451": {
            "name": "DreyerX Mainnet",
            "rpc": "https://rpc.dreyerx.com"
          },
          "25925": {
            "name": "Bitkub Testnet",
            "rpc": "https://rpc-testnet.bitkubchain.io"
          },
          "31337": {
            "name": "Hardhat",
            "rpc": "http://127.0.0.1:8545"
          },
          "32769": {
            "name": "Zilliqa",
            "rpc": "https://api.zilliqa.com"
          },
          "33101": {
            "name": "Zilliqa Testnet",
            "rpc": "https://dev-api.zilliqa.com"
          },
          "34443": {
            "name": "Mode Mainnet",
            "rpc": "https://mainnet.mode.network"
          },
          "35441": {
            "name": "Q Mainnet",
            "rpc": "https://rpc.q.org"
          },
          "35443": {
            "name": "Q Testnet",
            "rpc": "https://rpc.qtestnet.org"
          },
          "42161": {
            "name": "Arbitrum One",
            "rpc": "https://arb1.arbitrum.io/rpc"
          },
          "42170": {
            "name": "Arbitrum Nova",
            "rpc": "https://nova.arbitrum.io/rpc"
          },
          "42220": {
            "name": "Celo",
            "rpc": "https://forno.celo.org"
          },
          "42766": {
            "name": "ZKFair Mainnet",
            "rpc": "https://rpc.zkfair.io"
          },
          "42793": {
            "name": "Etherlink",
            "rpc": "https://node.mainnet.etherlink.com"
          },
          "43113": {
            "name": "Avalanche Fuji",
            "rpc": "https://api.avax-test.network/ext/bc/C/rpc"
          },
          "43114": {
            "name": "Avalanche",
            "rpc": "https://api.avax.network/ext/bc/C/rpc"
          },
          "43851": {
            "name": "ZKFair Testnet",
            "rpc": "https://testnet-rpc.zkfair.io"
          },
          "44787": {
            "name": "Alfajores",
            "rpc": "https://alfajores-forno.celo-testnet.org"
          },
          "48899": {
            "name": "Zircuit Testnet",
            "rpc": "https://zircuit1.p2pify.com"
          },
          "50005": {
            "name": "Yooldo Verse",
            "rpc": "https://rpc.yooldo-verse.xyz"
          },
          "50006": {
            "name": "Yooldo Verse Testnet",
            "rpc": "https://rpc.testnet.yooldo-verse.xyz"
          },
          "53457": {
            "name": "DODOchain Testnet",
            "rpc": "https://dodochain-testnet.alt.technology"
          },
          "53935": {
            "name": "DFK Chain",
            "rpc": "https://subnets.avax.network/defi-kingdoms/dfk-chain/rpc"
          },
          "54211": {
            "name": "HAQQ Testedge 2",
            "rpc": "https://rpc.eth.testedge2.haqq.network"
          },
          "57000": {
            "name": "Rollux Testnet",
            "rpc": "https://rpc-tanenbaum.rollux.com/"
          },
          "58008": {
            "name": "PGN ",
            "rpc": "https://sepolia.publicgoods.network"
          },
          "59140": {
            "name": "Linea Goerli Testnet",
            "rpc": "https://rpc.goerli.linea.build"
          },
          "59141": {
            "name": "Linea Sepolia Testnet",
            "rpc": "https://rpc.sepolia.linea.build"
          },
          "59144": {
            "name": "Linea Mainnet",
            "rpc": "https://rpc.linea.build"
          },
          "60808": {
            "name": "BOB",
            "rpc": "https://rpc.gobob.xyz"
          },
          "64240": {
            "name": "Fantom Sonic Open Testnet",
            "rpc": "https://rpcapi.sonic.fantom.network"
          },
          "80001": {
            "name": "Polygon Mumbai",
            "rpc": "https://rpc.ankr.com/polygon_mumbai"
          },
          "80002": {
            "name": "Polygon Amoy",
            "rpc": "https://rpc-amoy.polygon.technology"
          },
          "80084": {
            "name": "Berachain bArtio",
            "rpc": "https://bartio.rpc.berachain.com"
          },
          "80085": {
            "name": "Berachain Artio",
            "rpc": "https://artio.rpc.berachain.com"
          },
          "81457": {
            "name": "Blast",
            "rpc": "https://rpc.blast.io"
          },
          "84531": {
            "name": "Base Goerli",
            "rpc": "https://goerli.base.org"
          },
          "84532": {
            "name": "Base Sepolia",
            "rpc": "https://sepolia.base.org"
          },
          "88991": {
            "name": "Jibchain Testnet",
            "rpc": "https://rpc.testnet.jibchain.net"
          },
          "100009": {
            "name": "Vechain",
            "rpc": "https://mainnet.vechain.org"
          },
          "105105": {
            "name": "Stratis Mainnet",
            "rpc": "https://rpc.stratisevm.com"
          },
          "111188": {
            "name": "re.al",
            "rpc": "https://real.drpc.org"
          },
          "128123": {
            "name": "Etherlink Testnet",
            "rpc": "https://node.ghostnet.etherlink.com"
          },
          "167000": {
            "name": "Taiko Mainnet",
            "rpc": "https://rpc.mainnet.taiko.xyz"
          },
          "167005": {
            "name": "Taiko (Alpha-3 Testnet)",
            "rpc": "https://rpc.test.taiko.xyz"
          },
          "167007": {
            "name": "Taiko Jolnir (Alpha-5 Testnet)",
            "rpc": "https://rpc.jolnir.taiko.xyz"
          },
          "167008": {
            "name": "Taiko Katla (Alpha-6 Testnet)",
            "rpc": "https://rpc.katla.taiko.xyz"
          },
          "167009": {
            "name": "Taiko Hekla L2",
            "rpc": "https://rpc.hekla.taiko.xyz"
          },
          "200810": {
            "name": "Bitlayer Testnet",
            "rpc": "https://testnet-rpc.bitlayer.org"
          },
          "205205": {
            "name": "Auroria Testnet",
            "rpc": "https://auroria.rpc.stratisevm.com"
          },
          "314159": {
            "name": "Filecoin Calibration",
            "rpc": "https://api.calibration.node.glif.io/rpc/v1"
          },
          "421613": {
            "name": "Arbitrum Goerli",
            "rpc": "https://goerli-rollup.arbitrum.io/rpc"
          },
          "421614": {
            "name": "Arbitrum Sepolia",
            "rpc": "https://sepolia-rollup.arbitrum.io/rpc"
          },
          "534351": {
            "name": "Scroll Sepolia",
            "rpc": "https://sepolia-rpc.scroll.io"
          },
          "534352": {
            "name": "Scroll",
            "rpc": "https://rpc.scroll.io"
          },
          "641230": {
            "name": "Bear Network Chain Mainnet",
            "rpc": "https://brnkc-mainnet.bearnetwork.net"
          },
          "660279": {
            "name": "Xai Mainnet",
            "rpc": "https://xai-chain.net/rpc"
          },
          "713715": {
            "name": "Sei Devnet",
            "rpc": "https://evm-rpc-arctic-1.sei-apis.com"
          },
          "751230": {
            "name": "Bear Network Chain Testnet",
            "rpc": "https://brnkc-test.bearnetwork.net"
          },
          "810180": {
            "name": "zkLink Nova",
            "rpc": "https://rpc.zklink.io"
          },
          "810181": {
            "name": "zkLink Nova Sepolia Testnet",
            "rpc": "https://sepolia.rpc.zklink.io"
          },
          "1337803": {
            "name": "Zhejiang",
            "rpc": "https://rpc.zhejiang.ethpandaops.io"
          },
          "1612127": {
            "name": "PlayFi Albireo Testnet",
            "rpc": "https://albireo-rpc.playfi.ai"
          },
          "3397901": {
            "name": "Funki Sepolia Sandbox",
            "rpc": "https://funki-testnet.alt.technology"
          },
          "3441005": {
            "name": "Manta Pacific Testnet",
            "rpc": "https://manta-testnet.calderachain.xyz/http"
          },
          "3441006": {
            "name": "Manta Pacific Sepolia Testnet",
            "rpc": "https://pacific-rpc.sepolia-testnet.manta.network/http"
          },
          "6038361": {
            "name": "Astar zkEVM Testnet zKyoto",
            "rpc": "https://rpc.startale.com/zkyoto"
          },
          "7777777": {
            "name": "Zora",
            "rpc": "https://rpc.zora.energy"
          },
          "11155111": {
            "name": "Sepolia",
            "rpc": "https://rpc.sepolia.org"
          },
          "11155420": {
            "name": "OP Sepolia",
            "rpc": "https://sepolia.optimism.io"
          },
          "28122024": {
            "name": "Ancient8 Testnet",
            "rpc": "https://rpcv2-testnet.ancient8.gg"
          },
          "41144114": {
            "name": "Otim Devnet",
            "rpc": "http://devnet.otim.xyz"
          },
          "111557560": {
            "name": "Cyber Testnet",
            "rpc": "https://cyber-testnet.alt.technology"
          },
          "161221135": {
            "name": "Plume Testnet",
            "rpc": "https://testnet-rpc.plumenetwork.xyz/http"
          },
          "168587773": {
            "name": "Blast Sepolia",
            "rpc": "https://sepolia.blast.io"
          },
          "245022926": {
            "name": "Neon EVM DevNet",
            "rpc": "https://devnet.neonevm.org"
          },
          "245022934": {
            "name": "Neon EVM MainNet",
            "rpc": "https://neon-proxy-mainnet.solana.p2p.org"
          },
          "666666666": {
            "name": "Degen",
            "rpc": "https://rpc.degen.tips"
          },
          "888888888": {
            "name": "Ancient8",
            "rpc": "https://rpc.ancient8.gg"
          },
          "999999999": {
            "name": "Zora Sepolia",
            "rpc": "https://sepolia.rpc.zora.energy"
          },
          "1313161554": {
            "name": "Aurora",
            "rpc": "https://mainnet.aurora.dev"
          },
          "1313161555": {
            "name": "Aurora Testnet",
            "rpc": "https://testnet.aurora.dev"
          },
          "1666600000": {
            "name": "Harmony One",
            "rpc": "https://rpc.ankr.com/harmony"
          },
          "1802203764": {
            "name": "Kakarot Sepolia",
            "rpc": "https://sepolia-rpc.kakarot.org"
          },
          "2716446429837000": {
            "name": "Dchain",
            "rpc": "https://dchain-2716446429837000-1.jsonrpc.sagarpc.io"
          },
          "11297108109": {
            "name": "Palm",
            "rpc": "https://palm-mainnet.public.blastapi.io"
          },
          "11297108099": {
            "name": "Palm Testnet",
            "rpc": "https://palm-mainnet.public.blastapi.io"
          },
          "37714555429": {
            "name": "Xai Testnet",
            "rpc": "https://testnet-v2.xai-chain.net/rpc"
          }
        }
    """.trimIndent()
}