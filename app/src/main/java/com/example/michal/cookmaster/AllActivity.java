package com.example.michal.cookmaster;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Michal on 2015-01-17.
 */
public class AllActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all);

        String[] allListElements = {"Przepis 1", "Przepis 2",
                "Przepis 3", "Przepis 4", "Przepis 5", "Przepis 5", "Przepis 5", "Przepis 5", "Przepis 5", "Przepis 5"};

        ListAdapter listAdapter = new AllAdapter(this,allListElements);

        ListView allList = (ListView)findViewById(R.id.all_list);

        allList.setAdapter(listAdapter);

        allList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String favouritesPicked = "You selected";
                Toast.makeText(AllActivity.this, favouritesPicked, Toast.LENGTH_LONG).show();

            }
        });
    }



    public void addClick(View view) {
        Intent addViewIntent = new Intent(this,LoginActivity.class);

        final int result = 1;

        startActivity(addViewIntent);
    }

    public void favouritesClick(View view) {
        Intent addViewIntent = new Intent(this,FavouriteActivity.class);

        final int result = 1;

        startActivity(addViewIntent);
    }

    public void allClick(View view) {
        Intent addViewIntent = new Intent(this,AllActivity.class);

        final int result = 1;

        startActivity(addViewIntent);
    }
}
