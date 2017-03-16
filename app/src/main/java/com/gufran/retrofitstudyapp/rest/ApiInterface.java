package com.gufran.retrofitstudyapp.rest;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Description ...
 *
 * @author Gufran Khurshid
 * @version 1.0
 * @since 3/16/17
 */

public interface ApiInterface {
    // @GET("UserPrefrenceAction?radiostationid=http://108.61.73.117:14022&userid=IORT5637&instruction=voteup")
    //Call<ActionResponse> getRadioStation();

    @GET("UserPrefrenceAction?radiostationid=http://108.61.73.117:14022&userid=IORT5637&instruction=voteup")
    Call<String> getRadioStationRaw();

    ////SAMPLES
//    @GET("users/{name}/commits")
//    Call<List<Commit>> getCommitsByName(@Path("name") String name)


//    @GET("users")
//    Call<User> getUserById(@Query("id") Integer id)


//    @POST("users")
//    Call<User> postUser(@Body User user)


//    @GET("user")
//    Call<UserDetails> getUserDetails(@Header("Authorization") String credentials


//    @GET("movie/{id}")
//    Call<MoviesResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);

    //@GET("movie/{id}")
    // Call<MoviesResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);
}
