package com.curso.kiosko;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.curso.kiosko.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity implements IMainActivity.View /*implements View.OnClickListener*/ {
    ActivityMainBinding binding;
    IMainActivity.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        presenter = new MainActivityPresenter(/*this*/);
        presenter.manejador(binding);
        presenter.changeTheme(this);
    }

}