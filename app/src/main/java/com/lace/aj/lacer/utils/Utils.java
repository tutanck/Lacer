package com.lace.aj.lacer.utils;

import android.content.Context;
import android.content.res.TypedArray;


public class Utils {

    public static int getThemeInitialBackgroundColor(
            Context context
            ){

        TypedArray array = context.getTheme().obtainStyledAttributes(new int[] {
                android.R.attr.windowBackground});
        int backgroundColor = array.getColor(0, 0xFF00FF);
        array.recycle();
       return backgroundColor;
    }



}
