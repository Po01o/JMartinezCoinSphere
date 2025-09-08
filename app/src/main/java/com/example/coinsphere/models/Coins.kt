package com.example.coinsphere.models

import kotlin.collections.listOf

data class Coins(
    val number: Int,
    val image: String,
    val name: String,
    val price: Double
)

val coinsList = listOf(
    Coins(1, "https://upload.wikimedia.org/wikipedia/commons/thumb/4/46/Bitcoin.svg/1200px-Bitcoin.svg.png", "Bitcoin", 109797.37),
    Coins(2, "", "Ethereum", 4321.21),
    Coins(3, "", "Tether", 1.0000),
    Coins(4, "", "XRP", 2.8100),
    Coins(5, "", "BNB", 845.0000),
    Coins(6, "", "Solana", 201.8500),
    Coins(7, "", "USDC", 0.9998),
    Coins(8, "", "Dogecoin", 0.1320),
    Coins(9, "", "TRON", 0.3630)
)