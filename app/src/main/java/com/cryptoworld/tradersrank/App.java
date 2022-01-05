package com.cryptoworld.tradersrank;

import androidx.annotation.NonNull;

import com.google.firebase.FirebaseApp;
import com.traffappscorelib.wsc.IntroItem;

import java.util.ArrayList;
import java.util.List;

public class App extends com.traffappscorelib.wsc.App {

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(getApplicationContext());
    }

    @NonNull
    @Override
    public Class<?> getAppUiClassName() {
        return MainActivity.class;
    }

    @Override
    public int getIntroBgColor() {
        return R.color.teal_700;
    }

    @NonNull
    @Override
    public List<IntroItem> getIntroItems() {
        List<IntroItem> list = new ArrayList<>();
        list.add(new IntroItem("Сryptocurrency analytics", "view the history of all cryptocurrencies", R.drawable.bitcoin));
        list.add(new IntroItem("Сrypto board", "You can view information about cryptocurrencies in real time", R.drawable.bitcoin));
        return list;
    }

    @Override
    public boolean showIntro() {
        return true;
    }
}