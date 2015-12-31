package com.bestbeforeapp.parsemvp;

import android.app.Application;

import com.bestbeforeapp.parsemvp.data.Note;
import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by luke on 31/12/15.
 */
public class ParseMVPApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Note.class);
        Parse.initialize(this, "pO9hNIcVPRkG7bhyjiGJ1a5uXISKGYRJNvFaUGEl", "cX0sr60R60xcHojOzRjpTwhEjTSVYOIzCvkjT9mh");
    }

}
