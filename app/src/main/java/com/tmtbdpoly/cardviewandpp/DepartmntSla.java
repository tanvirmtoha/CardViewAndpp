package com.tmtbdpoly.cardviewandpp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


import com.facebook.ads.*;

public class DepartmntSla extends AppCompatActivity implements View.OnClickListener {


    private AdView adView;
    Button civilbtn,computerbtn,eeebtn,mechanicalbtn,textilebtn,ipebtn,foodbtn,architechbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departmnt_sla);



        //facebook audence ads show
        adView = new AdView(this, "433586950678992_434222627282091", AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();



        civilbtn = findViewById(R.id.civilId);
        computerbtn = findViewById(R.id.computerId);
        eeebtn = findViewById(R.id.electricalId);
        mechanicalbtn = findViewById(R.id.mechanicalId);
        textilebtn = findViewById(R.id.textileId);
        architechbtn = findViewById(R.id.architechtureId);
        foodbtn = findViewById(R.id.foodId);
        ipebtn = findViewById(R.id.ipeId);

        civilbtn.setOnClickListener(this);
        computerbtn.setOnClickListener(this);
        eeebtn.setOnClickListener(this);
        mechanicalbtn.setOnClickListener(this);
        textilebtn.setOnClickListener(this);
        architechbtn.setOnClickListener(this);
        foodbtn.setOnClickListener(this);
        ipebtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.civilId){
            Intent intent = new Intent(DepartmntSla.this,showText.class);
            intent.putExtra("name","civil");
            startActivity(intent);
        }
        if (v.getId()==R.id.computerId){
            Intent intent = new Intent(DepartmntSla.this,showText.class);
            intent.putExtra("name","computer");
            startActivity(intent);
        }
        if (v.getId()==R.id.electricalId){
            Intent intent = new Intent(DepartmntSla.this,showText.class);
            intent.putExtra("name","eee");
            startActivity(intent);
        }
        if (v.getId()==R.id.mechanicalId){
            Intent intent = new Intent(DepartmntSla.this,showText.class);
            intent.putExtra("name","mechanical");
            startActivity(intent);
        }
        if (v.getId()==R.id.textileId){
            Intent intent = new Intent(DepartmntSla.this,showText.class);
            intent.putExtra("name","textile");
            startActivity(intent);
        }
        if (v.getId()==R.id.architechtureId){
            Intent intent = new Intent(DepartmntSla.this,showText.class);
            intent.putExtra("name","architech");
            startActivity(intent);
        }
        if (v.getId()==R.id.foodId){
            Intent intent = new Intent(DepartmntSla.this,showText.class);
            intent.putExtra("name","food");
            startActivity(intent);
        }
        if (v.getId()==R.id.ipeId){
            Intent intent = new Intent(DepartmntSla.this,showText.class);
            intent.putExtra("name","ipe");
            startActivity(intent);
        }
    }


}
