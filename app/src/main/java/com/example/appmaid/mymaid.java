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
public class mymaid extends Activity {

    String email; String name; String mobile; String city; String locality; String street;
    Button b1;Button b2;
    DatabaseReference databaseinfo;Button b5;Button b6;Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mymaid);
       b1=findViewById(R.id.button_view);
        b2=findViewById(R.id.button_addmaids);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v)
            {
                Intent i=new Intent(mymaid.this,displaymaid.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v)
            {
                Intent i=new Intent(mymaid.this,addmaid.class);
                startActivity(i);
            }
        });


    }
}
