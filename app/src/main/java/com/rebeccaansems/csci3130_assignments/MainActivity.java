package com.rebeccaansems.csci3130_assignments;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button validateButton = (Button)findViewById(R.id.buttonValidatePassword);
        validateButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                validateButtonClicked();
            }
        });
    }


    public void validateButtonClicked(){
        if(passwordValidator(((EditText)findViewById(R.id.testInputPassword)).getText().toString())){
            ((TextView)findViewById(R.id.textViewPasswordStrength)).setText("Password is strong");
        }
        else {
            ((TextView)findViewById(R.id.textViewPasswordStrength)).setText("Password is weak");
        }
    }


    public static boolean passwordValidator(String password){
        if(password.length() > 8 &&
                !password.equals("password") &&
                password.matches(".*[$&+,:;=?@#|].*")&&
                password.matches(".*[0-9].*") &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[a-z].*")){
            return true;
        }
        return false;
    }
}
