package com.example.ruiqin.androidtestdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String NAME = "android";
    public static final String PWD = "123456";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvLoginResult = findViewById(R.id.tvLoginResult);
        String name = getIntent().getStringExtra("name");
        String pwd = getIntent().getStringExtra("pwd");
        if (NAME.equals(name) && PWD.equals(pwd)) {
            tvLoginResult.setText("登录成功");
        } else {
            tvLoginResult.setText("登录失败");
        }
    }

}
