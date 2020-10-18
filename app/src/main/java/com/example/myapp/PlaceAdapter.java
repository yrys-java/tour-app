package com.example.myapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Context context, ArrayList<Place> object) {
        super(context, 0, object);
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        final Place currentPlace = (Place) getItem(position);

        TextView textViewPlaces = convertView.findViewById(R.id.place_text);
        textViewPlaces.setText(currentPlace.getmPlace());

        TextView textView = convertView.findViewById(R.id.text1);
        textView.setText(currentPlace.getTextView1());

        final TextView textView2 = convertView.findViewById(R.id.text2);
        textView2.setText(currentPlace.getTextView2());

        textView2.setPaintFlags(textView2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG); //эта строка рисует линию вниз текста

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (textView2 != null) {
                    Uri number = Uri.parse("tel:" + currentPlace.textView2);
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    getContext().startActivity(callIntent);
                }
            }
        });

        TextView text3 = convertView.findViewById(R.id.text3);
        text3.setText(currentPlace.getTextView3());

        text3.setPaintFlags(text3.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG); //эта строка рисует линию вниз текста

        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + currentPlace.getTextView3());
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                getContext().startActivity(mapIntent);
            }

        });

        ImageView itemImageView = convertView.findViewById(R.id.item_image);
        itemImageView.setImageResource(currentPlace.getmImageResourseId());

        TextView textView4 = convertView.findViewById(R.id.place_text2);
        textView4.setText(currentPlace.getTextView4());


        return convertView;
    }
}
