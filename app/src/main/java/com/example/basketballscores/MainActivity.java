package com.example.basketballscores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int quantityA = 0;
    int quantityB=0;

    /**
     * This method is called when the + button is clicked.
     */
    public void increment(View view) {


        quantityA = quantityA + 3;
        display1(quantityA);

    }

    public void increment2(View view) {


        quantityA = quantityA + 5;
        display1(quantityA);

    }
    public void incrementby1(View view) {


        quantityA = quantityA + 1;
        display1(quantityA);

    }
    public void incrementby1B(View view) {


        quantityB = quantityB + 1;
        display2(quantityB);

    }
    public void increment3(View view) {


        quantityB = quantityB + 3;
        display2(quantityB);

    }

    public void increment4(View view) {


        quantityB = quantityB + 5;
        display2(quantityB);

    }
    public void resetscore(View view)
    {
        quantityA=0;
        quantityB=0;
        display1(quantityA);
        display2(quantityB);
    }

    private void display1(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.textView3);
        quantityTextView.setText("" + number);

    }
    private void display2(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.textView4);

        quantityTextView.setText("" + number);


    }



}