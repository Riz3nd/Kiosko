package com.curso.kiosko;

import androidx.appcompat.app.AppCompatActivity;

import com.curso.kiosko.databinding.ActivityMainBinding;

public class MainActivityPresenter implements IMainActivity.Presenter{
    IMainActivity.Iterator iterator;
//    IMainActivity.View view;

    public MainActivityPresenter(/*IMainActivity.View view*/){
        this.iterator = new MainActivityIterator(this);
//        this.view = view;
    }

    @Override
    public void manejador(ActivityMainBinding bindings, AppCompatActivity activity) {
        iterator.manejador(bindings,activity);
    }

}
