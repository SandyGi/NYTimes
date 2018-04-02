package com.sandy.nytimes.manager.database.room;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.sandy.nytimes.model.MultimediumModel;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

/**
 * Created by USER on 3/30/2018.
 */
@Dao
abstract class MediaDao {

    /**
     * Insert all items
     *
     * @param items
     */
    @Insert(onConflict = REPLACE)
    abstract void insertAllAdItems(List<MultimediumModel> items);

    /**
     * Get all entities of type multimedia
     * @return
     */
    @Query("SELECT * FROM media")
    abstract List<MultimediumModel> getAllMultiMedia();

}
