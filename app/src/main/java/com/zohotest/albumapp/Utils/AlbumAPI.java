package com.zohotest.albumapp.Utils;

import com.zohotest.albumapp.Model.Album;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

public interface AlbumAPI {


    @GET("/albums")
    public void getAlbum(Callback<List<Album>> response);
}
