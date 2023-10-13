package com.rabbithole.currencyconverter.data

import com.rabbithole.currencyconverter.data.model.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {

    @GET("/latest?access_key=5eb672eb73f64f5a78e9608aa2738874")
    suspend fun getRates(
        @Query("base") base: String
    ): Response<CurrencyResponse>
}