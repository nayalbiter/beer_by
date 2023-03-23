//Carmen Albiter
package com.example.beerby;

import com.google.gson.annotations.SerializedName;

//this class is used to store all the information from each brewery
public class BreweryInfo {

    @SerializedName("id")
    private String breweryId;

    @SerializedName("name")
    private String breweryName;

    @SerializedName("brewery_type")
    private String breweryType;

    @SerializedName("street")
    private String breweryStreet;

    @SerializedName("address_2")
    private String breweryAddress2;

    @SerializedName("address_3")
    private String breweryAddress3;

    @SerializedName("city")
    private String breweryCity;

    @SerializedName("state")
    private String breweryState;

    @SerializedName("county_province")
    private String breweryCounty;

    @SerializedName("postal_code")
    private String breweryZipCode;

    @SerializedName("country")
    private String breweryCountry;

    @SerializedName("longitude")
    private String longitude;

    @SerializedName("latitude")
    private String latitude;

    @SerializedName("phone")
    private String phone;

    @SerializedName("website_url")
    private String url;

    @SerializedName("updated_at")
    private String updated;

    @SerializedName("created_at")
    private String created;


    public BreweryInfo (String breweryId, String breweryName, String breweryType, String breweryStreet, String breweryAddress2, String breweryAddress3, String breweryCity, String breweryState, String breweryCounty, String breweryZipCode, String breweryCountry,  String longitude, String latitude, String phone,  String url, String updated, String created ) {

        this.breweryId = breweryId;
        this.breweryName = breweryName;
        this.breweryType = breweryType;
        this.breweryStreet =breweryStreet;
        this.breweryAddress2 = breweryAddress2;
        this.breweryAddress3 = breweryAddress3;
        this.breweryCity = breweryCity;
        this.breweryState = breweryState;
        this.breweryCounty = breweryCounty;
        this.breweryZipCode = breweryZipCode;
        this.breweryCountry = breweryCountry;
        this.longitude = longitude;
        this.latitude = latitude;
        this.phone = phone;
        this.url = url;
        this.updated = updated;
        this.created = created;
    }

    //setters and getters:

    //1. breweryId
    public String GetId() {
        return  breweryId;
    }

    public void SetId (String breweryId ) {
        this.breweryId = breweryId;
    }

    //2.breweryName
    public String GetName() {
        return  breweryName;
    }

    public void SetName (String breweryName ) {
        this.breweryName = breweryName;
    }

    //3.breweryType
    public String GetType() {
        return  breweryType;
    }

    public void SetType (String breweryType ) {
        this.breweryType = breweryType;
    }

    //4.breweryStreet
    public String GetStreet() {
        return  breweryStreet;
    }

    public void SetStreet (String breweryStreet ) {
        this.breweryStreet =breweryStreet;
    }

    //5.breweryAddress2
    public String GetAddress2() {
        return  breweryAddress2;
    }

    public void SetAddress2 (String breweryAddress2 ) {
        this.breweryAddress2 = breweryAddress2;
    }

    //6.breweryAddress3
    public String GetAddress3() {
        return  breweryAddress3;
    }

    public void SetAddress3 (String breweryAddress3 ) {
        this.breweryAddress3 = breweryAddress3;
    }


    //7.breweryCity
    public String GetCity() {
        return  breweryCity;
    }

    public void SetCity (String breweryCity ) {
        this.breweryCity = breweryCity;
    }

    //8.breweryState
    public String GetState() {
        return  breweryState;
    }

    public void SetState (String breweryState ) {
        this.breweryState = breweryState;
    }

    //9.breweryCounty
    public String GetCounty() {
        return  breweryCounty;
    }

    public void SetCounty (String breweryCounty ) {
        this.breweryCounty = breweryCounty;
    }

    //10.breweryZipCode
    public String GetZipCode() {
        return  breweryZipCode;
    }

    public void SetZipCode (String breweryZipCode ) {
        this.breweryZipCode = breweryZipCode;
    }

    //11.breweryCountry
    public String GetCountry() {
        return  breweryCountry;
    }

    public void SetCountry (String breweryCountry ) {
        this.breweryCountry = breweryCountry;
    }

    //12.longitude
    public String GetLongitude() {
        return  longitude;
    }

    public void SetLongitude (String longitude ) {
        this.longitude = longitude;
    }

    //13.latitude
    public String GetLatitude() {
        return  latitude;
    }

    public void SetLatitude (String latitude ) {
        this.latitude = latitude;
    }

    //14.phone
    public String GetPhone() {
        return  phone;
    }

    public void SetPhone (String phone ) {
        this.phone = phone;
    }

    //15.url
    public String GetURL() {
        return url;
    }

    public void SetURL (String url ) {
        this.url = url;
    }

    //16.updated
    public String GetUpdated() {
        return updated;
    }

    public void SetUpdated (String updated ) {
        this.updated = updated;
    }

    //17.created
    public String GetCreated() {
        return created;
    }

    public void SetCreated (String created ) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "BreweryInfo{" +
                "breweryId='" + breweryId + '\'' +
                ", breweryName='" + breweryName + '\'' +
                ", breweryType='" + breweryType + '\'' +
                ", breweryStreet='" + breweryStreet + '\'' +
                ", breweryAddress2='" + breweryAddress2 + '\'' +
                ", breweryAddress3='" + breweryAddress3 + '\'' +
                ", breweryCity='" + breweryCity + '\'' +
                ", breweryState='" + breweryState + '\'' +
                ", breweryCounty='" + breweryCounty + '\'' +
                ", breweryZipCode='" + breweryZipCode + '\'' +
                ", breweryCountry='" + breweryCountry + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", phone='" + phone + '\'' +
                ", url='" + url + '\'' +
                ", updated='" + updated + '\'' +
                ", created='" + created + '\'' +
                '}';
    }
}
