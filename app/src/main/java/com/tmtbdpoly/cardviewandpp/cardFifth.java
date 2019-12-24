package com.tmtbdpoly.cardviewandpp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.facebook.ads.*;

public class cardFifth extends AppCompatActivity implements View.OnClickListener {


    private AdView adView;
    Button joggotabtn,seatbtn,departmentbtn,syllabusbtn,numberbi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_fifth);



        //facebook audence ads show
        adView = new AdView(this, "433586950678992_434222627282091", AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();



        this.setTitle("Duet");

        joggotabtn = findViewById(R.id.joggotaId);
        seatbtn = findViewById(R.id.seatId);
        numberbi = findViewById(R.id.numberbivaId);
        departmentbtn = findViewById(R.id.departmentId);
        syllabusbtn = findViewById(R.id.syllabusId);


        joggotabtn.setOnClickListener(this);
        seatbtn.setOnClickListener(this);
        numberbi.setOnClickListener(this);
        departmentbtn.setOnClickListener(this);
        syllabusbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.joggotaId) {

            Intent intent = new Intent(cardFifth.this, showText.class);
            intent.putExtra("name","joggota");
            startActivity(intent);
        }
        if (v.getId() == R.id.seatId) {
            Intent intent = new Intent(cardFifth.this, showText.class);
            intent.putExtra("name","seat");
            startActivity(intent);
        }
        if (v.getId() == R.id.numberbivaId) {
            Intent intent = new Intent(cardFifth.this, showText.class);
            intent.putExtra("name","numberb");
            startActivity(intent);
        }
        if (v.getId() == R.id.departmentId) {
            Intent intent = new Intent(cardFifth.this, showText.class);
            intent.putExtra("name","department");
            startActivity(intent);
        }
        if (v.getId() == R.id.syllabusId) {
            Intent intent = new Intent(cardFifth.this,syllabus.class);
            startActivity(intent);
        }
    }
}
