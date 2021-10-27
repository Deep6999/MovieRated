package com.devwonk.movierated.request;

import com.devwonk.movierated.utils.Credentials;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Servicey {
private static     Retrofit.Builder retrofitB = new Retrofit.Builder()
            .baseUrl(Credentials.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create());
private static Retrofit retrofit = retrofitB.build();
private static MovieApi movieApi = retrofit.create(MovieApi.class);

public  MovieApi getMovieApi(){
    return movieApi;
}
}
