package com.example.sasha.classwork_250518;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Broadcast extends BroadcastReceiver
{

    @Override
    public void onReceive(Context context, Intent intent)
    {
        String str = intent.getStringExtra(MainActivity.KEY);
        context.startService(new Intent(context, MediaService.class));
        Toast.makeText(context,"Broadcast",Toast.LENGTH_SHORT).show();
    }
}
