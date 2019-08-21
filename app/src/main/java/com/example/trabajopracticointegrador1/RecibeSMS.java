package com.example.trabajopracticointegrador1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class RecibeSMS extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Mensaje Recibidooo!!!!", Toast.LENGTH_LONG).show();
    }
}
