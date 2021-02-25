package com.example.FirstAidSim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class LogInActivity extends AppCompatActivity {
    ArrayList<Course> courses_list;

    String cprDescription = "Before giving CPR\n"+
            "1. Check the scene and the person. Make sure the scene is safe, then tap the person on the shoulder and shout \"Are you OK?\" to ensure that the person needs help.\n" +
            "2.Call 911 for assistance. If it's evident that the person needs help, call (or ask a bystander to call) 911, then send someone to get an AED. (If an AED is unavailable, or a there is no bystander to access it, stay with the victim, call 911 and begin administering assistance.)\n" +
            "3.Open the airway. With the person lying on his or her back, tilt the head back slightly to lift the chin.\n"+
            "4.Check for breathing. Listen carefully, for no more than 10 seconds, for sounds of breathing. (Occasional gasping sounds do not equate to breathing.) If there is no breathing begin CPR.\n"+
            "CPR steps\n"+
            "1. Push hard, push fast. Place your hands, one on top of the other, in the middle of the chest. Use your body weight to help you administer compressions that are at least 2 inches deep and delivered at a rate of at least 100 compressions per minute. \n"+
            "2.Deliver rescue breaths. With the person's head tilted back slightly and the chin lifted, pinch the nose shut and place your mouth over the person's mouth to make a complete seal. Blow into the person's mouth to make the chest rise. Deliver two rescue breaths, then continue compressions.\n" +
            "\n" +
            "Note: If the chest does not rise with the initial rescue breath, re-tilt the head before delivering the second breath. If the chest doesn't rise with the second breath, the person may be choking. After each subsequent set of 30 chest compressions, and before attempting breaths, look for an object and, if seen, remove it.\n"+
            "3.Continue CPR steps. Keep performing cycles of chest compressions and breathing until the person exhibits signs of life, such as breathing, an AED becomes available, or EMS or a trained medical responder arrives on scene.\n" +
            "\n" +
            "Note: End the cycles if the scene becomes unsafe or you cannot continue performing CPR due to exhaustion.\n" +
            "\n \n";
    String aedDescription = "1. Turn on the AED and follow the visual and/or audio prompts.\n"+
            "2.Open the person's shirt and wipe his or her bare chest dry. If the person is wearing any medication patches, you should use a gloved (if possible) hand to remove the patches before wiping the person's chest.\n"+
            "3.Attach the AED pads, and plug in the connector (if necessary).\n"+
            "4.Make sure no one is, including you, is touching the person. Tell everyone to \"stand clear.\"\n"+
            "5.Push the \"analyze\" button (if necessary) and allow the AED to analyze the person's heart rhythm.\n"+
            "6.If the AED recommends that you deliver a shock to the person, make sure that no one, including you, is touching the person – and tell everyone to \"stand clear.\" Once clear, press the \"shock\" button.\n"+
            "7.Begin CPR after delivering the shock. Or, if no shock is advised, begin CPR. Perform 2 minutes (about 5 cycles) of CPR and continue to follow the AED's prompts. If you notice obvious signs of life, discontinue CPR and monitor breathing for any changes in condition.\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cardview_course);

        courses_list = new ArrayList<>();
        courses_list.add(new Course("CPR",cprDescription,R.drawable.cpr));
        courses_list.add(new Course("AED",aedDescription,R.drawable.aed));
        courses_list.add(new Course("ASD",aedDescription,R.drawable.aed));


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recylerView_id);
        RecyclerViewAdapter mAdapter = new RecyclerViewAdapter(this,courses_list);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(mAdapter);


    }
}