package com.sandy.nytimes.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by USER on 3/29/2018.
 */

public class ResponseModel implements Parcelable
{

    @SerializedName("meta")
    @Expose
    private MetaModel meta;
    @SerializedName("docs")
    @Expose
    private List<DocModel> docs = null;
    public final static Parcelable.Creator<ResponseModel> CREATOR = new Creator<ResponseModel>() {


        @SuppressWarnings({
                "unchecked"
        })
        public ResponseModel createFromParcel(Parcel in) {
            return new ResponseModel(in);
        }

        public ResponseModel[] newArray(int size) {
            return (new ResponseModel[size]);
        }

    }
            ;

    protected ResponseModel(Parcel in) {
        this.meta = ((MetaModel) in.readValue((MetaModel.class.getClassLoader())));
        in.readList(this.docs, (DocModel.class.getClassLoader()));
    }

    public ResponseModel() {
    }

    public MetaModel getMeta() {
        return meta;
    }

    public void setMeta(MetaModel meta) {
        this.meta = meta;
    }

    public List<DocModel> getDocs() {
        return docs;
    }

    public void setDocs(List<DocModel> docs) {
        this.docs = docs;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(meta);
        dest.writeList(docs);
    }

    public int describeContents() {
        return 0;
    }

}