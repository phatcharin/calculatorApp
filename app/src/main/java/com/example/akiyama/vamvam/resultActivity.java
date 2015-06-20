package com.example.akiyama.vamvam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Phatcharin on 6/19/2015.
 */
public class resultActivity extends Activity {
    TextView showNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        String data= getIntent().getStringExtra("result");
       // Log.d("data11",data);
        showNum = (TextView)findViewById(R.id.show);
        showNum.setText(data);
    }
}
