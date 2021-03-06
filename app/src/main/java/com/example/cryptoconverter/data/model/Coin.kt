package com.example.cryptoconverter.data.model

enum class Crypto(val cryptoName: String) {
    ADA("cardano"),
    BCH("bitcoin-cash"),
    BTC("bitcoin"),
    DASH("dash"),
    DOGE("dogecoin"),
    ETH("ethereum"),
    LTC("litecoin"),
    NEO("neo"),
    USDT("tether"),
    XLM("stellar"),
    XMR("monero"),
    XRP("ripple")

    companion object {
        fun getByName(name: String): String {
            val nameCrypto = values().find {
                it.name == name
            } ?: ADA
            return nameCrypto.cryptoName
        }
    }
}