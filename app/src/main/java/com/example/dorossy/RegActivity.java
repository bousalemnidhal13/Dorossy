package com.example.dorossy;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dorossy.DAO.AdminDAO;
import com.example.dorossy.Models.Admin;

// Reg stands for registration.
public class RegActivity extends AppCompatActivity {

    EditText editTextUserName, editTextPassWord;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);

        editTextUserName = findViewById(R.id.UserNameEdit);
        editTextPassWord = findViewById(R.id.PasswordEdit);
        loginButton = findViewById(R.id.LoginButton);

        AdminDAO AdmDao = new AdminDAO();

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // remove Implemetation...

//                AdmDao.remove("-NUqAR-t1MAV2yUCY51J").addOnSuccessListener(suc -> {
//                    Toast.makeText(getApplicationContext(), "NICE", Toast.LENGTH_SHORT).show();
//                }).addOnFailureListener(er -> {
//                    Toast.makeText(getApplicationContext(), ""+er.getMessage(), Toast.LENGTH_SHORT).show();
//                });


                // Update Implementation...

//                HashMap<String, Object> hashmap = new HashMap<>();
//                hashmap.put("username", editTextUserName.getText().toString());
//                hashmap.put("password", editTextPassWord.getText().toString());
//                Admin adm = new Admin(editTextUserName.getText().toString(), editTextPassWord.getText().toString());
//                AdmDao.update("-NUqAR-t1MAV2yUCY51J", hashmap).addOnSuccessListener(suc -> {
//                    Toast.makeText(getApplicationContext(), "NICE", Toast.LENGTH_SHORT).show();
//                }).addOnFailureListener(er -> {
//                    Toast.makeText(getApplicationContext(), ""+er.getMessage(), Toast.LENGTH_SHORT).show();
//                });


                // Add Implementation...

                Admin adm = new Admin(editTextUserName.getText().toString(), editTextPassWord.getText().toString());
                AdmDao.add(adm).addOnSuccessListener(suc -> {
                    Toast.makeText(getApplicationContext(), "NICE", Toast.LENGTH_SHORT).show();
                }).addOnFailureListener(er -> {
                    Toast.makeText(getApplicationContext(), ""+er.getMessage(), Toast.LENGTH_SHORT).show();
                });


                // For login...

//                if (editTextUserName.getText().toString().equals("admin") && editTextPassWord.getText().toString().equals("admin")) {
//                    startActivity(new Intent(RegActivity.this, AMDActivity.class));
//                } else {
//                    Toast.makeText(getApplicationContext(), "Something Wrong!", Toast.LENGTH_SHORT).show();
//                }
            }
        });
    }

}
