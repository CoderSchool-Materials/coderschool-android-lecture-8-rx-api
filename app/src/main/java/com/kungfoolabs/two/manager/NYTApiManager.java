package com.kungfoolabs.two.manager;

import com.kungfoolabs.two.common.Constant;
import com.kungfoolabs.two.api.NewYorkTimesApi;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ckung on 2/21/17.
 */

public class NYTApiManager {
    private static NYTApiManager instance;

    private final NewYorkTimesApi service;

    public static NYTApiManager get() {
        if(instance == null) {
            instance = new NYTApiManager();
        }

        return instance;
    }

    public NYTApiManager() {
        service = new Retrofit.Builder()
                .baseUrl(Constant.BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(NewYorkTimesApi.class);
    }

    public NewYorkTimesApi getService() {
        return service;
    }
}
