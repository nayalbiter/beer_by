//Carmen Albiter

package com.example.beerby;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


//The endpoints are defined inside of an interface using special retrofit annotations to encode details about the parameters and request method.
public interface GetDataService {

    @GET("/breweries")
    Call<List<BreweryInfo>> getAllBreweriesByCity(@Query("by_city") String cityName);

    @GET("/breweries")
    Call<List<BreweryInfo>> getAllBreweriesByState(@Query("by_state") String stateName);

    @GET("/breweries")
    Call<List<BreweryInfo>> getAllBreweriesByZip(@Query("by_postal") String zipCode);




}
