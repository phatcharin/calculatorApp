package com.example.akiyama.vamvam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

   TextView showResult;

    protected int num1,num2;
    protected String result1="";
    protected String str = "";
    protected Character operator = 'q';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showResult = (TextView)findViewById(R.id.numText);

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
    private void insert(int j) {
        // TODO Auto-generated method stub
        str = str+Integer.toString(j);
        num1 = Integer.valueOf(str).intValue();
        showResult.setText(str);
        if(operator != 'q')
        {
            chkOperator();
        }
    }
    public void chkOperator()
    {
        if(operator != 'q')
        {
            calculate();
            perform();

            if(operator =='*'||operator =='/'){
                num1 = 1;
            } else {
                num1 = 0;
            }

            operator ='q';
        }
    }
    public void btnPlusClicked(View v){

        if(num2 != 0){
            num1 = num2+num1;
            showResult.setText("= " + num1);
            //Log.d("num2+", Integer.toString(num2));
            num2 = 0;
        }
        perform();
        operator = '+';


    }
    public void btnMiClicked(View v){
        if(num2 != 0){
            num1 = num2-num1;
            showResult.setText("= " + num1);
            //Log.d("num2+", Integer.toString(num2));
            num2 = 0;
        }
        perform();
        operator = '-';

    }
    public void btnMulClicked(View v){
        if(num2 != 0){
            num1 = num2*num1;
            showResult.setText("= " + num1);
            //Log.d("num2+", Integer.toString(num2));
            num2 = 0;
        }
        perform();
        operator = '*';

    }
    public void btnDivClicked(View v){
        if(num2 != 0){
            num1 = num2/num1;
            showResult.setText("= " + num1);
            //Log.d("num2+", Integer.toString(num2));
            num2 = 0;
        }
        perform();
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
        if(operator == '+')
        {
            num1 = num2 + num1;
        }
        else if(operator == '-') {
            num1 = num2 - num1;
        }
        else if(operator == '/')
            num1 = num2/num1;
        else if(operator == '*')
            num1 = num2*num1;
        else if (operator == 'q')
            num1 = num2;

        result1 = Integer.toString(num1);

        //showResult.setText("= " + result1);
    }




}
