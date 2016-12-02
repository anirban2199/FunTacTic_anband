package com.example.funtactic;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MoreInfo extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.more_info);
    }
    public void OnClick(View v)
    {
        finish();
    }
}
