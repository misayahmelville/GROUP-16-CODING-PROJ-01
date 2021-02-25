package com.example.FirstAidSim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    protected Button login_button,register_button;
    private EditText username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Log in button
        login_button = (Button)findViewById(R.id.signIn_id);
        login_button.setOnClickListener((login_buttonListener));


        // Register button
        register_button = (Button)findViewById(R.id.register_id);
        register_button.setOnClickListener(register_buttonListener);

        // I ADDED THIS!


    }

    public View.OnClickListener login_buttonListener = v -> {
        openLogInActivity();
    };


    // Opens MainActivity2 , this is for the register button when clicked
    public View.OnClickListener register_buttonListener = v -> {
        openRegisterActivity();
        Log.i("TAG1", "register button clicked" );
    };

    public void openRegisterActivity(){
        Intent i = new Intent(MainActivity.this,RegisterActivity.class);
        startActivity(i);
    }

    public void openLogInActivity(){
        Intent i = new Intent(MainActivity.this,LogInActivity.class);
        startActivity(i);
    }
}