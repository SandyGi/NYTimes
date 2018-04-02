package com.sandy.nytimes.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by USER on 3/29/2018.
 */
@Entity(tableName = "media")
public class MultimediumModel implements Parcelable
{

    @SerializedName("width")
    @Expose
    private Integer width;
    @PrimaryKey
    @NonNull
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("rank")
    @Expose
    private Integer rank;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("subtype")
    @Expose
    private String subtype;
//    @SerializedName("legacy")
//    @Expose
//    private LegacyModel legacy;
    @SerializedName("type")
    @Expose
    private String type;
    public final static Parcelable.Creator<MultimediumModel> CREATOR = new Creator<MultimediumModel>() {


        @SuppressWarnings({
                "unchecked"
        })
        public MultimediumModel createFromParcel(Parcel in) {
            return new MultimediumModel(in);
        }

        public MultimediumModel[] newArray(int size) {
            return (new MultimediumModel[size]);
        }

    }
            ;

    protected MultimediumModel(Parcel in) {
        this.width = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.rank = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.height = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.subtype = ((String) in.readValue((String.class.getClassLoader())));
//        this.legacy = ((LegacyModel) in.readValue((LegacyModel.class.getClassLoader())));
        this.type = ((String) in.readValue((String.class.getClassLoader())));
    }

    public MultimediumModel() {
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

//    public LegacyModel getLegacy() {
//        return legacy;
//    }
//
//    public void setLegacy(LegacyModel legacy) {
//        this.legacy = legacy;
//    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(width);
        dest.writeValue(url);
        dest.writeValue(rank);
        dest.writeValue(height);
        dest.writeValue(subtype);
//        dest.writeValue(legacy);
        dest.writeValue(type);
    }

    public int describeContents() {
        return 0;
    }

}