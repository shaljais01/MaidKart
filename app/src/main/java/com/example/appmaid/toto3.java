package com.example.appmaid;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.appmaid.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
public class toto3 extends Activity {

    String email; String name; String mobile; String city; String locality; String street;
    Button b1;Button b2;Button b3;Button b4;Button b7;Button b8;Button b9;
    Button b11;Button b13;
    Button b10;
    DatabaseReference databaseinfo;Button b5;Button b6;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toto3);

        databaseinfo= FirebaseDatabase.getInstance().getReference("info");

        email = (getIntent().getStringExtra("email"));
        name = (getIntent().getStringExtra("name"));
        mobile = (getIntent().getStringExtra("mobile"));
        city = (getIntent().getStringExtra("city"));
        locality = (getIntent().getStringExtra("locality"));
        street = (getIntent().getStringExtra("street"));
        b1=findViewById(R.id.button_community);
        b5=findViewById(R.id.button_full);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v)
            {
                Intent i=new Intent(toto3.this, post.class);
                startActivity(i);
            }
        });

        b3=findViewById(R.id.button_boss);
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v)
            {
                Intent i=new Intent(toto3.this, prevowner.class);
               startActivity(i);
            }
        });
        b4=findViewById(R.id.button_part);

        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v)
            {
                Intent i=new Intent(toto3.this,parttime.class);
                startActivity(i);
            }
        });
        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v)
            {
                Intent i=new Intent(toto3.this,fulltime.class);
                startActivity(i);
            }
        });
       b6=findViewById(R.id.button_book);
        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v)
            {
                Intent i=new Intent(toto3.this,booking.class);
                startActivity(i);
            }
        });
        b7=findViewById(R.id.button_mymaid);
        b7.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v)
            {
                Intent i=new Intent(toto3.this,mymaid.class);
                startActivity(i);
            }
        });
        b8=findViewById(R.id.button_videos);
        b8.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v)
            {
                Intent i=new Intent(toto3.this,displayvideos.class);
                startActivity(i);
            }
        });
        b9=findViewById(R.id.button_short);
        b9.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v)
            {
                Intent i=new Intent(toto3.this,shortlists.class);
                startActivity(i);
            }
        });
        b10=findViewById(R.id.button_profile);
        b10.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v)
            {
                Intent i=new Intent(toto3.this,profile.class);
                startActivity(i);
            }
        });

        b11=findViewById(R.id.button_query);
        b11.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v)
            {
                Intent i=new Intent(toto3.this,query.class);
                startActivity(i);
            }
        });
    }
}
