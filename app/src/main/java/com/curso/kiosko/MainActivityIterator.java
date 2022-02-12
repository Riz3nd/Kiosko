package com.curso.kiosko;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.curso.kiosko.databinding.ActivityMainBinding;

public class MainActivityIterator implements IMainActivity.Iterator, View.OnClickListener {
    IMainActivity.Presenter presenter;
    AppCompatActivity activity;
    public MainActivityIterator(IMainActivity.Presenter presenter){
        this.presenter = presenter;
    }

    public void manejador(ActivityMainBinding binding, AppCompatActivity activity){
        this.activity = activity;
        binding.btnKiosko.setOnClickListener(this);
        binding.btnKioskoOff.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnKiosko:
                BaseActivity.flagTheme = 0;
                Toast.makeText(view.getContext(), "BTN KIOSKO", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnKioskoOff:
//                Intent i = new Intent(activity,MainActivity2.class);
//                activity.startActivity(i);
                BaseActivity.flagTheme = 1;
                Toast.makeText(view.getContext(), "BTN KIOSKO OFF", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
