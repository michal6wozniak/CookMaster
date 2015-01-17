package com.example.michal.cookmaster;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Michal on 2015-01-17.
 */
public class LoginActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);
    }

    public void loginClick(View view) {
        Intent addViewIntent = new Intent(this,AddActivity.class);

        final int result = 1;

        startActivity(addViewIntent);
    }

}
