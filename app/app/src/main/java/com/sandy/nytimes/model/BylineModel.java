package com.sandy.nytimes.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by USER on 3/29/2018.
 */

public class BylineModel implements Parcelable
{

    @SerializedName("person")
    @Expose
    private List<PersonModel> person = null;
    @SerializedName("original")
    @Expose
    private String original;
    public final static Parcelable.Creator<BylineModel> CREATOR = new Creator<BylineModel>() {


        @SuppressWarnings({
                "unchecked"
        })
        public BylineModel createFromParcel(Parcel in) {
            return new BylineModel(in);
        }

        public BylineModel[] newArray(int size) {
            return (new BylineModel[size]);
        }

    }
            ;

    protected BylineModel(Parcel in) {
        in.readList(this.person, (PersonModel.class.getClassLoader()));
        this.original = ((String) in.readValue((String.class.getClassLoader())));
    }

    public BylineModel() {
    }

    public List<PersonModel> getPerson() {
        return person;
    }

    public void setPerson(List<PersonModel> person) {
        this.person = person;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(person);
        dest.writeValue(original);
    }

    public int describeContents() {
        return 0;
    }

}