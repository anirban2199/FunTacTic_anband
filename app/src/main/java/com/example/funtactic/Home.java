package com.example.funtactic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Nishkal Prakash on 04-09-2015.
 */
public class Home extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.home);
    }
    public void onClick(View view){
        finish();
    }

}

