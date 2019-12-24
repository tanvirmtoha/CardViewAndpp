package com.tmtbdpoly.cardviewandpp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import com.facebook.ads.*;
import static com.tmtbdpoly.cardviewandpp.R.id.webviewId;

public class webviewshow extends AppCompatActivity  {



    private AdView adView;
    private InterstitialAd interstitialAd;
    private WebView webView;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webviewshow);



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



        //internet connection
        if (!isConnected(webviewshow.this)) buildDialog(webviewshow.this).show();

        progressBar = findViewById(R.id.progressId);
        webView = findViewById(webviewId);


        webView.setWebViewClient(new WebViewClient() {

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon){
                super.onPageStarted(view, url, favicon);
                progressBar.setVisibility(View.VISIBLE);
            }
            @Override
            public void onPageFinished(WebView view, String url){
                super.onPageFinished(view, url);
                progressBar.setVisibility(View.GONE);
            }

        });

        WebSettings webSettings =  webView.getSettings();
        webSettings.setJavaScriptEnabled(true);


        Bundle bundle = getIntent().getExtras();
        if (bundle!=null){

            String newname= bundle.getString("name");
            showDetails(newname);
        }
    }
    void showDetails(String newname) {

        //result view
        if (newname.equals("resultbteb")) {
            webView.loadUrl("http://www.bteb.gov.bd/site/page/a34671e3-a81c-4927-834f-19d6afc41217/%E0%A6%AB%E0%A6%B2%E0%A6%BE%E0%A6%AB%E0%A6%B2");
        }
        if (newname.equals("noticebteb")) {
            webView.loadUrl("http://www.bteb.gov.bd/site/page/dc75972a-2e91-45d5-9f51-3484b97f8f85/Notice-All-Diploma");
        }


        ////job website view
        if (newname.equals("bdjobs")) {
            webView.loadUrl("http://bdjobs.com");
        }
        if (newname.equals("chakri")){
            webView.loadUrl("https://www.chakri.com/");
        }
        if (newname.equals("chakrikhobor")){
            webView.loadUrl("https://chakrikhobor.com/");
        }
        if (newname.equals("bdjb")){
            webView.loadUrl("http://bdjobs.com.bd/");
        }
        if (newname.equals("jagojobs")){
            webView.loadUrl("https://www.jagojobs.com/");
        }
        if (newname.equals("job")){
            webView.loadUrl("http://www.job.com.bd/f");
        }

        ////university website view
        if (newname.equals("duet")) {
            webView.loadUrl("http://www.duet.ac.bd/");
        }
        if (newname.equals("sust")){
            webView.loadUrl("https://www.sust.edu/");
        }
        if (newname.equals("just")) {
            webView.loadUrl("https://just.edu.bd/");
        }
        if (newname.equals("ru")){
            webView.loadUrl("http://www.ru.ac.bd");
        }
        if (newname.equals("amie")) {
            webView.loadUrl("http://www.iebbd.org/");
        }
        if (newname.equals("ku")){
            webView.loadUrl("http://www.ku.ac.bd/");
        }


    }


    @Override
    public void onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack();
        }else {
            super.onBackPressed();
        }
    }



    public boolean isConnected(Context context){
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();

        if (netInfo != null && netInfo.isConnectedOrConnecting()){

            android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            android.net.NetworkInfo mobile = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

            if ((mobile != null && mobile.isConnectedOrConnecting()) || (wifi != null && wifi.isConnectedOrConnecting()) )return true;
            else return false;
        }else
            return false;
    }
    public AlertDialog.Builder buildDialog(Context c){
        AlertDialog.Builder builder = new AlertDialog.Builder(c);
        builder.setTitle("No Internet Connection");
        builder.setMessage("You need to have Mobile Data or Wifi to access this. Press ok to Exit");

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        return builder;
    }

}
