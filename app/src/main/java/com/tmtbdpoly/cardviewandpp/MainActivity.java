package com.tmtbdpoly.cardviewandpp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.ads.*;

import static com.tmtbdpoly.cardviewandpp.R.id.cardEightId;
import static com.tmtbdpoly.cardviewandpp.R.id.cardFifthId;
import static com.tmtbdpoly.cardviewandpp.R.id.cardFirstId;
import static com.tmtbdpoly.cardviewandpp.R.id.cardForthId;
import static com.tmtbdpoly.cardviewandpp.R.id.cardSevenId;
import static com.tmtbdpoly.cardviewandpp.R.id.cardSixId;
import static com.tmtbdpoly.cardviewandpp.R.id.cardThirdId;
import static com.tmtbdpoly.cardviewandpp.R.id.cardsecondId;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private CardView card1,card2,card3,card4,card5,card6,card7,card8,card9;



    private AdView adView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adView = new AdView(this, "433586950678992_434222627282091", AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();


//        //ads sedule
//           ScheduledExecutorService scheduledExecutorService =
//                Executors.newSingleThreadScheduledExecutor();
//        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
//            @Override
//            public void run() {
//
//                runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        if (mInterstitialAd.isLoaded()){
//                            mInterstitialAd.show();
//                        }
//                        else {
//                            Log.d("TAG","Interstitial not Loaded");
//                        }
//                        prepareAdInter();
//                    }
//                });
//            }
//        },30,30, TimeUnit.MINUTES);
//        //ads end




        //all card
        card1 = findViewById(cardFirstId);
        card2 = findViewById(cardsecondId);
        card3 = findViewById(cardThirdId);
        card4 = findViewById(cardForthId);
        card5 = findViewById(cardFifthId);
        card6 = findViewById(cardSixId);
        card7 = findViewById(cardSevenId);
        card8 = findViewById(cardEightId);
        card9 = findViewById(R.id.cardNineId);




        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);
        card7.setOnClickListener(this);
        card8.setOnClickListener(this);
        card9.setOnClickListener(this);




    }


    @Override
    public void onClick(View v) {

        Intent i;
        switch (v.getId()){
            case cardFirstId : i = new Intent(this,CardFirst.class);startActivity(i);break;
            case cardsecondId : i = new Intent(this,CardSecond.class);startActivity(i);break;
            case cardThirdId : i = new Intent(MainActivity.this,webviewshow.class);i.putExtra("name","resultbteb");startActivity(i);break;
            case cardForthId : i = new Intent(MainActivity.this,webviewshow.class);i.putExtra("name","noticebteb");startActivity(i);break;
            case cardFifthId : i = new Intent(this,cardFifth.class);startActivity(i);break;
            case cardSixId : i = new Intent(this,Cardsixth.class);startActivity(i);break;
            case cardSevenId : i = new Intent(this,CardSeventh.class);startActivity(i);break;
            case cardEightId : i = new Intent(this,CardEighth.class);startActivity(i);break;
            case R.id.cardNineId : i = new Intent(this,AkademicCalender.class);startActivity(i);break;


            default:break;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_item,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {


        if (item.getItemId()== R.id.shareId){
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");


            startActivity(Intent.createChooser(intent,"Shre With"));
        }
        if (item.getItemId()== R.id.devId){
            Intent intent = new Intent(MainActivity.this,AboutUs.class);
            startActivity(intent);
        }



        return super.onOptionsItemSelected(item);
    }

}
