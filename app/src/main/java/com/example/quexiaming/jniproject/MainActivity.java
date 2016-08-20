package com.example.quexiaming.jniproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
// add somethere here again again
    public void HelloWorld(View view) {


    }

    //声明本地方法，使用native关键字，本地方法不用实现
    public  native  String helloFromC();
}
