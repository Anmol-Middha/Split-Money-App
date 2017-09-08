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

public class tab2_fragment extends Fragment {
    private static final String TAG="tab2_fragment";

    private Button btnTEST;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1_fragment,container,false);

        btnTEST=(Button)view.findViewById(R.id.btnTEST2);

        btnTEST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"checking button click 2",Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }
}