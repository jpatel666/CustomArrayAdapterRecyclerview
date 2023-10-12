package com.example.customarrayadapterrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String appname[] ={"Amazon","Amazon Prime","Facebook Lite","Instagram","Messenger","Netflix","Pinterest","Snapchat","Spotify","Telegram","Tiktok","Whatsapp Messenger","Zoom","Amazon","Amazon Prime","Facebook Lite","Instagram","Messenger","Netflix","Pinterest","Snapchat","Spotify","Telegram","Tiktok","Whatsapp Messenger","Zoom","Amazon","Amazon Prime","Facebook Lite","Instagram","Messenger","Netflix","Pinterest","Snapchat","Spotify","Telegram","Tiktok","Whatsapp Messenger","Zoom","Amazon","Amazon Prime","Facebook Lite","Instagram","Messenger","Netflix","Pinterest","Snapchat","Spotify","Telegram","Tiktok","Whatsapp Messenger","Zoom"};
    int appicon[] = {R.drawable.amazon,R.drawable.amazonprime,R.drawable.facebooklite,R.drawable.instagram,R.drawable.messenger,R.drawable.netflix,R.drawable.pinterest,R.drawable.snapchat,R.drawable.spotify,R.drawable.telegram,R.drawable.tiktok,R.drawable.whatsappmessenger,R.drawable.zoom,R.drawable.amazon,R.drawable.amazonprime,R.drawable.facebooklite,R.drawable.instagram,R.drawable.messenger,R.drawable.netflix,R.drawable.pinterest,R.drawable.snapchat,R.drawable.spotify,R.drawable.telegram,R.drawable.tiktok,R.drawable.whatsappmessenger,R.drawable.zoom,R.drawable.amazon,R.drawable.amazonprime,R.drawable.facebooklite,R.drawable.instagram,R.drawable.messenger,R.drawable.netflix,R.drawable.pinterest,R.drawable.snapchat,R.drawable.spotify,R.drawable.telegram,R.drawable.tiktok,R.drawable.whatsappmessenger,R.drawable.zoom,R.drawable.amazon,R.drawable.amazonprime,R.drawable.facebooklite,R.drawable.instagram,R.drawable.messenger,R.drawable.netflix,R.drawable.pinterest,R.drawable.snapchat,R.drawable.spotify,R.drawable.telegram,R.drawable.tiktok,R.drawable.whatsappmessenger,R.drawable.zoom};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        AppAdapter appAdapter = new AppAdapter(MainActivity.this,appname,appicon);  //Alt+Enter
        recyclerView.setAdapter(appAdapter);
    }
}