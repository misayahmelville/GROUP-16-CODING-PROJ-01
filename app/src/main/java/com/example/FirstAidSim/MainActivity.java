// To Add
//      1.0) Go to VCS -> Git -> Add (Ctrl + Alt + A)

// To Commit
//      2.0) Go to VCS -> Commit (Ctrl + k)
//      2.1) On the Commit Pane (found on the left edge of your screen),
//              check all the checkboxes, type some comment, then click "Commit"
//              A popup box will show up prompting you to review, click "Commit" again

// To Push
//      3.0) Go to VCS -> Git -> Push (Ctrl + Shift + k)

package com.example.FirstAidSim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    SystemDatabase SystemDataBase = new SystemDatabase();
    // Stores the registering user to a vector data structure
    // User info contains the following:
    //  1. First Name
    //  2. Last Name
    //  3. Age
    //  4. Username (email)
    //  5. Password

    protected Button login_button,register_button;

    private EditText username;
    // Desc: User enters email address
    // ID: editTextTextEmailAddress

    private EditText password;
    //Desc: User enters password
    // ID: editTextTextPassword
    //Edit made by: Mitchell on 2/25/21, 3:30PM



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

        // EditText Objects
        //Edit made by: Mitchell on 2/25/21, 3:30PM
        username = (EditText) findViewById(R.id.editTextTextEmailAddress);
        password = (EditText) findViewById(R.id.editTextTextPassword);
    }


    public View.OnClickListener login_buttonListener = v -> {
        String _username = username.toString();
        String _password = password.toString();

        if(SystemDataBase.usernameIsFound(_username).equals(false)){
            Toast.makeText(MainActivity.this, "Username is not found", Toast.LENGTH_LONG).show();
        }
        else{
            if(SystemDataBase.passwordValidation(_username, _password))
                openLogInActivity();
            else{
                Toast.makeText(MainActivity.this, "Invalid Username Password",Toast.LENGTH_LONG).show();
            }
        }
    };


    // Opens MainActivity2 , this is for the register button when clicked
    public View.OnClickListener register_buttonListener = v -> {
        openRegisterActivity();
//        Log.i("TAG1", "register button clicked" );
        String name = username.getText().toString();
        Log.i("name", name);
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