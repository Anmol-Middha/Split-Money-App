package com.middha.anmol.splitmoney;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class AddExpense extends AppCompatActivity {
    private EditText lableText;
    private EditText amountText;
    private EditText dateText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_expense);
        lableText= (EditText) findViewById(R.id.lable);
        amountText= (EditText) findViewById(R.id.amount);
        dateText= (EditText) findViewById(R.id.date);
        Spinner spinner = (Spinner) findViewById(R.id.spinner_type);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getApplicationContext(),
                R.array.type, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                {
                    lableText.setVisibility(View.VISIBLE);
                    amountText.setVisibility(View.VISIBLE);
                    dateText.setVisibility(View.VISIBLE);
                }
                else if(i==1)
                {
                    lableText.setVisibility(View.INVISIBLE);
                    amountText.setVisibility(View.INVISIBLE);
                    dateText.setVisibility(View.INVISIBLE);
                }
                else if(i==2)
                {

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
