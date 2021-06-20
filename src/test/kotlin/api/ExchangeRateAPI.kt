package api
import io.restassured.RestAssured
import io.restassured.RestAssured.given
import io.restassured.response.Response
import utils.Utils

class ExchangeRateAPI {


    fun executeAPI(queryParamKey : String , queryParamValue : String) : Response {
        var baseURL: String = Utils.getGlobalValue("BASE_URL")

        return  given().baseUri(baseURL).`when`().
        queryParam(queryParamKey , queryParamValue)
            .get()
            .thenReturn()
    }



}