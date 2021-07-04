package com.examafdila.nurafdila;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login= (Button)findViewById(R.id.Login);

        login.setOnClickListener(v -> {
            intent intent1 = new intent(getApplicationContext(),MenuUtama,class);
            startActivity(intent1);
        });

    }
}