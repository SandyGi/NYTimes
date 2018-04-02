package com.sandy.nytimes.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by USER on 3/29/2018.
 */

public class PersonModel implements Parcelable
{

    @SerializedName("organization")
    @Expose
    private String organization;
    @SerializedName("role")
    @Expose
    private String role;
    @SerializedName("rank")
    @Expose
    private Integer rank;
    @SerializedName("firstname")
    @Expose
    private String firstname;
    @SerializedName("lastname")
    @Expose
    private String lastname;
    public final static Parcelable.Creator<PersonModel> CREATOR = new Creator<PersonModel>() {


        @SuppressWarnings({
                "unchecked"
        })
        public PersonModel createFromParcel(Parcel in) {
            return new PersonModel(in);
        }

        public PersonModel[] newArray(int size) {
            return (new PersonModel[size]);
        }

    }
            ;

    protected PersonModel(Parcel in) {
        this.organization = ((String) in.readValue((String.class.getClassLoader())));
        this.role = ((String) in.readValue((String.class.getClassLoader())));
        this.rank = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.firstname = ((String) in.readValue((String.class.getClassLoader())));
        this.lastname = ((String) in.readValue((String.class.getClassLoader())));
    }

    public PersonModel() {
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(organization);
        dest.writeValue(role);
        dest.writeValue(rank);
        dest.writeValue(firstname);
        dest.writeValue(lastname);
    }

    public int describeContents() {
        return 0;
    }

}