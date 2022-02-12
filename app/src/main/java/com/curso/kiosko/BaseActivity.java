package com.curso.kiosko;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

abstract class BaseActivity extends AppCompatActivity {
    public static int flagTheme = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        switch(flagTheme){
            case 0:
                setTheme(R.style.Theme_Kiosko);
                break;
            case 1:
                setTheme(R.style.Theme_Kiosko2);
                break;
        }
    }


}
