package com.app.playandroid;

import android.app.Fragment;
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
        objects.add("122");
        objects.add("122");
        objects.add("122");
        objects.add("122");
        objects.add("122");
        objects.add("12222222a");
        objects.add("12222222a");
        objects.add("12222222a");
        objects.add("12222222a");
        objects.add("12222222a");
        objects.add("12222222a");


    }
    public void data(){
        int i = 3;
        i++;
    }
    public void getList(){
        ArrayList<Fragment> fragments = new ArrayList<>();

    }

}
