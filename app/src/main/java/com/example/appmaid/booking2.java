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
public class booking2 extends Activity {

    String email; String name; String mobile; String city; String locality; String street;
    Button b1;Button b2;Button b3;Button b4;String ss;
    DatabaseReference databaseinfo;Button b5;Button b6;Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking2);

        databaseinfo= FirebaseDatabase.getInstance().getReference("info");



        ArrayList<String> labels1 = new ArrayList<>();
        labels1.add("Full-time(24*7)");
        labels1.add("Part-time(5-10 hours)");
        labels1.add("Part-time(3-4 hours)");
        labels1.add("Part-time(11-12 hours)");
        Spinner spinner=(Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,labels1);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                ss= parent.getItemAtPosition(position).toString();

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
       /* b6=findViewById(R.id.button_book);
        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v)
            {
                //Intent i=new Intent(toto3.this,booking.class);
                //startActivity(i);
            }
        });*/

    }
}
