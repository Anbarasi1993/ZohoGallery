package com.zohotest.albumapp.Model;

import com.google.gson.annotations.SerializedName;



public class Album {

    //Variables that are in our json
    @SerializedName("id")
    private int Album_ID;

    @SerializedName("userId")
    private int Album_User_ID;

    @SerializedName("title")
    private String Album_name;


    //Getters and setters
    public int getAlbum_ID() {
        return Album_ID;
    }

    public void setAlbum_ID(int albumID) {
        this.Album_ID = albumID;
    }

    public int getAlbum_user_ID() {
        return Album_User_ID;
    }

    public void setAlbum_user_ID(int albumuserID) {
        this.Album_User_ID = albumuserID;
    }


    public String getAlbum_name() {
        return Album_name;
    }

    public void setAlbum_name(String Albumname) {
        this.Album_name = Albumname;
    }


}
