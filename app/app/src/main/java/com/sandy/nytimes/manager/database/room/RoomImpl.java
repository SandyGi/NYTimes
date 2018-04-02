package com.sandy.nytimes.manager.database.room;

import android.content.Context;

import com.sandy.nytimes.manager.database.MediaInf;
import com.sandy.nytimes.manager.database.StorageInf;
import com.sandy.nytimes.model.MultimediumModel;

import java.util.List;

/**
 * Created by USER on 3/30/2018.
 */

public class RoomImpl implements StorageInf {

    RoomClient roomClient;

    public RoomImpl(Context context) {
        roomClient = RoomClient.getDatabase(context);
    }

    @Override
    public void insertAllItem(List<MultimediumModel> item) {
        roomClient.getMediaDao().insertAllAdItems(item);
    }

    @Override
    public List<MultimediumModel> getAllMediaInfo() {
       return roomClient.getMediaDao().getAllMultiMedia();
    }
}
