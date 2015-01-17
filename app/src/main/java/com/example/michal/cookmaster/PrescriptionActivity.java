package com.example.michal.cookmaster;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Michal on 2015-01-17.
 */
public class PrescriptionActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prescription_view);
    }
    public void prescriptionClick (View view) {
        Intent getPrescriptionScreen = new Intent(this, PrescriptionActivity.class);

        final int result = 1;

        startActivity(getPrescriptionScreen);
    }
}
