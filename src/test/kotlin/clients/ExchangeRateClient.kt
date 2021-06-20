package clients

import api.ExchangeRateAPI
import io.restassured.response.Response
import response.ExchangeAPIResponse
import utils.Utils

class ExchangeRateClient {

    val exchangeRateAPI = ExchangeRateAPI()
    var accessKey : String = Utils.getGlobalValue("ACCESS_KEY")

    fun executeExchangeRateAPI() : Response
    {
        return exchangeRateAPI.executeAPI("access_key" ,accessKey )
    }
}