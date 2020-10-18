package com.example.myapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ParkFragment extends Fragment {

    TextView placeTextView;

    ImageView image1;
    ImageView image2;
    ImageView image3;

    TextView text1;
    TextView text2;
    TextView textt3;

    public ParkFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.name_pobeda),
                R.drawable.pobeda, getString(R.string.park_description_Pobeda),
                getString(R.string.contact_pobeda),getString(R.string.adress_pobeda),
                getString(R.string.area_pobeda)));

        places.add(new Place(getString(R.string.name_dubrobyi),
                R.drawable.dubrovyi, getString(R.string.description_dybobyi),
                getString(R.string.con_dub), getString(R.string.adress_dub),
                getString(R.string.area_dub)));

        places.add(new Place(getString(R.string.name_karagach),
                R.drawable.karagach, getString(R.string.descrip_karagach),
                getString(R.string.con_karagach), getString(R.string.adress_karagach),
                getString(R.string.area_karagach)));

        places.add(new Place(getString(R.string.name_molodeji),
                R.drawable.molodej, getString(R.string.descriprion_molodeji),
                getString(R.string.con_molodeji), getString(R.string.adress_molodeji),
                getString(R.string.area_molodeji)));


        places.add(new Place(getString(R.string.name_panfilov),
                R.drawable.panphilov, getString(R.string.description_panflov),
                getString(R.string.con_panfilov), getString(R.string.adress_ponfilov),
                getString(R.string.area_panfilov)));


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
