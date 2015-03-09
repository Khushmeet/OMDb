package com.kdeveloper.omdb;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.net.HttpURLConnection;


public class fragment_activity_home extends Fragment {
    Button reviewButton;
    EditText movieSearch;
    String movieName;
    HttpURLConnection urlConnection = null;
    BufferedReader reader = null;
    String connectionError = "Check your internet connection";
    String movieSearchToast = "Enter the name of Movie";

        public fragment_activity_home() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_activity_home, container, false);
            reviewButton = (Button)rootView.findViewById(R.id.review_button);
            movieSearch = (EditText)rootView.findViewById(R.id.movie_search);
            return rootView;
        }

        public void onClickReview(View view){
            movieName = movieSearch.getText().toString();
            if(movieName.equals("")){
                Toast.makeText(getActivity(),movieSearchToast,Toast.LENGTH_LONG).show();
            }
            else{
                if(new CheckInternet(getActivity()).state()){



                }
                else{
                    Toast.makeText(getActivity(),connectionError,Toast.LENGTH_LONG).show();
                }

            }


        }
    }


