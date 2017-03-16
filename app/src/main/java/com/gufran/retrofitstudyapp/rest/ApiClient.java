package com.gufran.retrofitstudyapp.rest;

import okhttp3.Credentials;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

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


    String credentials = Credentials.basic("aUsername", "aPassword");

    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    //.client(okHttpClient)
                    // .addConverterFactory(GsonConverterFactory.create())
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .build();
        }


//        OkHttpClient okHttpClient = new OkHttpClient.Builder()
//                .addInterceptor(new Interceptor() {
//                    @Override
//                    public okhttp3.Response intercept(Chain chain) throws IOException {
//                        Request originalRequest = chain.request();
//                        Request.Builder builder = originalRequest.newBuilder().header("Authorization",
//                                credentials);
//                        Request newRequest = builder.build();
//                        return chain.proceed(newRequest);
//                    }
//                }).build();



        return retrofit;
    }
}
