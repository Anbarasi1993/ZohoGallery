package com.zohotest.albumapp.Utils;

import com.zohotest.albumapp.Model.Album;
import com.zohotest.albumapp.Model.Gallery;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;


public interface PhotoAPI {

    @GET("/photos")
    public void getPhotos(@Query("albumId") int code, Callback<ArrayList<Gallery>> response);
}
