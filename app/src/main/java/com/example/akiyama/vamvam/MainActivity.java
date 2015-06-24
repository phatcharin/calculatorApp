package com.example.akiyama.vamvam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.BigInteger;


public class MainActivity extends Activity {

   TextView showResult;

    private BigInteger num1;
    private BigInteger num2 = BigInteger.valueOf(0);
    protected String result1="";
    private String str = "";
    private Character operator = 'q';
    private boolean chkDivideEqZero = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showResult = (TextView)findViewById(R.id.numText);

    }

    public void btn1Clicked(View v){
        insert(BigInteger.valueOf(1));

    }
    public void btn2Clicked(View v){
        insert(BigInteger.valueOf(2));

    }
    public void btn3Clicked(View v){
        insert(BigInteger.valueOf(3));

    }
    public void btn4Clicked(View v){

        insert(BigInteger.valueOf(4));
    }
    public void btn5Clicked(View v){
        insert(BigInteger.valueOf(5));

    }
    public void btn6Clicked(View v){
        insert(BigInteger.valueOf(6));

    }
    public void btn7Clicked(View v){
        insert(BigInteger.valueOf(7));

    }
    public void btn8Clicked(View v){
        insert(BigInteger.valueOf(8));

    }
    public void btn9Clicked(View v){
        insert(BigInteger.valueOf(9));

    }
    public void btn0Clicked(View v){
        insert(BigInteger.ZERO);

    }
    private void insert(BigInteger j) {
        // TODO Auto-generated method stub
        str = str+j.toString();
        //Log.d("num1str",str);
        num1 = new BigInteger(str);
        //Log.d("num1Insert",num1.toString());
        showResult.setText(str);


    }
    public void chkOperator()
    {
        if(operator != 'q')
        {
            calculate();
            //Log.d("num1 chkOp",num1.toString());
            setNum2();

            if(operator =='*'||operator =='/'){
                num1 = BigInteger.valueOf(1);
               //Log.d("num1*/",num1.toString());
            } else {
                num1 = BigInteger.valueOf(0);
                //Log.d("num1+-",num1.toString());
            }

            operator ='q';
        }
    }
    public void btnPlusClicked(View v){
        //chkOperator();
        if(num2!= BigInteger.ZERO){
            num1=BigInteger.ZERO;
            num1 = num2.add(num1);
            showResult.setText("= " + num1);
            //Log.d("num2+", num2.toString());
            num2 = BigInteger.ZERO;
        }
        setNum2();
        //Log.d("num2ff",num2.toString());
        operator = '+';


    }
    public void btnMiClicked(View v){
       if(num2!= BigInteger.ZERO){
            num1=BigInteger.ZERO;
            num1 = num2.subtract(num1);
            showResult.setText("= " + num1);
            //Log.d("num2+", num2.toString());
            num2 = BigInteger.ZERO;
        }
        setNum2();
        operator = '-';

    }
    public void btnMulClicked(View v){
        if(num2!= BigInteger.ZERO){
            num1=BigInteger.ONE;
            num1 = num2.multiply(num1);
            showResult.setText("= " + num1);
            num2 = BigInteger.ONE;
        }
        setNum2();
        //Log.d("num2set", num2.toString());
        operator = '*';

    }
    public void btnDivClicked(View v){
       if (num2 != BigInteger.ZERO)
       {
            num1 = BigInteger.ONE;
            num1 = num2.divide(num1);
            showResult.setText("= " + num1);
             //Log.d("num2+", num2.toString());
            num2 = BigInteger.ONE;
       }
       setNum2();
       operator = '/';

    }
    public void btnEqualClicked(View v){
        calculate();

        Intent intent = new Intent(MainActivity.this, resultActivity.class);
        intent.putExtra("result",result1);
        startActivity(intent);

    }
    public void btnCClicked(View v){
        str = "";
        chkDivideEqZero=false;
        num1 = BigInteger.ZERO;
        num2 = BigInteger.ZERO;
        showResult.setText("");
        operator = 'q';
    }
    private void setNum2() {
       str = "";
       num2 = num1;

        //Log.d("num2Per",Integer.toString(num2));
    }
    private void calculate() {
        // TODO Auto-generated method stub
        if(operator == '+')
        {
            num1 = num2.add(num1);
        }
        else if(operator == '-') {
            num1 = num2.subtract(num1);
        }
        else if(operator == '/') {
            if (num1.equals(BigInteger.ZERO)) {
                chkDivideEqZero = true;
                showResult.setText("Cannot divide by zero");
            } else {

                num1 = num2.divide(num1);
            }
        }
        else if(operator == '*')
            num1 = num2.multiply(num1);
        else if (operator == 'q')
            num1 = num2;

        if(chkDivideEqZero)
        {
            result1 = "Cannot divide by zero";
        } else {
            result1 = num1.toString();
        }


    }




}
