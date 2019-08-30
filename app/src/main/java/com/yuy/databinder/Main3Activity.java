package com.yuy.databinder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.Observable;

import android.os.Bundle;
import android.util.Log;

import com.yuy.databinder.databinding.ActivityMain3Binding;
import com.yuy.databinder.model.Goods;

import java.io.File;
import java.util.Random;

public class Main3Activity extends AppCompatActivity {

    private static final String TAG = "Main3Activity";

    private Goods goods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMain3Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_main3);
        goods = new Goods("code", "hi", 24);
        binding.setGoods(goods);
        binding.setGoodsHandler(new GoodsHandler());



        //实现了 Observable 接口的类允许注册一个监听器
        //当可观察对象的属性更改时就会通知这个监听器，此时就需要用到 OnPropertyChangedCallback
        goods.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable sender, int propertyId) {
                if (propertyId == BR.name) {
                    Log.e(TAG, "BR.name");
                }
                else if (propertyId == BR.details) {
                    Log.e(TAG, "BR.details");
                }
                else if (propertyId == BR._all) {
                    Log.e(TAG, "BR._all");
                } else {
                    Log.e(TAG, "未知");
                }
            }
        });
    }

    public class GoodsHandler {

        public void changeGoodsName() {
            goods.setName("code" + new Random().nextInt(100));
            goods.setPrice(new Random().nextInt(100));
        }

        public void changeGoodsDetails() {
            goods.setDetails("hi" + new Random().nextInt(100));
            goods.setPrice(new Random().nextInt(100));
        }

    }
}
