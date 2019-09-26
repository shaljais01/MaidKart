package com.example.appmaid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.appmaid.R;

import java.util.ArrayList;


public class toto extends Activity {

    String items1[];String text;
    String name;String email;
    TextView t; TextView t2;
    Button address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toto);

        name=(getIntent().getStringExtra("name"));
        t=findViewById(R.id.nameid);
        t.setText(getIntent().getStringExtra("name"));
        t2=findViewById(R.id.textView_email);
        t2.setText(getIntent().getStringExtra("email"));

        address=findViewById(R.id.button_address);
        address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent j=new Intent (toto.this,toto2.class);
                j.putExtra("name",name);
                j.putExtra("email",email);
                startActivity(j);
            }
        });
    }
}
