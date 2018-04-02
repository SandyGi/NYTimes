package com.sandy.nytimes.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by USER on 3/29/2018.
 */

public class MetaModel implements Parcelable
{

    @SerializedName("hits")
    @Expose
    private Integer hits;
    public final static Parcelable.Creator<MetaModel> CREATOR = new Creator<MetaModel>() {


        @SuppressWarnings({
                "unchecked"
        })
        public MetaModel createFromParcel(Parcel in) {
            return new MetaModel(in);
        }

        public MetaModel[] newArray(int size) {
            return (new MetaModel[size]);
        }

    }
            ;

    protected MetaModel(Parcel in) {
        this.hits = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    public MetaModel() {
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(hits);
    }

    public int describeContents() {
        return 0;
    }

}
