package com.gufran.retrofitstudyapp.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Description ...
 *
 * @author Gufran Khurshid
 * @version 1.0
 * @since 3/16/17
 */

public class ApiClient {
    public static final String BASE_URL = "http://1.worldrapradio.appspot.com/";
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
