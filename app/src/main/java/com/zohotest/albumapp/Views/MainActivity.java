package com.zohotest.albumapp.Views;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;

import com.zohotest.albumapp.Adapters.Albumadapter;
import com.zohotest.albumapp.Model.Album;
import com.zohotest.albumapp.Model.AlbumImpl;
import com.zohotest.albumapp.Model.ItemClickSupport;
import com.zohotest.albumapp.Presenter.Albumpresenter;
import com.zohotest.albumapp.Presenter.Albumview;
import com.zohotest.albumapp.R;
import com.zohotest.albumapp.Widgets.DividerItemDecoration;

import java.util.List;

public class MainActivity extends AppCompatActivity implements Albumview {

    RecyclerView Album_recycler_view;

    Albumpresenter albumpresenter;
    private LinearLayoutManager mLinearLayoutManager;
    List<Album> album;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mLinearLayoutManager = new LinearLayoutManager(getApplicationContext());
        mLinearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        Album_recycler_view= (RecyclerView) findViewById(R.id.Album_recycler_view);
        albumpresenter= AlbumImpl.newInstance(this);
        albumpresenter.get_Album_datas();

    }


    public void ShowAlbumlist(List<Album> albumList)
    {
        album = albumList;
        //add ItemDecoration
        Album_recycler_view.addItemDecoration(new DividerItemDecoration(MainActivity.this, R.drawable.divider));
        Album_recycler_view.setHasFixedSize(true);
        Album_recycler_view.setLayoutManager(mLinearLayoutManager);
        Album_recycler_view.setAdapter(new Albumadapter(album, R.layout.list_item_album, getApplicationContext()));

        ItemClickSupport.addTo(Album_recycler_view)
                .setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
                    @Override
                    public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                      Intent GotoGallery=new Intent(MainActivity.this,GalleryActivity.class);
                      GotoGallery.putExtra("AlbumID",album.get(position).getAlbum_ID());
                      startActivity(GotoGallery);
                    }
                });


    }











}
