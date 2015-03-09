package com.kdeveloper.omdb;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

public class Check_Internet {

    Context context;
    boolean connect;
    ConnectivityManager cm;
    NetworkInfo activeNetwork;
    String LOG_TAG = getClass().getSimpleName();

    public Check_Internet(Context c){

        this.context = c;

    }

    public boolean state(){

        cm = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);

        activeNetwork = cm.getActiveNetworkInfo();
        if(activeNetwork != null &&  activeNetwork.isConnected()){
            Log.i(LOG_TAG,"Connected to Internet");
            return true;
        }
        else{
            Log.i(LOG_TAG,"Check Internet connection");
        }

        return false;
    }

}