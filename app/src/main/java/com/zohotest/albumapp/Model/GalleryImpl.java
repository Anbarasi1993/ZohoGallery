package com.zohotest.albumapp.Model;

import android.util.Log;

import com.zohotest.albumapp.Presenter.Gallerypresenter;
import com.zohotest.albumapp.Presenter.Galleryview;
import com.zohotest.albumapp.Utils.AlbumAPI;
import com.zohotest.albumapp.Utils.PhotoAPI;
import com.zohotest.albumapp.Utils.Root;

import java.util.ArrayList;
import java.util.List;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class GalleryImpl implements Gallerypresenter{


    Galleryview galleryview;
    public static GalleryImpl newInstance(Galleryview ggalleryview) {
        return new GalleryImpl(ggalleryview);
    }

    public GalleryImpl(Galleryview ggalleryview) {
        this.galleryview = ggalleryview;
    }



    public void get_gallery_datas(int Albumid){

        RestAdapter adapter = new RestAdapter.Builder()
                .setEndpoint(Root.URL)
                .build();

        PhotoAPI api = adapter.create(PhotoAPI.class);

        api.getPhotos(Albumid,new Callback<ArrayList<Gallery>>() {
            @Override
            public void success(ArrayList<Gallery> list, Response response) {


                galleryview.ShowPhotolist(list);
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }
}
