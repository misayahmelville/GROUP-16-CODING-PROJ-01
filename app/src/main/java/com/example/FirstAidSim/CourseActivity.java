package com.example.FirstAidSim;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CourseActivity extends AppCompatActivity {
    private static final String TAG = "CourseActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        Log.d(TAG,"onCreate: started");
        getIncomingIntent();
    }

    // This is so I can get the individual title and descriptions for each course
    private void getIncomingIntent(){
        if(getIntent().hasExtra("Title")  && getIntent().hasExtra("Description")){
            Log.d(TAG,"GETINCOMINGINTENT");
            String title = getIntent().getStringExtra("Title");
            String description = getIntent().getStringExtra("Description");
            setDescription(title,description);
        }
    }

    private void setDescription(String title,String description){

        TextView courseTitle = findViewById(R.id.coursenameAct);
        TextView courseDescription = findViewById(R.id.decriptionAct);
        courseTitle.setText(title);
        courseDescription.setText(description);

    }
}
