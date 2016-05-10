package com.example.databinding.databindingapplication;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * Created by Victor Yang on 2016/5/9.
 */
public class Son {
    public final ObservableField<String> firstName =
            new ObservableField<>();
    public final ObservableField<String> lastName =
            new ObservableField<>();
    public final ObservableInt age = new ObservableInt();
}
