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
import android.widget.ProgressBar;

public class SocialShow extends AppCompatActivity {


    private WebView webView;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_show);


        //hiding the title bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //actionbar hide
        getSupportActionBar().hide();


        //internet connection
        if (!isConnected(SocialShow.this)) buildDialog(SocialShow.this).show();

        progressBar = findViewById(R.id.progressId);
        webView = findViewById(R.id.webviewId);


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
        ///profile show
        if (newname.equals("facebook")){
            webView.loadUrl("https://www.facebook.com/tanvirmahtabtoha");
        }
        if (newname.equals("linkedin")){
            webView.loadUrl("https://www.linkedin.com/in/tanvir-mahtab-toha-11b644154/");
        }
        if (newname.equals("twitter")){
            webView.loadUrl("https://twitter.com/tanvirmt34");
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
