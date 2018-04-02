package com.sandy.nytimes.manager.network;

import com.sandy.nytimes.model.BaseApiResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/**
 * Created by sandeep on 30-03-2018.
 */

public interface ApiInterface {

    @Headers("apikey: 3817810533594af6a840bc7c9a30a416")
    @GET("archive/v1/2016/1.json")
    Call<BaseApiResponseModel> getArchiveDetail();
}
