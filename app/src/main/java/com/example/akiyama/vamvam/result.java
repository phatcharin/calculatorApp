package com.example.akiyama.vamvam;

import android.os.Bundle;
import android.widget.EditText;

/**
 * Created by Phatcharin on 6/19/2015.
 */
public class result {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showResult = (EditText)findViewById(R.id.numText);
    }
}
