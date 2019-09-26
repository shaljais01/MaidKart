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
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
public class fulltime extends Activity {

    String city; String locality;
    EditText ecity; EditText elocality;
    DatabaseReference databaseinfo;
    Button b11;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fulltime);
        ecity=findViewById(R.id.editText_city);
        elocality=findViewById(R.id.editText_locality);
        city=ecity.getText().toString();
        locality=elocality.getText().toString();
        b11=findViewById(R.id.button4);


        b11.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v)
            {
                Intent i=new Intent(fulltime.this, fulltime2.class);
                i.putExtra("city",city);
                i.putExtra("locality",locality);
                startActivity(i);
            }
        });

    }
}
