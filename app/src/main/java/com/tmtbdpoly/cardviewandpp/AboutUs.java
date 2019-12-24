package com.tmtbdpoly.cardviewandpp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.facebook.ads.*;


public class AboutUs extends AppCompatActivity implements View.OnClickListener {

    private InterstitialAd interstitialAd;
    private AdView adView;
    private ImageView img1,img2,img3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        // Initialize the Audience Network SDK
        AudienceNetworkAds.initialize(this);

        interstitialAd = new InterstitialAd(this, "433586950678992_446444629393224");

        interstitialAd.setAdListener(new InterstitialAdListener() {

            @Override
            public void onError(Ad ad, AdError adError) {

            }

            @Override
            public void onAdLoaded(Ad ad) {
                interstitialAd.show();
            }

            @Override
            public void onAdClicked(Ad ad) {

            }

            @Override
            public void onLoggingImpression(Ad ad) {

            }

            @Override
            public void onInterstitialDisplayed(Ad ad) {

            }

            @Override
            public void onInterstitialDismissed(Ad ad) {

            }
        });
        // load the ad
        interstitialAd.loadAd();




        //facebook audence ads show
        adView = new AdView(this, "433586950678992_434222627282091", AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();


        //hiding the title bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //actionbar hide
        getSupportActionBar().hide();

        img1= findViewById(R.id.facebookId);
        img2= findViewById(R.id.linkedinId);
        img3= findViewById(R.id.twitterId);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.facebookId){
            Intent intent= new Intent(AboutUs.this,SocialShow.class);
            intent.putExtra("name","facebook");
            startActivity(intent);
        }
        if (v.getId()==R.id.linkedinId){
            Intent intent= new Intent(AboutUs.this,SocialShow.class);
            intent.putExtra("name","linkedin");
            startActivity(intent);
        }
        if (v.getId()==R.id.twitterId){
            Intent intent= new Intent(AboutUs.this,SocialShow.class);
            intent.putExtra("name","twitter");
            startActivity(intent);
        }
    }



}
