package com.kungfoolabs.two.api;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by ckung on 2/21/17.
 */

public interface NewYorkTimesApi {
    @GET("articlesearch.json")
    public Observable<NYTResponse> getArticleList(@Query("q") String query, @Query("sort") String sort, @Query("apikey") String apiKey);
}
