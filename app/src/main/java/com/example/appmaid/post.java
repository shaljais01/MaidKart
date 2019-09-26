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
public class post extends Activity {

    String email; String name; String mobile; String city; String locality; String street;
    Button b1;
    EditText pp;
    DatabaseReference databaseinfo;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
        b1=findViewById(R.id.button_post);
        pp=findViewById(R.id.editText_pp);
        databaseinfo= FirebaseDatabase.getInstance().getReference("post");
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v)
            {
                String post22 = pp.getText().toString().trim();
                if(!TextUtils.isEmpty(post22)){
                    String roll=databaseinfo.push().getKey();
                    Info3 info=new Info3(post22);
                    databaseinfo.child(roll).setValue(info);
                }
                else
                {

                }

                Intent i=new Intent(post.this, post2.class);
                startActivity(i);
            }
        });
    }
}
