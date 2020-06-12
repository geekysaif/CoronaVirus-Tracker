package logic.mania.covid19_tracker.model

import com.squareup.moshi.Json

data class ApiResponse(
    @Json(name = "statewise")
    val stateWiseDetails: List<Details>
)