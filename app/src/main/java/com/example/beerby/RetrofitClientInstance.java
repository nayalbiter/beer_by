//Carmen Albiter
package com.example.beerby;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//this class was created to issue network requests to a REST API with Retrofit,
//an instance was created using the Retrofit.Builder class and configure it with a base URL.

public class RetrofitClientInstance {

    private static Retrofit retrofit;
    private static final String BASE_URL = "https://api.openbrewerydb.org/";

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
