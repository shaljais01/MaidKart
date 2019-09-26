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
public class booking extends Activity {

    String email; String name; String mobile; String city; String locality; String street;
    Button b1;Button b2;Button b3;Button b4;
    DatabaseReference databaseinfo;Button b5;Button b6;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        databaseinfo= FirebaseDatabase.getInstance().getReference("info");

        b6=findViewById(R.id.button_enquire);
        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v)
            {
                Intent i=new Intent(booking.this,booking2.class);
                startActivity(i);
            }
        });

    }
}
