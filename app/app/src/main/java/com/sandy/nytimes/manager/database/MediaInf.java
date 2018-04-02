package com.sandy.nytimes.manager.database;

import com.sandy.nytimes.model.MultimediumModel;

import java.util.List;

/**
 * Created by USER on 3/30/2018.
 */

public interface MediaInf {
    public void insertAllItem(List<MultimediumModel> item);
    public List<MultimediumModel> getAllMediaInfo();
}
