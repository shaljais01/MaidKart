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
public class displaymaid extends Activity {

    String email; String name; String mobile; String city; String locality; String street;
    Button b1;Button b2;Button b3;Button b4;Button b7;
    DatabaseReference databaseinfo;Button b5;Button b6;
    TextView t1;
    StringBuilder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displaymaid);
        databaseinfo= FirebaseDatabase.getInstance().getReference("infomaid");
        t1=findViewById(R.id.textView35);

        FirebaseDatabase.getInstance().getReference().child("infomaid")
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot)
                    {
                        for (DataSnapshot snapshot : dataSnapshot.getChildren())
                        {
                            Infomaid user = snapshot.getValue(Infomaid.class);
                         if(user.currentowner.equals("Shalini"))
                         {
                             String name=user.name;
                             String mobile=user.mobile;
                             builder.append(name+"\n"+mobile);
                         }

                        }
                    }
                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                    }
                });
        t1.setText("1. alka@gmail.com"+"\n"+"Alka Jiswal"+"\n"+"9936280779"+"\n"+"\n"+"2. arundhati@gmail.com"+"\n"+"Arundhati"+"\n"+"876786757"+"\n"+"\n"+"3. renu@gmail.com"+"\n"+"Renu Rastogi"+"\n"+"86765654"+"\n"+"\n"+"4. mansi@gmail.com"+"\n"+"Mansi Goel"+"\n"+"87675667"+"\n"+"\n"+"5. shikha@gmail.com"+"\n"+"Shikha Rathore"+"\n"+"876547767"+"\n");

    }
}
