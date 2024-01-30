package com.example.mediconnect;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Brain extends AppCompatActivity {
    ListView list;
    String[] maintitle ={
            "Dr. Aisha Khan", "Dr. Rohit Patel",
            "Dr. Sania Ahmed", "Dr. James Mitchell",
            "Dr. Nandini Sharma", "Dr. Rajiv Kapoor",
            "Dr. Maya Gupta", "Dr. Vikram Verma",
            "Dr. Ananya Reddy", "Dr. Sunil Choudhary",
            "Dr. Fatima Sheikh", "Dr. Ryan Williams",
            "Dr. Priya Singh", "Dr. Arjun Rao",
            "Dr. Meera Patel"
    };
    String[] subtitle ={
            "NeuroCare Clinic", "BrainWave Hospital",
            "Cerebral Health Institute", "MindWell Neurology Center",
            "NeuroSolutions Clinic", "BrainTrust Medical Center",
            "NeuroVista Hospital", "Cognitive Wellness Clinic",
            "BrainHeal Medical Institute", "NeuroLife Care",
            "BrainCare Specialists", "NeuroGuardian Hospital",
            "CogniHealth Clinic", "BrainLink Neurology Center",
            "MindCare Institute"
    };
    Integer[] imgid={
            R.drawable.d1,R.drawable.d6,
            R.drawable.d5,R.drawable.d10,
            R.drawable.d4,R.drawable.d9,
            R.drawable.d12,R.drawable.d3,
            R.drawable.d11,R.drawable.d10,
            R.drawable.d1,R.drawable.d8,
            R.drawable.d4,R.drawable.d6,
            R.drawable.d5,

    };
    String qualification[]={
            "MD in Neurology, FRCP", "DM in Neurology, FAMS",
            "DNB in Neurosurgery, PhD", "MD in Neuroscience, FAAN",
            "DM in Neurology, MSc", "MD in Neurosurgery, FRCP",
            "DM in Neurology, FACC", "MD in Neuroscience, FRCP",
            "DNB in Neurology, PhD", "DM in Neurology, FAMS",
            "MD in Neurosurgery, FACC", "DM in Neurology, FRCP",
            "DNB in Neuroscience, MSc", "MD in Neurology, FAAN",
            "DM in Neurology, PhD"
    };
    String Exp []={
            "10 Years", "12 Years",
            "8 Years", "15 Years",
            "9 Years", "14 Years",
            "11 Years", "13 Years",
            "7 Years", "12 Years",
            "10 Years", "14 Years",
            "8 Years", "13 Years",
            "11 Years"


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
                Intent it=new Intent(Brain.this, UserActivity.class);
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
