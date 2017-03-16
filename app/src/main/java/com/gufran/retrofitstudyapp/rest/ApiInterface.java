package com.gufran.retrofitstudyapp.rest;

import com.gufran.retrofitstudyapp.model.ActionResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Description ...
 *
 * @author Gufran Khurshid
 * @version 1.0
 * @since 3/16/17
 */

public interface ApiInterface {
    @GET("UserPrefrenceAction?radiostationid=http://108.61.73.117:14022&userid=IORT5637&instruction=voteup")
    Call<ActionResponse> getRadioStation();

//    @GET("movie/{id}")
//    Call<MoviesResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);
}
