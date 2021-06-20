package tests

import clients.ExchangeRateClient
import io.restassured.RestAssured
import org.testng.annotations.Test

class ExchangeRateTest {
    var exchangeRateClient = ExchangeRateClient()

    @Test
    fun baseSetUpForExchangeRateTest(){
        print(exchangeRateClient.executeExchangeRateAPI().asPrettyString())

    }
}