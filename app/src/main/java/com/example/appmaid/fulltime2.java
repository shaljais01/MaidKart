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
public class fulltime2 extends Activity {

    String city; String locality;
    EditText ecity; EditText elocality;
    DatabaseReference databaseinfo;
    String nemail; String nname; String nmobile; String ncity; String nlocality; String nstreet;
    String ntype;String ncurrent; String nprev;
    StringBuffer bb;
    StringBuilder builder;TextView e1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parttime2);
        e1=findViewById(R.id.textView27);

        databaseinfo= FirebaseDatabase.getInstance().getReference("infomaid");

        city=(getIntent().getStringExtra("city"));
        locality=getIntent().getStringExtra("locality");

        FirebaseDatabase.getInstance().getReference().child("infomaid")
                .addListenerForSingleValueEvent(new ValueEventListener()
                {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        for (DataSnapshot snapshot : dataSnapshot.getChildren())
                        {
                            Infomaid user = snapshot.getValue(Infomaid.class);

                            if(user.city.equals(city)==true && user.locality.equals(locality) && user.type.equals("part-time")) {
                                nemail = user.email;
                                nname = user.name;
                                nmobile = user.mobile;
                                ncity = user.city;
                                nlocality = user.locality;
                                nstreet = user.street;
                                ntype = user.type;
                                ncurrent = user.currentowner;
                                nprev= user.previousowner;

                                builder.append(nemail + "\n");
                                builder.append(nname + "\n");
                                builder.append(nmobile + "\n");
                                builder.append(ncity + "\n");
                                builder.append(nlocality + "\n");
                                builder.append(nstreet + "\n");
                                builder.append(ntype + "\n");
                                builder.append(ncurrent + "\n");
                                builder.append(nprev + "\n");
                            }
                        }
                    }
                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                    }
                });

        e1.setText("abc@gmail.com"+"\n"+"9967786669"+"\n"+"Alka"+"\n"+"currentowner:"+"Mukesh"+"\n"+"\n"+"\n+"+"ade@gmail.com"+"\n"+"9967786899"+"\n"+"Arnav"+"\n"+"currentowner:"+"Mukesh"+"\n"+"\n"+"\n+"+"pop@gmail.com"+"\n"+"9967788899"+"\n"+"Arun"+"\n"+"currentowner:"+"Shalini");

    }
}
