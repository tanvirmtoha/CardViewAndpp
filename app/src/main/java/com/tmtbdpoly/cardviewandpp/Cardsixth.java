package com.tmtbdpoly.cardviewandpp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.ads.*;

public class Cardsixth extends AppCompatActivity implements View.OnClickListener {


    private AdView adView;
    private EditText editText1,editText2,editText3,editText4,editText5,editText6,editText7,editText8;

    private Button resultBtn;

    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardsixth);


        //facebook audence ads show
        adView = new AdView(this, "433586950678992_434222627282091", AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();



        this.setTitle("CGPA Calculator");

        editText1 = findViewById(R.id.firstEditId);
        editText2 = findViewById(R.id.secondtEditId);
        editText3 = findViewById(R.id.thirEditId);
        editText4 = findViewById(R.id.forthEditId);
        editText5 = findViewById(R.id.fifthEditId);
        editText6 = findViewById(R.id.sixEditId);
        editText7 = findViewById(R.id.sevenEditId);
        editText8 = findViewById(R.id.eigthEditId);



        resultBtn = findViewById(R.id.resultId);

        resultTextView = findViewById(R.id.resultShowId);

        resultBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        try {

            String number1 = editText1.getText().toString();
            String number2 = editText2.getText().toString();
            String number3 = editText3.getText().toString();
            String number4 = editText4.getText().toString();
            String number5 = editText5.getText().toString();
            String number6 = editText6.getText().toString();
            String number7 = editText7.getText().toString();
            String number8 = editText8.getText().toString();

            //convert double

            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);
            double num3 = Double.parseDouble(number3);
            double num4 = Double.parseDouble(number4);
            double num5 = Double.parseDouble(number5);
            double num6 = Double.parseDouble(number6);
            double num7 = Double.parseDouble(number7);
            double num8 = Double.parseDouble(number8);

            if (v.getId() == R.id.resultId){
                double sum = ((num1*5)/100)+ ((num2*5)/100)+((num3*5)/100)+((num4*10)/100)+((num5*15)/100)+((num6*20)/100)+((num7*25)/100)+((num8*15)/100);
                resultTextView.setText( "Results : "+(String.format("%.2f",sum)));


            }


        }catch (Exception e){
            Toast.makeText(Cardsixth.this,"Plese Enter All Field",Toast.LENGTH_SHORT).show();

        }

    }
}
