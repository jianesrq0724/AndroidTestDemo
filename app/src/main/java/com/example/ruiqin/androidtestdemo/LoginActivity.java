package com.example.ruiqin.androidtestdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtName;
    private EditText edtPwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViewById(R.id.btnLogin).setOnClickListener(this);

        edtName = findViewById(R.id.edtName);
        edtPwd = findViewById(R.id.edtPwd);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnLogin:
                Intent intent = new Intent(this, MainActivity.class);
                intent.putExtra("name", edtName.getText().toString().trim());
                intent.putExtra("pwd", edtPwd.getText().toString().trim());
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
