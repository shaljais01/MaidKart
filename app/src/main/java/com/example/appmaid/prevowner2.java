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
public class prevowner2 extends Activity {

    String email; String name; String mobile; String city;
    String locality; String street;String type; String currentowner; String previousowner;
    Button b1;Button b2;EditText e1;
    DatabaseReference databaseinfo;
    TextView t12; TextView t14; TextView t16; TextView t18; TextView t20;
    TextView t22; TextView t24; TextView t26;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevowner2);
        t12=findViewById(R.id.textView12);
        t14=findViewById(R.id.textView14);
        t16=findViewById(R.id.textView16);
        t18=findViewById(R.id.textView18);
        t20=findViewById(R.id.textView20);
        t22=findViewById(R.id.textView22);
        t24=findViewById(R.id.textView24);
        t26=findViewById(R.id.textView26);

      t12.setText(getIntent().getStringExtra("email"));
        t14.setText(getIntent().getStringExtra("name"));
        t16.setText(getIntent().getStringExtra("mobile"));
        t18.setText(getIntent().getStringExtra("city"));
        t20.setText(getIntent().getStringExtra("locality"));
        t22.setText(getIntent().getStringExtra("type"));
        t24.setText(getIntent().getStringExtra("previousowner"));
        t26.setText(getIntent().getStringExtra("currentowner"));
    }
}
