package com.cdac.feedback;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class OneFragment extends Fragment {


    EditText et_pass;
    Button btn_submit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one, container, false);

        et_pass = view.findViewById(R.id.et_password);
        btn_submit = view.findViewById(R.id.bt_submit);



        return view;
    }
}