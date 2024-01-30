package com.example.mediconnect;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

public class drlist extends AppCompatActivity{


        ListView list;
        private DatabaseReference df;
        private ArrayList<String> arrayList=new ArrayList<>();

        String[] maintitle ={
                "Title 1","Title 2",
                "Title 3","Title 4",
                "Title 5","Title 6",
                "Title 7","Title 8",
                "Title 9","Title 10",
                "Title 11","Title 12",
                "Title 13","Title 14",
                "Title 15","Title 16",
                "Title 17","Title 18",
                "Title 19","Title 20",
                "Title 21","Title 22",
        };

        String[] subtitle ={
                "Sub Title 1","Sub Title 2",
                "Sub Title 3","Sub Title 4",
                "Sub Title 5","Sub Title 6",
                "Sub Title 7","Sub Title 8",
                "Sub Title 9","Sub Title 10",
                "Sub Title 11","Sub Title 12",
                "Sub Title 13","Sub Title 14",
                "Sub Title 15","Sub Title 16",
                "Sub Title 17","Sub Title 18",
                "Sub Title 19","Sub Title 20",
                "Sub Title 21","Sub Title 22",
        };

        Integer[] imgid={
                R.drawable.d1,R.drawable.d2,
                R.drawable.d3,R.drawable.d4,
                R.drawable.d5,R.drawable.d6,
                R.drawable.d7,R.drawable.d8,
                R.drawable.d9,R.drawable.d10,
                R.drawable.d1,R.drawable.d2,
                R.drawable.d3,R.drawable.d4,
                R.drawable.d5,R.drawable.d6,
                R.drawable.d7,R.drawable.d8,
                R.drawable.d9,R.drawable.d10,
                R.drawable.d1,R.drawable.d2,
        };
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.drlist);
            df= FirebaseDatabase.getInstance().getReference();
            customAdapter adapter=new customAdapter(this, maintitle, subtitle,imgid);
            list=(ListView)findViewById(R.id.drlist);
            list.setAdapter(adapter);


            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    // TODO Auto-generated method stub
                    if(position == 0) {

                                Intent p=new Intent(drlist.this, dr_desc.class);
                                startActivity(p);

                        Toast.makeText(getApplicationContext(),"Place Your First Option Code",Toast.LENGTH_SHORT).show();
                    }

                    else if(position == 1) {
                        //code specific to 2nd list item
                        Intent p=new Intent(drlist.this, dr_desc.class);
                        startActivity(p);
                        Toast.makeText(getApplicationContext(),"Place Your Second Option Code",Toast.LENGTH_SHORT).show();
                    }

                    else if(position == 2) {
                        Intent p=new Intent(drlist.this, dr_desc.class);
                        startActivity(p);
                        Toast.makeText(getApplicationContext(),"Place Your Third Option Code",Toast.LENGTH_SHORT).show();
                    }
                    else if(position == 3) {
                        Intent p=new Intent(drlist.this, dr_desc.class);
                        startActivity(p);
                        Toast.makeText(getApplicationContext(),"Place Your Forth Option Code",Toast.LENGTH_SHORT).show();
                    }
                    else if(position == 4) {
                        Intent p=new Intent(drlist.this, dr_desc.class);
                        startActivity(p);
                        Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
                    }

                }
            });

        }
    }


