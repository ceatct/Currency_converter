package com.rabbithole.currencyconverter.main

import com.rabbithole.currencyconverter.data.model.CurrencyResponse
import com.rabbithole.currencyconverter.util.Resource

interface MainRepository {

    suspend fun getRates(base: String): Resource<CurrencyResponse>
}