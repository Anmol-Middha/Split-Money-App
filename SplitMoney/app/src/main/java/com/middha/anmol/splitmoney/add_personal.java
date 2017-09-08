package com.middha.anmol.splitmoney;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.google.firebase.database.FirebaseDatabase;

public class add_personal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        FirebaseDatabase
        setContentView(R.layout.activity_add_personal);
        Spinner spinner = (Spinner) findViewById(R.id.category);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.category, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        //CalendarView calendarView= (CalendarView) findViewById(R.id.dateval);
        //long val=calendarView.getDate();
        //Toast.makeText(getApplicationContext(),"val: "+val,Toast.LENGTH_SHORT).show();
    }
}
