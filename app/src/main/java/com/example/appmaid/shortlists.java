package com.example.appmaid;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.appmaid.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
public class shortlists extends Activity {

    String email; String name; String mobile;
    EditText e1; EditText e2; EditText e3;
    Button b1;Button b2;Button b3;Button b4;
    DatabaseReference databaseinfo;Button b5;Button b6;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shortlists);

        databaseinfo= FirebaseDatabase.getInstance().getReference("mymaidinfo");

        e1=findViewById(R.id.editText_email);
        e2=findViewById(R.id.editText_name);
        e1=findViewById(R.id.editText_mobile);
        email="shalinij@gmail.com";
        name="Veena";
        mobile="8987756564";

        b6=findViewById(R.id.button5);
        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v)
            {
                fill();
            }
        });
        b5=findViewById(R.id.button_display);
        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v)
            {
                Intent j=new Intent (shortlists.this,displaymaid.class);

                startActivity(j);
            }
        });

    }
    private void fill()
    {
        String mobile3 = email;

        String email3 = name;
        String name3 = mobile;

        if(!TextUtils.isEmpty(mobile3)){
            String roll=databaseinfo.push().getKey();
            mymaidinfo info=new mymaidinfo(email3,name3,mobile3);
            databaseinfo.child(roll).setValue(info);

            Toast.makeText(this,"Info added",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this,"info required",Toast.LENGTH_SHORT).show();
        }

    }
}
