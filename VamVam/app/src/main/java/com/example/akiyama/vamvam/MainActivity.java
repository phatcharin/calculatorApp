package com.example.akiyama.vamvam;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.math.BigInteger;


public class MainActivity extends Activity {
    TextView num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView num = (TextView) findViewById(R.id.textView);
                String number = num.getText().toString();
                num.setText(number + "1");
            }
        });
        final Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView num = (TextView) findViewById(R.id.textView);
                String number = num.getText().toString();
                num.setText(number+"2");


            }
        });
        final Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView num = (TextView) findViewById(R.id.textView);
                String number = num.getText().toString();
                num.setText(number+"3");


            }
        });
        final Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView num = (TextView) findViewById(R.id.textView);
                String number = num.getText().toString();
                num.setText(number+"4");


            }
        });

        final Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView num = (TextView) findViewById(R.id.textView);
                String number = num.getText().toString();
                num.setText(number+"5");


            }
        });
        final Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView num = (TextView) findViewById(R.id.textView);
                String number = num.getText().toString();
                num.setText(number + "6");


            }
        });
        final Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView num = (TextView) findViewById(R.id.textView);
                String number = num.getText().toString();
                num.setText(number+"7");


            }
        });
        final Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView num = (TextView) findViewById(R.id.textView);
                String number = num.getText().toString();
                num.setText(number+"8");

            }
        });
        final Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView num = (TextView) findViewById(R.id.textView);
                String number = num.getText().toString();
                num.setText(number+"9");

            }
        });
        final Button button0 = (Button) findViewById(R.id.button0);
        button0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView num = (TextView) findViewById(R.id.textView);
                String number = num.getText().toString();
                num.setText(number+"0");

            }
        });
        final Button buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView num = (TextView) findViewById(R.id.textView);
                String number = num.getText().toString();
                BigInteger solve = new BigInteger(number);
                num.setText("+");
                String operat = num.getText().toString();
                //Log.d("Operat",operat);
                //Log.d("solve",solve.toString());

            }
        });
        final Button buttonMinus = (Button) findViewById(R.id.buttonMinus);
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView num = (TextView) findViewById(R.id.textView);
                //String number = num.getText().toString();
                num.setText("-");

            }
        });
        final Button buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonMul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView num = (TextView) findViewById(R.id.textView);
                //String number = num.getText().toString();
                num.setText("*");

            }
        });
        final Button buttonDi = (Button) findViewById(R.id.buttonDi);
        buttonDi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView num = (TextView) findViewById(R.id.textView);
                String number = num.getText().toString();
                num.setText(number+"/");

            }
        });
        final Button buttonC = (Button) findViewById(R.id.buttonC);
        buttonC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView num = (TextView) findViewById(R.id.textView);
                String number = "";
                num.setText("");

            }
        });
        final Button buttonEq = (Button) findViewById(R.id.buttonEq);
        buttonEq.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView num = (TextView) findViewById(R.id.textView);
                String number = num.getText().toString();

            }
        });

    }



}
