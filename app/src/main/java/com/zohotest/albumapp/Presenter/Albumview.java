package com.zohotest.albumapp.Presenter;

import android.content.Context;

import com.zohotest.albumapp.Model.Album;

import java.util.List;


public interface Albumview {

    Context getApplicationContext();

    void ShowAlbumlist(List<Album> albumList);
}
