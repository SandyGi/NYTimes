package com.sandy.nytimes.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by USER on 3/29/2018.
 */

public class HeadlineModel implements Parcelable
{

    @SerializedName("main")
    @Expose
    private String main;
    @SerializedName("print_headline")
    @Expose
    private String printHeadline;
    public final static Parcelable.Creator<HeadlineModel> CREATOR = new Creator<HeadlineModel>() {


        @SuppressWarnings({
                "unchecked"
        })
        public HeadlineModel createFromParcel(Parcel in) {
            return new HeadlineModel(in);
        }

        public HeadlineModel[] newArray(int size) {
            return (new HeadlineModel[size]);
        }

    }
            ;

    protected HeadlineModel(Parcel in) {
        this.main = ((String) in.readValue((String.class.getClassLoader())));
        this.printHeadline = ((String) in.readValue((String.class.getClassLoader())));
    }

    public HeadlineModel() {
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getPrintHeadline() {
        return printHeadline;
    }

    public void setPrintHeadline(String printHeadline) {
        this.printHeadline = printHeadline;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(main);
        dest.writeValue(printHeadline);
    }

    public int describeContents() {
        return 0;
    }

}