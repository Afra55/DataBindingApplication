package com.example.databinding.databindingapplication.view;

import android.content.Context;
import android.databinding.BindingConversion;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by yangshuai in the 20:18 of 2016.06.02 .
 */
public class MTextView extends TextView {
    public MTextView(Context context) {
        super(context);
    }

    public MTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setBbbb(int color) {
        setBackgroundColor(color);
    }

    public void setAaaa(String text) {
        setText(text);
    }

    @BindingConversion
    public static ColorDrawable convertColorToDrawable(int color) {
        return new ColorDrawable(color);
    }
}
