package com.yuy.databinder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.yuy.databinder.databinding.ActivityMain10Binding;

public class Main10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMain10Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_main10);
    }
}
