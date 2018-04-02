package com.sandy.nytimes.application;

import android.app.Application;

import com.sandy.nytimes.manager.NYTimesManager;
import com.sandy.nytimes.manager.database.room.RoomImpl;
import com.sandy.nytimes.manager.network.retrofit.ApiClient;

/**
 * Created by USER on 3/31/2018.
 */

public class NYTimeApplication extends Application {

    private NYTimesManager nyTimesManager;

    private static NYTimeApplication application;

    @Override
    public void onCreate() {
        super.onCreate();
        nyTimesManager = NYTimesManager.getInstance(this, new RoomImpl(getApplicationContext()), new ApiClient());
        application = this;
    }

    public static NYTimeApplication getInstance(){
        return application;
    }

    public NYTimesManager getNyTimesManager() {
        return nyTimesManager;
    }
}
