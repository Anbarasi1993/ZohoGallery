package com.zohotest.albumapp.Views;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.zohotest.albumapp.Adapters.Galleryadapter;
import com.zohotest.albumapp.Model.Gallery;
import com.zohotest.albumapp.Model.GalleryImpl;
import com.zohotest.albumapp.Presenter.Gallerypresenter;
import com.zohotest.albumapp.Presenter.Galleryview;
import com.zohotest.albumapp.R;

import java.util.ArrayList;
import java.util.List;

public class GalleryActivity extends AppCompatActivity implements Galleryview {
    RecyclerView Gallery_recycler_view;

    Gallerypresenter gallerypresenter;
    private GridLayoutManager mLinearLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
         Intent Get=getIntent();
         int albumid=Get.getIntExtra("AlbumID",0);
        gallerypresenter= GalleryImpl.newInstance(this);
        gallerypresenter.get_gallery_datas(albumid);
    }


    public void ShowPhotolist(ArrayList<Gallery> albumList)
    {
        Log.e("PhoneTest","");
        ArrayList<Gallery> photo = albumList;
//        Gallery_recycler_view.setHasFixedSize(true);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.Gallery_recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new Galleryadapter(getApplicationContext(), photo));
    }

}
