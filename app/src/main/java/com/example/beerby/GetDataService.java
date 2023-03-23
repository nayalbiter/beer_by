//Carmen Albiter

package com.example.beerby;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

//The endpoints are defined inside of an interface using special retrofit annotations to encode details about the parameters and request method.
public interface GetDataService {

    @GET("/breweries")
    Call<List<BreweryInfo>> getAllBreweries();

    @GET("/per_page=3")
    Call<List<BreweryInfo>> getPerPage();

    @GET("/by_city")
    Call<List<BreweryInfo>> getByCity();

    @GET("/by_state")
    Call<List<BreweryInfo>> getByState();

    @GET("/by_postal")
    Call<List<BreweryInfo>> getByZipCode();


}
