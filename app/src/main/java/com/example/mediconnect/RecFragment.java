package com.example.mediconnect;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RecFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RecFragment extends Fragment {
    ImageView iv;
    Button b,viewImagesButton;
    private final int GALLERY_REQ_CODE=1000;
    private ArrayList<Uri> imageUriList;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public RecFragment() {
        // Required empty public constructor
        imageUriList = new ArrayList<>();
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_rec, container, false);
        iv=v.findViewById(R.id.pic);
        b=v.findViewById(R.id.upload);
        viewImagesButton = v.findViewById(R.id.viewImagesButton);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_PICK);
                i.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(i,GALLERY_REQ_CODE);
            }
        });
        viewImagesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate to DisplayImagesActivity
                Intent intent = new Intent(getActivity(), DisplayImagesActivity.class);
                intent.putExtra("imageUriList", imageUriList);
                startActivity(intent);
            }
        });
        return v;

    }

    @Override
public void onActivityResult(int requestCode,int resultCode,@Nullable Intent data)
    {
        super.onActivityResult(requestCode,resultCode,data);
        if(resultCode==-1){
            if(requestCode==GALLERY_REQ_CODE)
            {
                Uri selectedImageUri = data.getData();
                iv.setImageURI(selectedImageUri);

                // Save the image URI to the ArrayList
                imageUriList.add(selectedImageUri);

            }
        }
    }

}