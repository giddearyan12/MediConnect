package com.example.mediconnect;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Eye extends AppCompatActivity {
    ListView list;
    String[] maintitle ={
            "Dr. Aisha Ahmed", "Dr. Kamal Verma",
            "Dr. Sneha Kapoor", "Dr. Rajat Sharma",
            "Dr. Nisha Patel", "Dr. Arjun Mehta",
            "Dr. Pooja Singh", "Dr. Vikram Khanna",
            "Dr. Ritu Gupta", "Dr. Ankit Kapoor",
            "Dr. Kavita Sharma", "Dr. Mohan Verma",
            "Dr. Neha Patel", "Dr. Sameer Kapoor",
            "Dr. Shikha Sharma"
    };

    String[] subtitle ={
            "VisionCare Eye Clinic", "Eyesight Hospital",
            "Optical Solutions Center", "EyeWellness Clinic",
            "ClearVision Hospital", "SightSavers Center",
            "FocusEye Institute", "CrystalClear Eye Clinic",
            "SharpSight Hospital", "VisionPlus Center",
            "EliteEye Care", "EagleEye Clinic",
            "SpectraVision Hospital", "EyeGuard Specialists",
            "PrecisionVision Center"
    };

    Integer[] imgid={
            R.drawable.d1,R.drawable.d10,
            R.drawable.d12,R.drawable.d6,
            R.drawable.d2,R.drawable.d9,
            R.drawable.d11,R.drawable.d3,
            R.drawable.d4,R.drawable.d10,
            R.drawable.d5,R.drawable.d10,
            R.drawable.d11,R.drawable.d3,R.drawable.d2,

    };
    String qualification[]={
            "MBBS, MS (Ophthalmology), DNB", "MD (Ophthalmology)",
            "MS (Ophthalmology), FRCS", "DNB (Ophthalmology)",
            "DO (Ophthalmology), FICO", "MD (Ophthalmology)",
            "DNB (Ophthalmology)", "MS (Ophthalmology), FAICO",
            "MD (Ophthalmology)", "DNB (Ophthalmology)",
            "MS (Ophthalmology)", "DNB (Ophthalmology)",
            "MD (Ophthalmology)", "MS (Ophthalmology), FICO",
            "DNB (Ophthalmology)"
    };
    String Exp []={
            "10 Years", "8 Years",
            "12 Years", "7 Years",
            "9 Years", "11 Years",
            "8 Years", "10 Years",
            "9 Years", "7 Years",
            "11 Years", "8 Years",
            "10 Years", "9 Years",
            "12 Years"


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
                Intent it=new Intent(Eye.this, UserActivity.class);
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
