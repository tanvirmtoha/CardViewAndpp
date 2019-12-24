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
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.ads.*;

public class CardSecond extends AppCompatActivity  {



    private AdView adView;
    ListView booklistpdfview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_second);

        //facebook audence ads show
        adView = new AdView(this, "433586950678992_434222627282091", AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();

        this.setTitle("Book List");



        booklistpdfview = findViewById(R.id.booklistId);

        String[] pdffiles = {"Civil Technology","Electrical Technology","Computer Technology","Electronics Technology", "Mechanical Technology",
                "Computer Science Technology","Power Technology","Automobile Technology","RAC Technology","Architecture Technology",
                "Food Technology","Mining And Mine Survey","Surveying Technology","Graphics Technology","Electromedical Technology","Marine Technology",
                "Data Telecommunication And Networking"

        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,pdffiles){
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                View view = super.getView(position, convertView, parent);

                TextView mytext = (TextView) view.findViewById(android.R.id.text1);

                return view ;
            }
        };

        booklistpdfview.setAdapter(adapter);
        booklistpdfview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item  = booklistpdfview.getItemAtPosition(position).toString();

                Intent intent = new Intent(getApplicationContext(),Book1p.class);

                intent.putExtra("pdfFileName",item);
                startActivity(intent);
            }
        });

    }

}
