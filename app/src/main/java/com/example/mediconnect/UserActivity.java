package com.example.mediconnect;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



public class UserActivity extends AppCompatActivity {

    TextView un,ep,q,hn;
    ImageView iv;
    Button book;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.useractivity);
        un=findViewById(R.id.user_name);
        hn=findViewById(R.id.hosp_name);
        q=findViewById(R.id.qualif);
        ep=findViewById(R.id.Exp);
        iv=findViewById(R.id.img);
        book=findViewById(R.id.book);
        Intent in=getIntent();
            String name=in.getStringExtra("name");
            String hospital=in.getStringExtra("hospital");
            String qualification=in.getStringExtra("qualifications");
            String Experience=in.getStringExtra("Experience");
            int Image=in.getIntExtra("Image",R.drawable.d1);
            un.setText(name);
            hn.setText(hospital);
            q.setText(qualification);
            ep.setText(Experience);
            iv.setImageResource(Image);
            book.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent l=new Intent(UserActivity.this, booking.class);
                    l.putExtra("name",name);

                    startActivity(l);
                }
            });

       }
}
