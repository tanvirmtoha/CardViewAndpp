package com.tmtbdpoly.cardviewandpp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


import com.facebook.ads.*;

public class syllabus extends AppCompatActivity implements View.OnClickListener {


    private AdView adView;
    Button nonsla, depsla;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);


        //facebook audence ads show
        adView = new AdView(this, "433586950678992_434222627282091", AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();


        nonsla = findViewById(R.id.nondepartmentsylaId);
        depsla = findViewById(R.id.departmentsylaId);

        nonsla.setOnClickListener(this);
        depsla.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId()== R.id.nondepartmentsylaId){
            Intent intent = new Intent(syllabus.this,NonDepartment.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.departmentsylaId){
            Intent intent = new Intent(syllabus.this,DepartmntSla.class);
            startActivity(intent);
        }
    }


}
