package com.middha.anmol.splitmoney;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Anmol on 9/8/2017.
 */

public class tab3_fragment extends Fragment {
    private static final String TAG="trip_expense_frag";

    private Button btnTEST;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.trip_expense_frag,container,false);

        btnTEST=(Button)view.findViewById(R.id.btnTEST3);

        btnTEST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"checking button click 3",Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }
}