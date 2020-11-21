package com.example.instragramclone;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.parceler.Parcels;

public class TimeLineActivity extends AppCompatActivity {
    public static final String TAG = "TimeLineActivity";
    ImageView IvPoster2;
    TextView tvcompose;
    Post client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);

        //client=Post.getRestClient(this);

        IvPoster2=findViewById(R.id.IvPoster2);
        tvcompose=findViewById(R.id.tvcompose);
    }

}
