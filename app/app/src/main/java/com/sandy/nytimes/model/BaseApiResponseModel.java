package com.sandy.nytimes.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by USER on 3/29/2018.
 */

public class BaseApiResponseModel implements Parcelable {

    @SerializedName("copyright")
    @Expose
    private String copyright;
    @SerializedName("response")
    @Expose
    private ResponseModel response;
    public final static Parcelable.Creator<BaseApiResponseModel> CREATOR = new Creator<BaseApiResponseModel>() {


        @SuppressWarnings({
                "unchecked"
        })
        public BaseApiResponseModel createFromParcel(Parcel in) {
            return new BaseApiResponseModel(in);
        }

        public BaseApiResponseModel[] newArray(int size) {
            return (new BaseApiResponseModel[size]);
        }

    };

    protected BaseApiResponseModel(Parcel in) {
        this.copyright = ((String) in.readValue((String.class.getClassLoader())));
        this.response = ((ResponseModel) in.readValue((ResponseModel.class.getClassLoader())));
    }

    public BaseApiResponseModel() {
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public ResponseModel getResponse() {
        return response;
    }

    public void setResponse(ResponseModel response) {
        this.response = response;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(copyright);
        dest.writeValue(response);
    }

    public int describeContents() {
        return 0;
    }

}