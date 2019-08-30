package com.yuy.databinder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.text.Editable;
import android.widget.Toast;

import com.yuy.databinder.databinding.ActivityMain6Binding;
import com.yuy.databinder.model.User;

public class Main6Activity extends AppCompatActivity {

    private ActivityMain6Binding binding;

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main6);
        user = new User("leavesC", "12345");
        binding.setUserInfo(user);
        binding.setUserPresenter(new UserPresenter());
    }

    public class UserPresenter {

        public void onUserNameClick(User user) {
            Toast.makeText(Main6Activity.this, "用户名：" + user.getName(), Toast.LENGTH_SHORT).show();
        }

        public void afterTextChanged(Editable s) {
            user.setName(s.toString());
            binding.setUserInfo(user);
        }

        public void afterUserPasswordChanged(Editable s) {
            user.setPassword(s.toString());
            binding.setUserInfo(user);
        }

    }
}
