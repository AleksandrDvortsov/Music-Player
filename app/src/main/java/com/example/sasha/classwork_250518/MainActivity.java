package com.example.sasha.classwork_250518;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    Intent i;
    public static final String KEY = "777";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void click(View v)
    {
        i = new Intent(this, MediaService.class);
        switch (v.getId())
        {
            case R.id.start:
                startService(i);
                break;
            case R.id.stop:
                stopService(i);
                break;
            case R.id.broadcast:
                Intent ii = new Intent(this,Broadcast.class);
                ii.putExtra(KEY,"10");
                sendBroadcast(ii);
                break;
        }
    }
}