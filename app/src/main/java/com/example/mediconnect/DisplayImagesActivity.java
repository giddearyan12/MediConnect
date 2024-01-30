// DisplayImagesActivity.java
package com.example.mediconnect;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DisplayImagesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_images);


        ArrayList<Uri> imageUriList = getIntent().getParcelableArrayListExtra("imageUriList");


        LinearLayout linearLayout = findViewById(R.id.linearLayoutImagesContainer);


        for (Uri imageUri : imageUriList) {
            ImageView imageView = new ImageView(this);
            imageView.setImageURI(imageUri);


            linearLayout.addView(imageView);


            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.setMargins(0, 0, 0, 16);
            imageView.setLayoutParams(layoutParams);
        }
    }
}
