package app.bo.com.ucb.retrofitsuspenducb

import retrofit2.http.GET

interface EndPointApi {
    @GET(ConstantsRestApi.POSTS)
    suspend fun getAllPost(): List<Post>

}