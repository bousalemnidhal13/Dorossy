package com.example.dorossy;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ManagerActivity extends AppCompatActivity {

    EditText usernameEdit, passwordEdit, schoolEdit;
    Button buttonLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager);

        usernameEdit = findViewById(R.id.usernameEditText);
        passwordEdit = findViewById(R.id.passwordEditText);
        schoolEdit = findViewById(R.id.schoolEditText);

        buttonLog = findViewById(R.id.buttonLogin);

        buttonLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // go to the next activity if the inputs are correct.
            }
        });

    }
}
