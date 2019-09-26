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
public class prevowner extends Activity {

    String email1; String name; String mobile; String city; String locality; String street;String type; String currentowner; String previousowner;
    Button b2;EditText e1;Button b11;String email2;
    DatabaseReference databaseinfo;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevowner);

        b11=findViewById(R.id.button_confirm);

        databaseinfo= FirebaseDatabase.getInstance().getReference("infomaid");


        e1=findViewById(R.id.editText_email);
         email2=e1.getText().toString();

        FirebaseDatabase.getInstance().getReference().child("infomaid")
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        for (DataSnapshot snapshot : dataSnapshot.getChildren())
                        {
                            Infomaid user = snapshot.getValue(Infomaid.class);

                            if(user.email.equals(email2)==true) {
                                email1 = user.getemail();
                                name = user.name;
                                mobile = user.mobile;
                                city = user.city;
                                locality = user.locality;
                                street = user.street;
                                type = user.type;
                                currentowner = user.currentowner;
                                previousowner = user.previousowner;
                            }
                        }
                    }
                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                    }
                });

       email1="alka@gmail.com";
       name="Ala Raj";
       mobile="7986053223";
       city="Delhi";
       locality="Kashmere Gate";
       street="church";
       type="Full Time";
       currentowner="Dr Bansal";
       previousowner="Mrs Khan";
        b11.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v)
            {
                Intent i=new Intent(prevowner.this, prevowner2.class);
                i.putExtra("email",email1);
                i.putExtra("name",name);
                i.putExtra("mobile",mobile);
                i.putExtra("city",city);
                i.putExtra("locality",locality);
                i.putExtra("street",street);
                i.putExtra("type",type);
                i.putExtra("currentowner",currentowner);
                i.putExtra("previousowner",previousowner);
                startActivity(i);
            }
        });



    }
}
