package com.tmtbdpoly.cardviewandpp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.facebook.ads.*;



public class CardSeventh extends AppCompatActivity implements View.OnClickListener {



    private AdView adView;
    ImageView img1,img2,img3,img4,img5,img6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_seventh);


        //facebook audence ads show
        adView = new AdView(this, "433586950678992_434222627282091", AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();



        this.setTitle("Jobs");

        img1= findViewById(R.id.bdjobsId);
        img2 = findViewById(R.id.chakriId);
        img3 = findViewById(R.id.chakrikhoborId);
        img4 = findViewById(R.id.bdjb);
        img5 = findViewById(R.id.jagojobsId);
        img6 = findViewById(R.id.jobId);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
        img5.setOnClickListener(this);
        img6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.bdjobsId){
            Intent intent= new Intent(CardSeventh.this,webviewshow.class);
            intent.putExtra("name","bdjobs");
            startActivity(intent);
        }
        if (v.getId()==R.id.chakriId){
            Intent intent= new Intent(CardSeventh.this,webviewshow.class);
            intent.putExtra("name","chakri");
            startActivity(intent);
        }
        if (v.getId()==R.id.chakrikhoborId){
            Intent intent= new Intent(CardSeventh.this,webviewshow.class);
            intent.putExtra("name","chakrikhobor");
            startActivity(intent);
        }
        if (v.getId()==R.id.bdjb){
            Intent intent= new Intent(CardSeventh.this,webviewshow.class);
            intent.putExtra("name","bdjb");
            startActivity(intent);
        }
        if (v.getId()==R.id.jagojobsId){
            Intent intent= new Intent(CardSeventh.this,webviewshow.class);
            intent.putExtra("name","jagojobs");
            startActivity(intent);
        }
        if (v.getId()==R.id.jobId){
            Intent intent= new Intent(CardSeventh.this,webviewshow.class);
            intent.putExtra("name","job");
            startActivity(intent);
        }
    }
}
