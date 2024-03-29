package com.yuy.databinder;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.yuy.databinder.databinding.FragmentBlankBinding;

/**
 * Author: yuyang
 * Date:2019/8/28 22:04
 */
public class BlankFragment extends Fragment {

    public BlankFragment() {

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentBlankBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_blank, container, false);
        binding.setHint("Hello");
        return binding.getRoot();
    }

}
