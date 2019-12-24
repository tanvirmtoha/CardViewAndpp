package com.tmtbdpoly.cardviewandpp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.facebook.ads.*;

public class NonDepartment extends AppCompatActivity implements View.OnClickListener {


    private AdView adView;
    Button physics,chemistry,math,english;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_department);


        //facebook audence ads show
        adView = new AdView(this, "433586950678992_434222627282091", AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();


        physics  = findViewById(R.id.physicsId);
        chemistry  = findViewById(R.id.chemsitryId);
        math  = findViewById(R.id.mathId);
        english  = findViewById(R.id.englishId);

        physics.setOnClickListener(this);
        chemistry.setOnClickListener(this);
        math.setOnClickListener(this);
        english.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.physicsId){
            Intent intent = new Intent(NonDepartment.this,showText.class);
            intent.putExtra("name","physics");
            startActivity(intent);
        }
        if (v.getId()==R.id.chemsitryId){
            Intent intent = new Intent(NonDepartment.this,showText.class);
            intent.putExtra("name","chemistry");
            startActivity(intent);
        }
        if (v.getId()==R.id.mathId){
            Intent intent = new Intent(NonDepartment.this,showText.class);
            intent.putExtra("name","math");
            startActivity(intent);
        }
        if (v.getId()==R.id.englishId){
            Intent intent = new Intent(NonDepartment.this,showText.class);
            intent.putExtra("name","english");
            startActivity(intent);
        }
    }


}
