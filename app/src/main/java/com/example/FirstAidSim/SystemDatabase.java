package com.example.FirstAidSim;

import java.util.Vector;

//The system database will hold all every user's information
public class SystemDatabase {
    Vector<User> newuser = new Vector(); //Array holding all user's data
    int usersStored; //Number of users stored in user's database

    //Add more users to database
    public void createAccount(String firstName, String lastName, int age, String username, String password) {
        newuser.add(new User(firstName, lastName, age, username, password));
        usersStored = newuser.size();
    }

}
