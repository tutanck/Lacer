package com.lace.aj.lacer;

import android.app.Application;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;


public class App extends Application {

    public RequestQueue appQueue;
    //public ReQstr reqstr; todo

    @Override
    public void onCreate() {
        super.onCreate();
        appQueue = Volley.newRequestQueue(getApplicationContext());
        Toast.makeText(this,"ok",Toast.LENGTH_LONG);

        // todo reqstr= new ReQstr(WebAppDirectory.serverUrl,WebAppDirectory.routerUrl,appQueue,new BasicNetworkErrorResponse(getApplicationContext()));
    }
}
