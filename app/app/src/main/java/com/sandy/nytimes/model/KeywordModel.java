package com.sandy.nytimes.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by USER on 3/29/2018.
 */

public class KeywordModel implements Parcelable
{

    @SerializedName("isMajor")
    @Expose
    private String isMajor;
    @SerializedName("rank")
    @Expose
    private Integer rank;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("value")
    @Expose
    private String value;
    public final static Parcelable.Creator<KeywordModel> CREATOR = new Creator<KeywordModel>() {


        @SuppressWarnings({
                "unchecked"
        })
        public KeywordModel createFromParcel(Parcel in) {
            return new KeywordModel(in);
        }

        public KeywordModel[] newArray(int size) {
            return (new KeywordModel[size]);
        }

    }
            ;

    protected KeywordModel(Parcel in) {
        this.isMajor = ((String) in.readValue((String.class.getClassLoader())));
        this.rank = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.value = ((String) in.readValue((String.class.getClassLoader())));
    }

    public KeywordModel() {
    }

    public String getIsMajor() {
        return isMajor;
    }

    public void setIsMajor(String isMajor) {
        this.isMajor = isMajor;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(isMajor);
        dest.writeValue(rank);
        dest.writeValue(name);
        dest.writeValue(value);
    }

    public int describeContents() {
        return 0;
    }

}