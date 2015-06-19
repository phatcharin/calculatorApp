package com.example.akiyama.vamvam;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import java.math.BigInteger;


public class MainActivity extends Activity {
    //Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonPlus,buttonMinus,buttonMul,buttondi,buttonEq,buttonC;
    EditText showResult;
    int num1,num2,result=0;
    String str = "";
    Character operator = 'q';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showResult = (EditText)findViewById(R.id.numText);
    }

    public void btn1Clicked(View v){
        insert(1);

    }
    public void btn2Clicked(View v){
        insert(2);

    }
    public void btn3Clicked(View v){
        insert(3);

    }
    public void btn4Clicked(View v){
        insert(4);

    }
    public void btn5Clicked(View v){
        insert(5);

    }
    public void btn6Clicked(View v){
        insert(6);

    }
    public void btn7Clicked(View v){
        insert(7);

    }
    public void btn8Clicked(View v){
        insert(8);

    }
    public void btn9Clicked(View v){
        insert(9);

    }
    public void btn0Clicked(View v){
        insert(0);

    }
    public void insert(int j) {
        // TODO Auto-generated method stub
        str = str+Integer.toString(j);
        num1 = Integer.valueOf(str).intValue();
        showResult.setText(str);
    }
    public void btnPlusClicked(View v){

        if(num2 != 0){
            num1 = num2+num1;
            showResult.setText("= " + num1);
            //Log.d("num2+", Integer.toString(num2));
        }
        perform();
        operator = '+';


    }
    public void btnMiClicked(View v){
        perform();
        operator = '-';

    }
    public void btnMulClicked(View v){
        perform();
        operator = '*';

    }
    public void btnDivClicked(View v){
        perform();
        operator = '/';

    }
    public void btnEqualClicked(View v){
        calculate();

    }
    public void btnCClicked(View v){
        str = "";
        num1 = 0;
        num2 = 0;
        showResult.setText("");
        operator = 'q';
    }
    private void perform() {
        str = "";
        num2 = num1;
        //Log.d("num2Per",Integer.toString(num2));
    }
    private void calculate() {
        // TODO Auto-generated method stub
        if(operator == '+') {
            num1 = num2 + num1;
            num2 = 0;
        }
        else if(operator == '-')
            num1 = num2-num1;
        else if(operator == '/')
            num1 = num2/num1;
        else if(operator == '*')
            num1 = num2*num1;
        result = num1;
        showResult.setText("= " + result);
    }




}
