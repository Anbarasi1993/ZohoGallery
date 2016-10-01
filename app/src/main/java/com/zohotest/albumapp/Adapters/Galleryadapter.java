package com.zohotest.albumapp.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.zohotest.albumapp.Model.Gallery;
import com.zohotest.albumapp.R;

import java.util.ArrayList;
import java.util.List;



public class Galleryadapter extends RecyclerView.Adapter<Galleryadapter.ViewHolder> {
    private ArrayList<Gallery> photo;
    private Context context;

    public Galleryadapter(Context context,ArrayList<Gallery> photos) {
        this.photo = photos;
        this.context = context;
    }

    @Override
    public Galleryadapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gallery_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Galleryadapter.ViewHolder viewHolder, int i) {
        String url = photo.get(i).getGallery_photo_url();
        String[] urlArray = url.split("/");
        String imageid = urlArray[urlArray.length-1];
        String CommonurlFront="https://placeholdit.imgix.net/~text?txtsize=56&bg=";
        String Commonurlback="&txt=600%C3%97600&w=600&h=600";
        Picasso.with(context).load(CommonurlFront+imageid+Commonurlback).resize(240, 120).into(viewHolder.photos);
    }

    @Override
    public int getItemCount() {
        return photo.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView photos;
        public ViewHolder(View view) {
            super(view);

            photos = (ImageView) view.findViewById(R.id.gallery_image);
        }
    }

}
