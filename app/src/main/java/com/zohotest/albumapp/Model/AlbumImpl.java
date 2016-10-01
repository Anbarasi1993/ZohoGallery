package com.zohotest.albumapp.Model;

import android.util.Log;

import com.zohotest.albumapp.Presenter.Albumpresenter;
import com.zohotest.albumapp.Presenter.Albumview;
import com.zohotest.albumapp.Utils.AlbumAPI;
import com.zohotest.albumapp.Utils.Root;
import java.util.List;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
public class AlbumImpl implements Albumpresenter {

    Albumview albumview;
    public static AlbumImpl newInstance(Albumview aalbumview) {
        return new AlbumImpl(aalbumview);
    }

    public AlbumImpl(Albumview aalbumview) {
        this.albumview = aalbumview;
    }



    public void get_Album_datas(){
        //While the app fetched data we are displaying a progress dialog
//        final ProgressDialog loading = ProgressDialog.show(albumview.getApplicationContext(),"Fetching Data","Please wait...",false,false);

        //Creating a rest adapter
        RestAdapter adapter = new RestAdapter.Builder()
                .setEndpoint(Root.URL)
                .build();

        //Creating an object of our api interface
        AlbumAPI api = adapter.create(AlbumAPI.class);

        //Defining the method
        api.getAlbum(new Callback<List<Album>>() {
            @Override
            public void success(List<Album> list, Response response) {
                //Dismissing the loading progressbar
//                loading.dismiss();

                Log.e("Albumresponse",""+list.get(0).getAlbum_name());

                //Calling a method to show the list
                albumview.ShowAlbumlist(list);
            }

            @Override
            public void failure(RetrofitError error) {
                //you can handle the errors here
            }
        });
    }

}
