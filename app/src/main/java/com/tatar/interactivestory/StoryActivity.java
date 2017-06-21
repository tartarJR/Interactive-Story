package com.tatar.interactivestory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class StoryActivity extends AppCompatActivity {

    private static final String TAG = StoryActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");

        if (name == null || name.isEmpty()) {
            name = "Friend";
        }

        Log.d(TAG, name);
        //Toast.makeText(StoryActivity.this, "name: " + name, Toast.LENGTH_SHORT);
    }
}
