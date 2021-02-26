package com.example.FirstAidSim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SampleActivity extends AppCompatActivity {
    final static String USER_KEY = "USER";
    User user;
    private Button sign_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        sign_in = (Button) findViewById(R.id.signIn_id);

        if(getIntent() != null && getIntent().getExtras() != null && getIntent().hasExtra(RegisterActivity.USER_KEY)){
            user = (User) getIntent().getSerializableExtra(SampleActivity.USER_KEY);
        }

        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SampleActivity.this, MainActivity.class);
                intent.putExtra(USER_KEY, user);
                startActivity(intent);
            }
        });

    }
}