package com.kdeveloper.omdb;

import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentResolver;
import android.content.Context;

/**
 * Created by my-pc on 09-03-2015.
 */
public class OMDb_SyncAdapter extends AbstractThreadedSyncAdapter {
    ContentResolver mContentResolver;
    /**
     * Set up the sync adapter
     */
    public OMDb_SyncAdapter(Context context, boolean autoInitialize) {
        super(context, autoInitialize);
        /*
         * If your app uses a content resolver, get an instance of it
         * from the incoming Context
         */
        mContentResolver = context.getContentResolver();
    }
    .
    }
}
