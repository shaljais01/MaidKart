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
public class post2 extends Activity {

    String email; String name; String mobile; String city; String locality; String street;
    Button b1; DatabaseReference databaseinfo;

StringBuilder builder;  ArrayList<String> posts = new ArrayList<String>(100);
    TextView e1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.post2);
        e1=findViewById(R.id.textView_ee);

        databaseinfo= FirebaseDatabase.getInstance().getReference("post");

        FirebaseDatabase.getInstance().getReference().child("post")
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        for (DataSnapshot snapshot : dataSnapshot.getChildren())
                        {
                            Info3 user = snapshot.getValue(Info3.class);
                            String s=user.post;
                            posts.add(s);
                            e1.setText(s);

                        }
                    }
                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                    }
                });
    }
}
