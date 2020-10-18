package com.example.myapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class MallFragment extends Fragment {

    ImageView image1;
    ImageView image2;
    ImageView image3;

    TextView text1;
    TextView text2;
    TextView textt3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.tch_asia_moll),
                R.drawable.asia_mall, getString(R.string.description_asia_mall),
                getString(R.string.con_asia_mall), getString(R.string.adress_asia_mall),
                getString(R.string.area_asia_moll)));

        places.add(new Place(getString(R.string.tch_dordoi_plaza),
                R.drawable.dordoi_plaza, getString(R.string.description_dordoi_plaza),
                getString(R.string.con_dordoi_plaza), getString(R.string.adress_dordoi_plaza),
                getString(R.string.area_dordoi_plaza)));

        places.add(new Place(getString(R.string.tch_beta),
                R.drawable.beta, getString(R.string.description_beta),
                getString(R.string.con_beta), getString(R.string.adress_beta),
                getString(R.string.area_beta)));

        places.add(new Place(getString(R.string.tch_gum),
                R.drawable.gum, getString(R.string.description_gum),
                getString(R.string.con_gum), getString(R.string.adress_gum),
                getString(R.string.area_gum)));


        View rootView = inflater.inflate(R.layout.places_list, container, false);

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                image1 = view.findViewById(R.id.image1);
                image2 = view.findViewById(R.id.image2);
                image3 = view.findViewById(R.id.image3);

                text1 = view.findViewById(R.id.text1);
                text2 = view.findViewById(R.id.text2);
                textt3 = view.findViewById(R.id.text3);


                if (image1.getVisibility() == View.VISIBLE) {
                    image1.setVisibility(View.GONE);
                } else {
                    image1.setVisibility(View.VISIBLE);
                }

                if (image2.getVisibility() == View.VISIBLE) {
                    image2.setVisibility(View.GONE);
                } else {
                    image2.setVisibility(View.VISIBLE);
                }

                if (image3.getVisibility() == View.VISIBLE) {
                    image3.setVisibility(View.GONE);
                } else {
                    image3.setVisibility(View.VISIBLE);
                }

                if (text1.getVisibility() == View.VISIBLE) {
                    text1.setVisibility(View.GONE);
                } else {
                    text1.setVisibility(View.VISIBLE);
                }

                if (text2.getVisibility() == View.VISIBLE) {
                    text2.setVisibility(View.GONE);
                } else {
                    text2.setVisibility(View.VISIBLE);
                }

                if (textt3.getVisibility() == View.VISIBLE) {
                    textt3.setVisibility(View.GONE);
                } else {
                    textt3.setVisibility(View.VISIBLE);
                }

            }
        });

        return rootView;

    }

}