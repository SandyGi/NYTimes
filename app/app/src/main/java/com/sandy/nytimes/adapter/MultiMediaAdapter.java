package com.sandy.nytimes.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.sandy.nytimes.R;
import com.sandy.nytimes.databinding.RowMultimediaListBinding;
import com.sandy.nytimes.model.MultimediumModel;

import java.util.List;

/**
 * Created by USER on 3/31/2018.
 */

public class MultiMediaAdapter extends RecyclerView.Adapter<MultiMediaAdapter.MultiMediaViewHolder>{
    private Context mContext;
    private List<MultimediumModel> multimediumModelList;

    public MultiMediaAdapter(Context context, List<MultimediumModel> multimediumModels){

        this.mContext = context;
        this.multimediumModelList = multimediumModels;
    }

    @Override
    public MultiMediaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        final RowMultimediaListBinding rowMultimediaListBinding = DataBindingUtil.inflate(layoutInflater, R.layout.row_multimedia_list, parent, false);

        return new MultiMediaViewHolder(rowMultimediaListBinding.getRoot(), rowMultimediaListBinding);
    }

    @Override
    public void onBindViewHolder(MultiMediaViewHolder holder, int position) {
        holder.rowMultimediaListBinding.tvImageUrl.setText("Image Type" +multimediumModelList.get(position).getUrl());
        Glide.with(mContext).load("http://www.nytimes.com/"+multimediumModelList.get(position).getUrl())
                .thumbnail(0.5f)
                .into(holder.rowMultimediaListBinding.ivMediaImage);
        holder.rowMultimediaListBinding.tvMultiMediaType.setText(multimediumModelList.get(position).getSubtype());
    }

    @Override
    public int getItemCount() {
        return multimediumModelList.size();
    }

    public class MultiMediaViewHolder extends RecyclerView.ViewHolder{

        final RowMultimediaListBinding rowMultimediaListBinding;

        public MultiMediaViewHolder(View itemView, RowMultimediaListBinding rowMultimediaListBinding) {
            super(itemView);
            this.rowMultimediaListBinding = rowMultimediaListBinding;
        }
    }
}
