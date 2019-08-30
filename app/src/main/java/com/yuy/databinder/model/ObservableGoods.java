package com.yuy.databinder.model;

import androidx.databinding.ObservableField;
import androidx.databinding.ObservableFloat;

/**
 * Author: yuyang
 * Date:2019/8/27 23:17
 */
public class ObservableGoods {

    private ObservableField<String> name;

    private ObservableField<String> details;

    private ObservableFloat price;

    public ObservableGoods(String name, String details, float price) {
        this.name = new ObservableField<>(name);
        this.details = new ObservableField<>(details);
        this.price = new ObservableFloat(price);
    }

    public ObservableField<String> getName() {
        return name;
    }

    public void setName(ObservableField<String> name) {
        this.name = name;
    }

    public ObservableField<String> getDetails() {
        return details;
    }

    public void setDetails(ObservableField<String> details) {
        this.details = details;
    }

    public ObservableFloat getPrice() {
        return price;
    }

    public void setPrice(ObservableFloat price) {
        this.price = price;
    }

}
