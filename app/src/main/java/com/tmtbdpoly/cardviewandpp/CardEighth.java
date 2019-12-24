package com.tmtbdpoly.cardviewandpp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.facebook.ads.*;



public class CardEighth extends AppCompatActivity implements View.OnClickListener {


    private AdView adView;
    ImageView img1,img2,img3,img4,img5,img6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_eighth);


        //facebook audence ads show
        adView = new AdView(this, "433586950678992_434222627282091", AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();


        this.setTitle("University");


        img1= findViewById(R.id.duetId);
        img2 = findViewById(R.id.sustId);
        img3 = findViewById(R.id.justId);
        img4 = findViewById(R.id.ruId);
        img5 = findViewById(R.id.amieId);
        img6 = findViewById(R.id.kuId);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
        img5.setOnClickListener(this);
        img6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.duetId){
            Intent intent= new Intent(CardEighth.this,webviewshow.class);
            intent.putExtra("name","duet");
            startActivity(intent);
        }
        if (v.getId()==R.id.sustId){
            Intent intent= new Intent(CardEighth.this,webviewshow.class);
            intent.putExtra("name","sust");
            startActivity(intent);
        }
        if (v.getId()==R.id.justId){
            Intent intent= new Intent(CardEighth.this,webviewshow.class);
            intent.putExtra("name","just");
            startActivity(intent);
        }
        if (v.getId()==R.id.ruId){
            Intent intent= new Intent(CardEighth.this,webviewshow.class);
            intent.putExtra("name","ru");
            startActivity(intent);
        }
        if (v.getId()==R.id.amieId){
            Intent intent= new Intent(CardEighth.this,webviewshow.class);
            intent.putExtra("name","amie");
            startActivity(intent);
        }
        if (v.getId()==R.id.kuId){
            Intent intent= new Intent(CardEighth.this,webviewshow.class);
            intent.putExtra("name","ku");
            startActivity(intent);
        }
    }
}
