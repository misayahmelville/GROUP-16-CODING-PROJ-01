package com.example.FirstAidSim;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DoneRegister extends AppCompatActivity {
    protected Button login_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_finished);

        // Log in button
        login_button = (Button)findViewById(R.id.log_in);
        login_button.setOnClickListener((login_buttonListener));
    }

    public View.OnClickListener login_buttonListener = v -> {
        openLogInActivity();
    };

    public void openLogInActivity(){
        Intent i = new Intent(DoneRegister.this,MainActivity.class);
        startActivity(i);
    }
}
