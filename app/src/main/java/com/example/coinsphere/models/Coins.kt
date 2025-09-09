package com.example.coinsphere.models

import kotlin.collections.listOf

data class Coins(
    val number: Int,
    val image: String,
    val name: String,
    val price: Double
)

val coinsList = listOf(
    Coins(1, "https://s2.coinmarketcap.com/static/img/coins/200x200/1.png", "Bitcoin", 109797.37),
    Coins(2, "https://s2.coinmarketcap.com/static/img/coins/200x200/1973.png", "Ethereum", 4321.21),
    Coins(3, "https://s2.coinmarketcap.com/static/img/coins/200x200/825.png", "Tether", 1.0000),
    Coins(4, "https://s2.coinmarketcap.com/static/img/coins/200x200/52.png", "XRP", 2.8100),
    Coins(5, "https://es.coingape.com/wp-content/uploads/2022/06/Binance-coin-bnb-logo-1024x1024.png", "BNB", 845.0000),
    Coins(6, "https://avatars.githubusercontent.com/u/58729655?s=200&v=4", "Solana", 201.8500),
    Coins(7, "https://s2.coinmarketcap.com/static/img/coins/200x200/3408.png", "USDC", 0.9998),
    Coins(8, "https://s2.coinmarketcap.com/static/img/coins/200x200/74.png", "Dogecoin", 0.1320),
    Coins(9, "https://es.coingape.com/wp-content/uploads/2022/05/tron-trx-logo.png", "TRON", 0.3630),
    Coins(10, "https://cryptodelsol.com/wp-content/uploads/2022/08/polkadot-new-dot-logo.png", "Polkadot", 6.25)
)