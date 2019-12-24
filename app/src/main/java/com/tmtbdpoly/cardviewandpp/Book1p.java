package com.tmtbdpoly.cardviewandpp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.github.barteksc.pdfviewer.PDFView;

import com.facebook.ads.*;

public class Book1p extends AppCompatActivity {


    PDFView book1;
    private AdView adView;
    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book1p);


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

     /*   ScheduledExecutorService scheduledExecutorService =
                Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (mInterstitialAd.isLoaded()){
                            mInterstitialAd.show();
                        }
                        else {
                            Log.d("TAG","Interstitial not Loaded");
                        }
                        prepareAdInter();
                    }
                });
            }
        },10,10, TimeUnit.SECONDS);

      */

        book1 = (PDFView) findViewById(R.id.pdfbook1);



        String getItem = getIntent().getStringExtra("pdfFileName");
        //probidhan
        if (getItem.equals("Probidhan 2016")){
            book1.fromAsset("probidhan2016.pdf").load();
        }



        if (getItem.equals("Civil Technology")){
            book1.fromAsset("civil.pdf").load();
        }
        if (getItem.equals("Electrical Technology")){
            book1.fromAsset("electrical.pdf").load();
        }
        if (getItem.equals("Computer Technology")){
            book1.fromAsset("computer.pdf").load();
        }
        if (getItem.equals("Electronics Technology")){
            book1.fromAsset("electronics.pdf").load();
        }

        if (getItem.equals("Mechanical Technology")){
            book1.fromAsset("mechanical.pdf").load();
        }
        if (getItem.equals("Computer Science Technology")){
            book1.fromAsset("computerscience.pdf").load();
        }
        if (getItem.equals("Power Technology")){
            book1.fromAsset("power.pdf").load();
        }
        if (getItem.equals("Automobile Technology")){
            book1.fromAsset("automobile.pdf").load();
        }

        if (getItem.equals("RAC Technology")){
            book1.fromAsset("rac.pdf").load();
        }
        if (getItem.equals("Architecture Technology")){
            book1.fromAsset("architecture.pdf").load();
        }
        if (getItem.equals("Food Technology")){
            book1.fromAsset("food.pdf").load();
        }
        if (getItem.equals("Mining And Mine Survey")){
            book1.fromAsset("mining.pdf").load();
        }


        if (getItem.equals("Surveying Technology")){
            book1.fromAsset("surveying.pdf").load();
        }
        if (getItem.equals("Graphics Technology")){
            book1.fromAsset("graphics.pdf").load();
        }
        if (getItem.equals("Electromedical Technology")){
            book1.fromAsset("electromedical.pdf").load();
        }
        if (getItem.equals("Marine Technology")){
            book1.fromAsset("marine.pdf").load();
        }
        if (getItem.equals("Data Telecommunication And Networking")){
            book1.fromAsset("datacom.pdf").load();
        }


    }


}
