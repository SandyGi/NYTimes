package com.sandy.nytimes.viewmodel;

import com.sandy.nytimes.application.NYTimeApplication;
import com.sandy.nytimes.model.MultimediumModel;

import java.util.List;

/**
 * Created by USER on 3/31/2018.
 */

public class MediaViewModel {

    public List<MultimediumModel> getAllArchiveMedia(){

        return NYTimeApplication.getInstance().getNyTimesManager().getNYMedia();
    }
}
