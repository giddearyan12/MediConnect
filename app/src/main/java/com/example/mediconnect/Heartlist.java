package com.example.mediconnect;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Heartlist extends AppCompatActivity {
    ListView list;


    String[] maintitle ={
            "Dr. Ashwin M Daware ","Dr. Kishor K S",
            "Dr. Narayana Murthy","Dr. Prabhakar Koregol",
            "Dr. Pradeep Kumar","Dr. Raghu Nandhan",
            "Dr. Shyam Sundar","Dr. Jagdeesh H V",
            "Dr. Kumar Kenchappa","Dr. Swapna Jadhav",
            "Dr. Aarav Patel" , "Dr. Priya Sharma" ,
            "Dr. Rajesh Kumar" , "Dr. Meera Desai" ,


    };

    String[] subtitle ={
            "CardioCure Heart Center", "PulseCardiac Clinic",
            "CardioVitality Hospital", "HeartBeat Wellness Institute",
            "CardiaCare Medical Center", "HeartSavers Clinic",
            "Coronary Health Hub", "CardioPulse Hospital",
            "Heartwise Medical Institute", "CardiaLife Center",
            "CardioCare Specialists", "HeartGuardian Hospital",
            "CardiaVision Clinic", "HeartLink Cardiology Center",

    };

    Integer[] imgid={
            R.drawable.d8,R.drawable.d3,
            R.drawable.d9,R.drawable.d6,
            R.drawable.d3,R.drawable.d10,
            R.drawable.d7,R.drawable.d8,
            R.drawable.d9,R.drawable.d12,
            R.drawable.d6,R.drawable.d4,
            R.drawable.d7,R.drawable.d2,

    };
    String qualification[]={
            "MBBS, MD (Cardiology)", "MD (Cardiology)",
            "DM (Cardiology)", "MD (Cardiology)",
            "DM (Cardiology)", "MD (Cardiology)",
            "DM (Cardiology)", "MD (Cardiology)",
            "DM (Cardiology)", "MD (Cardiology)",
            "DM (Cardiology)", "MD (Cardiology)",
            "DM (Cardiology)", "MD (Cardiology)",
    };
    String Exp []={
            "15 years", "12 years",
            "10 years", "14 years",
            "11 years", "13 years",
            "9 years", "16 years",
            "8 years", "14 years",
            "12 years", "17 years",
            "11 years", "15 years",


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

                Intent it=new Intent(Heartlist.this, UserActivity.class);
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
