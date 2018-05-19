package com.example.ahmed.registerandlogin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_register(View view) {
        startActivity(new Intent(this, Register.class));
    }

    public void btn_login(View view) {
        startActivity(new Intent(this, Login.class));
    }
}
