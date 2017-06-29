package com.lace.aj.lacer.utils;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by zenika on 29/06/2017.
 */

public class TextWatchers {


    /*
    Birth a new email TextWatcher
     */
    public static TextWatcher birthEmailWatcher(
       final Context context,
       Button submit
    ) {

        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Toast.makeText(context, "You just added 1 TODO", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        };

    }



    /*
   Birth a new password TextWatcher
    */
    public static TextWatcher birthPasswordWatcher(
            final Context context,
            Button submit
    ) {

        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Toast.makeText(context, "You just added 1 TODO", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        };

    }

}
