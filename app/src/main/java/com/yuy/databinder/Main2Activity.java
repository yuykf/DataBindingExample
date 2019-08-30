package com.yuy.databinder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;


import com.yuy.databinder.databinding.ActivityMain2Binding;
import com.yuy.databinder.model.ObservableGoods;
import com.yuy.databinder.model.User;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMain2Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_main2);

        //单向绑定
        User user = new User("leavesC", "123456");
        binding.setUserInfo(user);

        //双向数据绑定
        ObservableGoods goods = new ObservableGoods("code", "hi", 23);
        binding.setGoods(goods);

    }

    //TODO
    private void m1(){

    }
}
