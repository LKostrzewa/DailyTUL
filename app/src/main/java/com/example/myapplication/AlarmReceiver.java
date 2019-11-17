package com.example.myapplication;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;

import androidx.core.app.NotificationCompat;

import java.util.Random;

public class AlarmReceiver extends BroadcastReceiver {

    private int getRandomMsg(){
        Random rand = new Random();
        int num = rand.nextInt(5);
        switch (num){
            case 0 :
                return R.string.regulamin1;
            case 1 :
                return R.string.regulamin2;
            case 2 :
                return R.string.regulamin3;
            case 3 :
                return R.string.regulamin4;
            default:
                return R.string.regulamin5;
        }
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        /*Intent notificationIntent = new Intent(context, MainActivity.class);
        notificationIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        PendingIntent pendingIntent = PendingIntent.getActivity(context, 100,
                notificationIntent, PendingIntent.FLAG_UPDATE_CURRENT);*/


        NotificationManager mNotificationManager =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("CHANNEL_ID",
                    "CHANNEL_NAME",
                    NotificationManager.IMPORTANCE_DEFAULT);
            //channel.setDescription("YOUR_NOTIFICATION_CHANNEL_DISCRIPTION");
            mNotificationManager.createNotificationChannel(channel);
        }

        NotificationCompat.Builder mNotifyBuilder = new NotificationCompat.Builder(
                context, "CHANNEL_ID").setSmallIcon(R.mipmap.ic_launcher)
                /*.setContentIntent(pendingIntent)*/
                .setAutoCancel(true)
                .setLargeIcon(BitmapFactory.decodeResource(context.getResources(), R.drawable.tul_logo))
                .setStyle(new NotificationCompat.BigTextStyle()
                        .bigText(context.getResources().getString(getRandomMsg())));

            mNotificationManager.notify(100, mNotifyBuilder.build());

    }

}