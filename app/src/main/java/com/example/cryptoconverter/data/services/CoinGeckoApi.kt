package com.example.cryptoconverter.data.services

import retrofit2.http.GET
import retrofit2.http.Query

interface CoinGeckoApi {
    @GET("markets?")
    suspend fun exchangeValue(
        @Query("vs_currency") fiat: String, @Query("ids") crypto: String
    ): GeckoApiResponse
}