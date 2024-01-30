package com.example.mediconnect;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class register extends AppCompatActivity {
    Button regbutton;
    EditText name;
    EditText Email;
    EditText pass;
    EditText Phno;
    EditText Age;
    EditText gender;
    FirebaseAuth auth;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        name = findViewById(R.id.patientname);
        Email = findViewById(R.id.patientaddr);
        pass = findViewById(R.id.pass);
        Phno = findViewById(R.id.patientno);
        Age = findViewById(R.id.patientAge);
        gender = findViewById(R.id.patientgender);
        regbutton = findViewById(R.id.bookappoint);
        auth=FirebaseAuth.getInstance();



        regbutton.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View view) {
                                             String fullname = name.getText().toString();
                                             String email = Email.getText().toString();
                                             String password = pass.getText().toString();
                                             String ph = Phno.getText().toString();
                                             String age = Age.getText().toString();
                                             String Gender = gender.getText().toString();
                                             if (TextUtils.isEmpty(email)) {
                                                 Toast.makeText(register.this, "Enter Email", Toast.LENGTH_SHORT).show();
                                             } else if (TextUtils.isEmpty(password)) {
                                                 Toast.makeText(register.this, "Enter Password", Toast.LENGTH_SHORT).show();
                                                 return;
                                             } else if (password.length() < 6) {
                                                 Toast.makeText(register.this, "Password too Short", Toast.LENGTH_SHORT).show();
                                             } else {
                                                 auth.createUserWithEmailAndPassword(email, password)
                                                         .addOnCompleteListener( new OnCompleteListener<AuthResult>() {
                                                             @Override
                                                             public void onComplete(@NonNull Task<AuthResult> task) {
                                                                 if (task.isSuccessful()) {
                                                                     // Sign in success, update UI with the signed-in user's information
                                                                     Toast.makeText(register.this, "Registration Successfull", Toast.LENGTH_SHORT).show();

                                                                 } else {
                                                                     // If sign in fails, display a message to the user.
                                                                     Log.w(TAG, "createUserWithEmail:failure", task.getException());
                                                                     Toast.makeText(register.this, "Authentication failed.",
                                                                             Toast.LENGTH_SHORT).show();

                                                                 }
                                                             }
                                                         });
                                             }
                                         }
                                     });



    }

}


