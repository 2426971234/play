package com.app.playandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
    }

    private void initData() {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add("dfghjkl");
        objects.add("122");
        objects.add("122");
        objects.add("122");
        objects.add("122");
        objects.add("122");
        objects.add("122");

    }
}
