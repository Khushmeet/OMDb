package com.kdeveloper.omdb;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by my-pc on 09-03-2015.
 */
public class fragment_activity_home extends Fragment {

        public fragment_activity_home() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_activity_home, container, false);
            return rootView;
        }
    }


