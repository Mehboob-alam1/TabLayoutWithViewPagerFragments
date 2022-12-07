package com.mehboob.tablayoutwithviewpagerfragments.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.mehboob.tablayoutwithviewpagerfragments.R;

public class GroupFragment extends Fragment {

private EditText etEmail,etPass;
private Button btnLogin;
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_group, container, false);
    etEmail= view.findViewById(R.id.etEmail);
    etPass= view.findViewById(R.id.etPass);
  btnLogin=   view.findViewById(R.id.btnLogin);


  btnLogin.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
          if (etEmail.getText().toString().isEmpty() || etPass.getText().toString().isEmpty()){
              Toast.makeText(getContext(), "Fill the box", Toast.LENGTH_SHORT).show();
          }else if (etEmail.getText().toString().equals("mehboob@gmail.com") && etPass.getText().toString().equals("123456")){

              Toast.makeText(getContext(), "Login Sucessfull", Toast.LENGTH_SHORT).show();
          }else{
              Toast.makeText(getContext(), "Invalid gmail or password", Toast.LENGTH_SHORT).show();
          }
      }
  });


        return view;
    }
}