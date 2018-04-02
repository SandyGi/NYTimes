package com.sandy.nytimes.manager;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.sandy.nytimes.manager.database.StorageInf;
import com.sandy.nytimes.manager.network.ApiInterface;
import com.sandy.nytimes.manager.network.NetworkInf;
import com.sandy.nytimes.manager.network.ResponseCallBackListener;
import com.sandy.nytimes.manager.network.retrofit.ApiClient;
import com.sandy.nytimes.model.BaseApiResponseModel;
import com.sandy.nytimes.model.MultimediumModel;
import com.sandy.nytimes.utils.CommonMethod;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by USER on 3/31/2018.
 */

public class NYTimesManager {

    private static NYTimesManager nyTimesManager;
    private StorageInf storageInf;
    private NetworkInf networkInf;
    private Context context;
    private ResponseCallBackListener responseCallBackListener;
    private List<MultimediumModel> multimediumModelList;

    private NYTimesManager() {
        //Prevent form the reflection api.
        if (nyTimesManager != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    public NYTimesManager(Context context, StorageInf storageInf, NetworkInf networkInf) {
        this.context = context;
        this.storageInf = storageInf;
        this.networkInf = networkInf;
    }

    public synchronized static NYTimesManager getInstance(Context context, StorageInf storageInf, NetworkInf networkInf) {
        if (nyTimesManager == null) { //if there is no instance available... create new one
            nyTimesManager = new NYTimesManager(context, storageInf, networkInf);
        }
        return nyTimesManager;
    }

    public void SyncMedia(final ResponseCallBackListener callBackListener) {

        this.responseCallBackListener = callBackListener;
        if (CommonMethod.isNetworkAvailable(context)) {
            ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
            Call<BaseApiResponseModel> callGetArchiveDetail = apiInterface.getArchiveDetail();
            callGetArchiveDetail.enqueue(new Callback<BaseApiResponseModel>() {
                @Override
                public void onResponse(Call<BaseApiResponseModel> call, Response<BaseApiResponseModel> response) {
                    Log.e("onResponse", "@@@ " + response.message());
                    multimediumModelList = response.body().getResponse().getDocs().get(0).getMultimedia();
                    if (multimediumModelList != null) {
//                        storageInf.insertAllItem(response.body().getResponse().getDocs().get(0).getMultimedia());
                        new DataProcessAsyncTask().execute();
                        responseCallBackListener.onSuccess(multimediumModelList);
                    }
                }

                @Override
                public void onFailure(Call<BaseApiResponseModel> call, Throwable t) {
                    Log.e("onFailure", "@@@ " + t.getMessage());
                    responseCallBackListener.onFailure(t);
//                    new DataProcessAsyncTask().execute();
                }
            });
        }else{
            new GetProcessAsyncTask().execute();
        }

    }

    public List<MultimediumModel> getNYMedia() {

        return storageInf.getAllMediaInfo();
    }

    public class DataProcessAsyncTask extends AsyncTask<Void, Void,  Boolean>{
        @Override
        protected Boolean doInBackground(Void... voids) {
            storageInf.insertAllItem(multimediumModelList);

            return true;
        }

        @Override
        protected void onPostExecute(Boolean aBoolean) {
            super.onPostExecute(aBoolean);
            if (aBoolean){
//                responseCallBackListener.onSuccess(null);
            }
        }
    }

    public class GetProcessAsyncTask extends AsyncTask<Void, Void,  List<MultimediumModel>>{
        @Override
        protected List<MultimediumModel> doInBackground(Void... voids) {
            List<MultimediumModel> multimediumModelList = storageInf.getAllMediaInfo();
            return multimediumModelList;
        }

        @Override
        protected void onPostExecute(List<MultimediumModel> multimediumModelList) {
            super.onPostExecute(multimediumModelList);
            if (multimediumModelList != null){
                responseCallBackListener.onSuccess(multimediumModelList);
            }
        }
    }
}
