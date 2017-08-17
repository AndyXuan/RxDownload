package zlc.season.rxdownload3.http

import io.reactivex.Maybe
import io.reactivex.Observable
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.HEAD
import retrofit2.http.Url


interface RetrofitApi {

    @HEAD
    fun checkUrlWithHEAD(@Url url: String): Maybe<Response<Void>>

    @GET
    fun checkUrlWithGET(@Url url: String): Maybe<Response<Void>>


}