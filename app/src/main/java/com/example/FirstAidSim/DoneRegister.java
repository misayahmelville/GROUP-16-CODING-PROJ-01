package com.example.FirstAidSim;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class DoneRegister extends AppCompatActivity {
    private Button log_in_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        log_in_button = (Button) findViewById(R.id.log_in);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_finished);


        log_in_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoneRegister.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
