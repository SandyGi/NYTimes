package com.sandy.nytimes.manager.database.room;

/**
 * Created by USER on 3/30/2018.
 */

/*
 * *
 * Created by Sandeep on 03/03/2017.
 *
 */

import android.app.Application;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.Room;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

import android.app.Application;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.sandy.nytimes.model.MultimediumModel;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Database(entities = {MultimediumModel.class}, version = 1, exportSchema = false)
abstract class RoomClient extends RoomDatabase {

//    private final RoomClient database;

//    public RoomClient(Application application) {
//        this.database = Room.databaseBuilder(
//                application,
//                RoomClient.class,
//                "NYTimes.db"
//        ).build();
//    }

    public static RoomClient getDatabase(Context context) {
        return Room.databaseBuilder(
                context,
                RoomClient.class,
                "NYTimes.db"
        ).build();
    }

    abstract MediaDao getMediaDao();
}

