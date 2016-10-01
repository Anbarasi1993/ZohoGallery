package com.zohotest.albumapp.Adapters;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.zohotest.albumapp.Model.Album;
import com.zohotest.albumapp.R;

import java.util.List;



public class Albumadapter extends RecyclerView.Adapter<Albumadapter.AlbumViewHolder> {

    private List<Album> Al_bum;
    private int rowLayout;
    private Context context;



    public static class AlbumViewHolder extends RecyclerView.ViewHolder {
        LinearLayout albumLayout;
        TextView albumTitle;

        public AlbumViewHolder(View v) {
            super(v);
            albumLayout = (LinearLayout) v.findViewById(R.id.Album_layout);
            albumTitle = (TextView) v.findViewById(R.id.Album_title_item);
        }
    }

    public Albumadapter(List<Album> album, int rowLayout, Context context) {
        Log.e("AlbumSize",""+album.size());
        this.Al_bum = album;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public Albumadapter.AlbumViewHolder onCreateViewHolder(ViewGroup parent,
                                                            int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new AlbumViewHolder(view);
    }


    @Override
    public void onBindViewHolder(AlbumViewHolder holder, final int position) {
        holder.albumTitle.setText(Al_bum.get(position).getAlbum_name());

    }

    @Override
    public int getItemCount() {

        return Al_bum.size();
    }
}
