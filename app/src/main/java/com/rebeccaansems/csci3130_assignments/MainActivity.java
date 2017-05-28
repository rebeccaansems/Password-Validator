package com.rebeccaansems.csci3130_assignments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static boolean passwordValidator(String password){
        if(password.length() > 8 &&
                !password.equals("password")){
            return true;
        }
        return false;
    }
}
