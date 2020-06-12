package logic.mania.covid19_tracker.api

import logic.mania.covid19_tracker.model.ApiResponse
import retrofit2.Response
import retrofit2.http.GET
/*developed by saif*/
interface Covid19IndiaApiService {
/**/
    @GET("/data.json")
    suspend fun getData(): Response<ApiResponse>

    companion object {
        const val BASE_URL = "https://api.covid19india.org/"
    }
}
