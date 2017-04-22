package ru.batousik.springandroidlibrary.android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import ru.batousik.springandroidlibrary.javalib.LibClass;
import springandroidlibrary.batousik.ru.myapplication.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println(LibClass.LIB_DATA);
        setContentView(R.layout.activity_main);
    }
}
