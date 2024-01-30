package com.example.mediconnect;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class booking extends AppCompatActivity {
    EditText pname,paddr,pno,page,pgender;
    Button ba;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.booking);
        pname=findViewById(R.id.patientname);
        paddr=findViewById(R.id.patientaddr);
        pno=findViewById(R.id.patientno);
        page=findViewById(R.id.patientAge);
        pgender=findViewById(R.id.patientgender);
        ba=findViewById(R.id.bookappoint);
        Intent in=getIntent();
        String name=in.getStringExtra("name");
        String hospital=in.getStringExtra("hospital");
        int Image=in.getIntExtra("Image",R.drawable.d1);
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pn=pname.getText().toString();
                String pa=paddr.getText().toString();
                String pno1=pno.getText().toString();
                String pa1=page.getText().toString();
                String pg=pgender.getText().toString();
                if (TextUtils.isEmpty(pn)) {
                    Toast.makeText(booking.this, "Enter Patient", Toast.LENGTH_SHORT).show();
                    return;
                }else if (TextUtils.isEmpty(pa)) {
                    Toast.makeText(booking.this, "Enter Patient Address", Toast.LENGTH_SHORT).show();
                    return;
                }else if (TextUtils.isEmpty(pno1)) {
                    Toast.makeText(booking.this, "Enter Patient Phone Number", Toast.LENGTH_SHORT).show();
                    return;
                }else if (TextUtils.isEmpty(pa1)) {
                    Toast.makeText(booking.this, "Enter Patient Age", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if (TextUtils.isEmpty(pg)) {
                    Toast.makeText(booking.this, "Enter Patient Gender", Toast.LENGTH_SHORT).show();
                    return;
                }
                else {
                    Toast.makeText(booking.this, "Appointment Booked", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
