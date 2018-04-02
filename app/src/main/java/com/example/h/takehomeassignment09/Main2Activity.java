package com.example.h.takehomeassignment09;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Main2Activity extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference carRef = database.getReference("car");
    private DatabaseReference carRefTwo = database.getReference("car2");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void set(View view) {
        carRef.setValue(new Car("Subaru", 4, false));
    }
    public void add(View view) {
        carRefTwo.push().setValue(new Car("Corvette", 2, true));
    }
}
