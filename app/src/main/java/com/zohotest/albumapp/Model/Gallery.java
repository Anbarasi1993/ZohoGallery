package com.zohotest.albumapp.Model;

import com.google.gson.annotations.SerializedName;



public class Gallery {

    //Variables that are in our json
    @SerializedName("albumId")
    private int Gallery_Album_ID;

    @SerializedName("id")
    private int Gallery_ID;

    @SerializedName("title")
    private String Gallery_photo_name;

    @SerializedName("url")
    private String Gallery_photo_url;

    @SerializedName("thumbnailUrl")
    private String Gallery_thumb_url;


    //Getters and setters
    public int getGallery_Album_ID() {
        return Gallery_Album_ID;
    }

    public void setGallery_Album_ID(int albumID) {
        this.Gallery_Album_ID = albumID;
    }

    public int getGallery_ID() {
        return Gallery_ID;
    }

    public void setGallery_ID(int albumuserID) {
        this.Gallery_ID = albumuserID;
    }

    public String getGallery_photo_name() {
        return Gallery_photo_name;
    }

    public void setGallery_photo_name(String photo_name) {
        this.Gallery_photo_name = photo_name;
    }

    public String getGallery_photo_url() {
        return Gallery_photo_url;
    }

    public void setGallery_photo_url(String photo_url) {
        this.Gallery_photo_url = photo_url;
    }

    public String getGallery_thumb_url() {
        return Gallery_thumb_url;
    }

    public void setGallery_thumb_url(String thumb_url) {
        this.Gallery_thumb_url = thumb_url;
    }
}
