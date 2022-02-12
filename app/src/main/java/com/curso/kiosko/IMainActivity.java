package com.curso.kiosko;

import android.app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import com.curso.kiosko.databinding.ActivityMainBinding;

public interface IMainActivity {
    interface View{

    }
    interface Presenter{
        void manejador(ActivityMainBinding bindings, AppCompatActivity activity);
    }
    interface Iterator{
        void manejador(ActivityMainBinding bindings, AppCompatActivity activity);
    }

}
