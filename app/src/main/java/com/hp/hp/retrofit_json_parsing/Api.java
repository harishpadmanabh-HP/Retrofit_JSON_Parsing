package com.hp.hp.retrofit_json_parsing;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    //Retrofic divides url in 2 parts.base url and the apicall .api call is the last the section of url.
    //5.now define base url
    String BASE_URL = "https://simplifiedcoding.net/demos/";
    //url accepts get method and give us dome data .so we create @GET request
    //6.call marvel from base url
    @GET("marvel")
    //return type is call.list is call type.Hero is the object with data json arrays.make getheroes();
    //7.go to main activity and create retrofit object
    Call<List<Hero>> getHeroes();

}
