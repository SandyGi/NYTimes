package com.sandy.nytimes.view.fragment;

import android.app.ProgressDialog;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sandy.nytimes.R;
import com.sandy.nytimes.adapter.MultiMediaAdapter;
import com.sandy.nytimes.application.NYTimeApplication;
import com.sandy.nytimes.databinding.ArchiveFragmentBinding;
import com.sandy.nytimes.manager.network.ResponseCallBackListener;
import com.sandy.nytimes.model.BaseApiResponseModel;
import com.sandy.nytimes.model.MultimediumModel;
import com.sandy.nytimes.viewmodel.MediaViewModel;

import java.util.List;

import retrofit2.Response;


/**
 * Created by Sandeep on 5/3/2017.
 */

public class ArchiveFragment extends Fragment implements ResponseCallBackListener {

    @Nullable
    private ArchiveFragmentBinding archiveFragmentBinding;

    private ProgressDialog progressDialog;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        archiveFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.archive_fragment, container, false);

//        return inflater.inflate(R.layout.archive_fragment, container, false);
        return archiveFragmentBinding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle(getActivity().getResources().getString(R.string.nav_archive));
        inti();
    }

    private void inti() {
        progressDialog = new ProgressDialog(getActivity());
        progressDialog.setMessage("Loading please wait...");
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.show();
        NYTimeApplication.getInstance().getNyTimesManager().SyncMedia(ArchiveFragment.this);

        Log.e("hhoo", "@@@");
    }

    @Override
    public void onSuccess(List<MultimediumModel> multimediumModelList) {
        progressDialog.dismiss();

        if (multimediumModelList != null) {

            MultiMediaAdapter multiMediaAdapter = new MultiMediaAdapter(getActivity(), multimediumModelList);

            RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
            archiveFragmentBinding.rvArchiveList.hasFixedSize();
            archiveFragmentBinding.rvArchiveList.setLayoutManager(linearLayoutManager);
            archiveFragmentBinding.rvArchiveList.setItemAnimator(new DefaultItemAnimator());
            archiveFragmentBinding.rvArchiveList.setAdapter(multiMediaAdapter);
//        MediaViewModel mediaViewModel = new MediaViewModel();
//        mediaViewModel.getAllArchiveMedia();
        }
    }

    @Override
    public void onFailure(Throwable t) {
//        progressDialog.dismiss();
        NYTimeApplication.getInstance().getNyTimesManager().SyncMedia(ArchiveFragment.this);

    }
}
