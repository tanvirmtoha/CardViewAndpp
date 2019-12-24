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
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.facebook.ads.*;

public class CardFirst extends AppCompatActivity {


    private AdView adView;
    ListView probidhanPdfListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_first);


        //facebook audence ads show
        adView = new AdView(this, "433586950678992_434222627282091", AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();



        this.setTitle("Probidhan");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        probidhanPdfListView = findViewById(R.id.probidhanpdflistId);

        String[] pdffiles = {"Probidhan 2016"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,pdffiles){
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                View view = super.getView(position, convertView, parent);

                TextView mytext = (TextView) view.findViewById(android.R.id.text1);

                return view ;
            }
        };

        probidhanPdfListView.setAdapter(adapter);
        probidhanPdfListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item  = probidhanPdfListView.getItemAtPosition(position).toString();

                Intent intent = new Intent(getApplicationContext(),Book1p.class);

                intent.putExtra("pdfFileName",item);
                startActivity(intent);
            }
        });

    }
}
