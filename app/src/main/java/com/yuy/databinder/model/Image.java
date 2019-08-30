package com.yuy.databinder.model;

import androidx.databinding.ObservableField;

/**
 * Author: yuyang
 * Date:2019/8/28 21:22
 */
public class Image {

    private ObservableField<String> url;

    public Image(String url) {
        this.url = new ObservableField<>(url);
    }

    public ObservableField<String> getUrl() {
        return url;
    }

    public void setUrl(ObservableField<String> url) {
        this.url = url;
    }

}