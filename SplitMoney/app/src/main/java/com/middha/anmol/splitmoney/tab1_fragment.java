package com.middha.anmol.splitmoney;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Anmol on 9/8/2017.
 */

public class tab1_fragment extends Fragment {
    private static final String TAG="personal_expense_frag";

    private Button btnTEST;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.personal_expense_frag,container,false);

       

        return view;
    }
}
