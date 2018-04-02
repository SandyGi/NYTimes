package com.sandy.nytimes.manager.network;

import com.sandy.nytimes.model.BaseApiResponseModel;
import com.sandy.nytimes.model.MultimediumModel;

import java.util.List;

import retrofit2.Response;

/**
 * Created by USER on 3/31/2018.
 */

public interface ResponseCallBackListener {
    public void onSuccess(List<MultimediumModel> multimediumModelList);
    public void onFailure(Throwable t);
}
