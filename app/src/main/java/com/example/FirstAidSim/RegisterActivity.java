package com.example.FirstAidSim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    Button registerButton;
    EditText userNameR,passwordR;

    //User registers . Edit: Mitchell 2/25/2021, 9pm
    private EditText register_username;
    private EditText register_password;
    private EditText register_first_name;
    private EditText register_last_name;
    private EditText register_age;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        //EditText Objects. Edit: Mitchell 2/25/2021, 9pm
        register_username = (EditText)findViewById(R.id.editTextTextPersonName2);
        register_password = (EditText)findViewById(R.id.pwRegister_id);
        register_first_name = (EditText)findViewById(R.id.editTextTextPersonName4);
        register_last_name = (EditText)findViewById(R.id.editTextTextPersonName5);
        register_age = (EditText)findViewById(R.id.editTextNumber);

        //Register button
        registerButton = (Button)findViewById(R.id.submitRegister_id);
        registerButton.setOnClickListener((register_buttonListener));
    }

    public View.OnClickListener register_buttonListener = v -> {
        openRegisterDoneActivity();
    };

    public void openRegisterDoneActivity(){
        Intent i = new Intent(RegisterActivity.this,DoneRegister.class);
        startActivity(i);
    }
}