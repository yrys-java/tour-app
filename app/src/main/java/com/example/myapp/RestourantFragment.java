package com.example.myapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestourantFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.name_res_shtanbroy),
                R.drawable.shut,getString(R.string.descriprion_res_shanbroy),
                getString(R.string.con_res_shanbroi),getString(R.string.adress_res_shtanbroy),
               getString(R.string.area_res_shtanbroy)));

        places.add(new Place(getString(R.string.name_res_diyar),
                R.drawable.diayr, getString(R.string.description_res_diyar),
                getString(R.string.con_res_diyar),getString(R.string.adress_res_diyar),
                getString(R.string.area_res_diyar)));

        places.add(new Place(getString(R.string.name_res_arzu),
                R.drawable.arzu, getString(R.string.description_res_arzu),
                getString(R.string.con_res_arzu) , getString(R.string.adress_res_arzu),
                getString(R.string.area_res_arzu)));

        places.add(new Place(getString(R.string.name_res_frunze),
                R.drawable.frunze, getString(R.string.description_res_frunze),
                getString(R.string.con_res_frunze), getString(R.string.adress_res_frunze),
                getString(R.string.area_res_frunze)));


        places.add(new Place(getString(R.string.name_res_12),
                R.drawable.bar, getString(R.string.description_res_bar),
                getString(R.string.con_res_bar), getString(R.string.adress_res_bar),
                getString(R.string.area_res_bar)));


        View rootView = inflater.inflate(R.layout.places_list, container, false);

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        String s;


//            image1 = rootView.findViewById(R.id.image1);
//            image2 = rootView.findViewById(R.id.image2);
//            image3 = rootView.findViewById(R.id.image3);
//
//            text1 = rootView.findViewById(R.id.text1);
//            text2 = rootView.findViewById(R.id.text2);
//            textt3 = rootView.findViewById(R.id.text3);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//
//                image1.setVisibility(View.VISIBLE);
//                image2.setVisibility(View.VISIBLE);
//                image3.setVisibility(View.VISIBLE);
//
//                text1.setVisibility(View.VISIBLE);
//                text2.setVisibility(View.VISIBLE);
//                textt3.setVisibility(View.VISIBLE);
//            }
//        });

        return rootView;


    }


}