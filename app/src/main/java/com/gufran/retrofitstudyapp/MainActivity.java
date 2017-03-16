package com.gufran.retrofitstudyapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.gufran.retrofitstudyapp.model.ActionResponse;
import com.gufran.retrofitstudyapp.rest.ApiClient;
import com.gufran.retrofitstudyapp.rest.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);

        Call<ActionResponse> call = apiService.getRadioStation();

        Log.d(TAG, "onCreate: Calling Web service...");
        call.enqueue(new Callback<ActionResponse>() {
            @Override
            public void onResponse(Call<ActionResponse> call, Response<ActionResponse> response) {
                Log.d(TAG, "onResponse: Code " + response.code());
                Log.d(TAG, "onResponse: Header Size " + response.headers().size());
                Log.d(TAG, "onResponse:Error Body " + response.errorBody());
                Log.d(TAG, "onResponse: Body " + response.body().getUserid());

            }

            @Override
            public void onFailure(Call<ActionResponse> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }


}
