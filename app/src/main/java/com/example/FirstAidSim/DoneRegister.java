package com.example.FirstAidSim;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DoneRegister extends AppCompatActivity {
    final static String USER_KEY = "USER";
    User user;


    private Button log_in_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        log_in_button = (Button) findViewById(R.id.log_in_id);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_done_register);

        if(getIntent() != null && getIntent().getExtras() != null && getIntent().hasExtra(RegisterActivity.USER_KEY)){
            user  = (User) getIntent().getSerializableExtra(RegisterActivity.USER_KEY);
        }

        log_in_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoneRegister.this, MainActivity.class);
                intent.putExtra(USER_KEY, user);
                startActivity(intent);
            }
        });
    }
}
