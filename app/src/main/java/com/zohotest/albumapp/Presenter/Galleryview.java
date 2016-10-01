package com.zohotest.albumapp.Presenter;

import android.content.Context;

import com.zohotest.albumapp.Model.Album;
import com.zohotest.albumapp.Model.Gallery;

import java.util.ArrayList;
import java.util.List;

public interface Galleryview {

    Context getApplicationContext();
    void ShowPhotolist(ArrayList<Gallery> photoList);
}
