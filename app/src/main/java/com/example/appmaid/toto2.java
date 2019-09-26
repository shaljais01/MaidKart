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



public class toto2 extends Activity {

    String items1[];String text;
    String name;String email;
    Button b2;
    Button b1;

    TextView t; TextView t2;
    Button address; EditText emailad; EditText nameof;
    String mobile; String locality; String city; String street; String fullname; String mail;
    EditText mobile1;EditText city1; EditText locality1;EditText street1;
    DatabaseReference databaseinfo;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toto2);
        b2=findViewById(R.id.button_proceed);

        name=(getIntent().getStringExtra("name"));



        //FirebaseDatabase database = FirebaseDatabase.getInstance();
        //DatabaseReference myRef = database.getReference("message");

        //myRef.setValue("Hello, World!");
         databaseinfo= FirebaseDatabase.getInstance().getReference("info");

        emailad=findViewById(R.id.editText_emailadd);
        emailad.setText(getIntent().getStringExtra("email"));

        nameof=findViewById(R.id.editText_name);
        nameof.setText(getIntent().getStringExtra("name"));
        b1=findViewById(R.id.button_map);
        b2=findViewById(R.id.button_proceed);
        mobile1= findViewById(R.id.editText_contact);

        mobile=mobile1.getText().toString();

        city1=findViewById(R.id.editText_city);

        city=city1.getText().toString();

        locality1=findViewById(R.id.editText_locality);

        locality=locality1.getText().toString();
        street1=findViewById(R.id.editText_street);

        street=street1.getText().toString();


        mail=(getIntent().getStringExtra("email"));
        fullname=(getIntent().getStringExtra("name"));
        mobile=mobile1.getText().toString();


        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v)
            {
               Intent i=new Intent(toto2.this, toto3.class);
                i.putExtra("email",email);
                i.putExtra("name",name);
                i.putExtra("mobile",mobile);
                i.putExtra("city",city);
                i.putExtra("locality",locality);
                i.putExtra("street",street);

                fill();
                startActivity(i);
            }
        });
    }
    private void fill()
    {
       String em2 = emailad.getText().toString().trim();
        String em=em2;
        String name2 = nameof.getText().toString().trim();
        String mobile2 = mobile1.getText().toString().trim();
        String city2 = city1.getText().toString().trim();
        String locality2=locality1.getText().toString().trim();
        String street2=street1.getText().toString().trim();
       em2="shalinijaiswal421@gmail.com";
       name2="Shalini";
        em=em2;

        if(!TextUtils.isEmpty(em)){
            String info1=databaseinfo.push().getKey();
            Info2 info=new Info2(em2, name2, mobile2, city2, locality2, street2);
            databaseinfo.child(info1).setValue(info);

            Toast.makeText(this,"Info added",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this,"roll no required",Toast.LENGTH_SHORT).show();
        }

    }
}

