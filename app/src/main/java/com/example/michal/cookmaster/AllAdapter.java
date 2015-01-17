package com.example.michal.cookmaster;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class AllAdapter extends ArrayAdapter <String> {
    public AllAdapter(Context context, String[] values) {
        super(context, R.layout.all_list_view, values);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater theInflater = LayoutInflater.from(getContext());

        View theView = theInflater.inflate(R.layout.all_list_view, parent, false);
        String favouritesListElements = getItem(position);
        TextView theTextView = (TextView) theView.findViewById(R.id.all_list_text);
        theTextView.setText(favouritesListElements);
        ImageView theImageView = (ImageView) theView.findViewById(R.id.imagine_view2);

        return theView;
    }
}
