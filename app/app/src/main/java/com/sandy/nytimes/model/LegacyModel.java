package com.sandy.nytimes.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by USER on 3/29/2018.
 */

public class LegacyModel implements Parcelable
{

    @SerializedName("thumbnailheight")
    @Expose
    private Integer thumbnailheight;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;
    @SerializedName("thumbnailwidth")
    @Expose
    private Integer thumbnailwidth;
    @SerializedName("xlargewidth")
    @Expose
    private Integer xlargewidth;
    @SerializedName("xlarge")
    @Expose
    private String xlarge;
    @SerializedName("xlargeheight")
    @Expose
    private Integer xlargeheight;
    @SerializedName("wide")
    @Expose
    private String wide;
    @SerializedName("widewidth")
    @Expose
    private Integer widewidth;
    @SerializedName("wideheight")
    @Expose
    private Integer wideheight;
    public final static Parcelable.Creator<LegacyModel> CREATOR = new Creator<LegacyModel>() {


        @SuppressWarnings({
                "unchecked"
        })
        public LegacyModel createFromParcel(Parcel in) {
            return new LegacyModel(in);
        }

        public LegacyModel[] newArray(int size) {
            return (new LegacyModel[size]);
        }

    };

    protected LegacyModel(Parcel in) {
        this.thumbnailheight = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.thumbnail = ((String) in.readValue((String.class.getClassLoader())));
        this.thumbnailwidth = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.xlargewidth = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.xlarge = ((String) in.readValue((String.class.getClassLoader())));
        this.xlargeheight = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.wide = ((String) in.readValue((String.class.getClassLoader())));
        this.widewidth = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.wideheight = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    public LegacyModel() {
    }

    public Integer getThumbnailheight() {
        return thumbnailheight;
    }

    public void setThumbnailheight(Integer thumbnailheight) {
        this.thumbnailheight = thumbnailheight;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Integer getThumbnailwidth() {
        return thumbnailwidth;
    }

    public void setThumbnailwidth(Integer thumbnailwidth) {
        this.thumbnailwidth = thumbnailwidth;
    }

    public Integer getXlargewidth() {
        return xlargewidth;
    }

    public void setXlargewidth(Integer xlargewidth) {
        this.xlargewidth = xlargewidth;
    }

    public String getXlarge() {
        return xlarge;
    }

    public void setXlarge(String xlarge) {
        this.xlarge = xlarge;
    }

    public Integer getXlargeheight() {
        return xlargeheight;
    }

    public void setXlargeheight(Integer xlargeheight) {
        this.xlargeheight = xlargeheight;
    }

    public String getWide() {
        return wide;
    }

    public void setWide(String wide) {
        this.wide = wide;
    }

    public Integer getWidewidth() {
        return widewidth;
    }

    public void setWidewidth(Integer widewidth) {
        this.widewidth = widewidth;
    }

    public Integer getWideheight() {
        return wideheight;
    }

    public void setWideheight(Integer wideheight) {
        this.wideheight = wideheight;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(thumbnailheight);
        dest.writeValue(thumbnail);
        dest.writeValue(thumbnailwidth);
        dest.writeValue(xlargewidth);
        dest.writeValue(xlarge);
        dest.writeValue(xlargeheight);
        dest.writeValue(wide);
        dest.writeValue(widewidth);
        dest.writeValue(wideheight);
    }

    public int describeContents() {
        return 0;
    }

}