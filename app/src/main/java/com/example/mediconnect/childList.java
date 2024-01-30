package com.example.mediconnect;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class childList extends AppCompatActivity {

    ListView list;


    String[] maintitle ={
            "Dr. Eash Hoskote","Dr. Girish Hadli",
            "Dr. Naveen Kini ","Dr. Avani Hegde",
            "Dr. Shanthi Reddy","Dr. Arul Selvi",
            "Dr. Padmalatha Kadam","Dr. Ramesh S",
            "Dr. Vidisha Kumari","Dr. Kailash Gokral",
            "Dr. Janice Mathew","Dr. Veena V",
            "Dr. Kishor Y","Dr. Yerur",
    };

    String[] subtitle ={
            "Pediatric Care Clinic",
            "Child Health Center",
            "Tiny Tots Hospital",
            "Kids Wellness Institute",
            "KiddieCare Medical Center",
            "Little Angels Clinic",
            "Childhood Health Hub",
            "Pediatric Pulse Hospital",
            "Children's Care Center",
            "Tiny Hearts Specialists",
            "ChildGuardian Hospital",
            "Pediatric Vision Clinic",
            "ChildLink Cardiology Center",
            "KiddoGuard Pediatrics"

    };

    Integer[] imgid={
            R.drawable.d7,R.drawable.d3,
            R.drawable.d9,R.drawable.d1,
            R.drawable.d10,R.drawable.d2,
            R.drawable.d12,R.drawable.d3,
            R.drawable.d1,R.drawable.d10,
            R.drawable.d11,R.drawable.d5,
            R.drawable.d8,R.drawable.d9,

    };
    String qualification[]={
            "MD (Pediatrics), FAAP",
            "DCH, MRCPCH",
            "MBBS, DNB (Pediatrics)",
            "MD (Pediatrics), DM (Neonatology)",
            "MBBS, MD (Pediatrics)",
            "MD (Pediatrics), DCH",
            "MBBS, DNB (Pediatrics)",
            "MD (Pediatrics), Fellowship in Pediatric Cardiology",
            "MD (Pediatrics), DCH",
            "MD (Pediatrics), DNB (Pediatric Surgery)",
            "MD (Pediatrics), Fellowship in Pediatric Cardiology",
            "MBBS, MD (Pediatrics)",
            "MD (Pediatrics), DNB (Pediatrics)",
            "MBBS, MD (Pediatrics)",
    };
    String Exp []={
            "10 Years",
            "8 Years",
            "12 Years",
            "15 Years",
            "9 Years",
            "11 Years",
            "14 Years",
            "13 Years",
            "10 Years",
            "9 Years",
            "12 Years",
            "11 Years",
            "14 Years",
            "10 Years",


    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drlist);

        customAdapter adapter=new customAdapter(this, maintitle, subtitle,imgid);
        list=(ListView)findViewById(R.id.drlist);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                // TODO Auto-generated method stub
                //code specific to first list item
                Intent it=new Intent(childList.this, UserActivity.class);
                it.putExtra("name",maintitle[i]);
                it.putExtra("hospital",subtitle[i]);
                it.putExtra("qualifications",qualification[i]);
                it.putExtra("Experience",Exp[i]);
                it.putExtra("Image",imgid[i]);
                startActivity(it);


            }
        });

    }

}





