package com.example.exercisefiqma;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import static android.widget.Toast.LENGTH_SHORT;

public class LoginFragment extends Fragment {


    TextView txt;
    Button sign_in;
    EditText edit_mail,edit_pass;
   

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        txt = view.findViewById(R.id.txt_register);
        sign_in = view.findViewById(R.id.btn_sign);
        edit_pass=view.findViewById(R.id.edit_pass);
        edit_mail=view.findViewById(R.id.edit_mail);
        String wrong="Wrong password or mail";



        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_loginFragment_to_registerFragment);
            }
        });

        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(edit_mail.getText().toString().equals("omar.bashirzada") && edit_pass.getText().toString().equals("omer2001")){

                    Navigation.findNavController(v).navigate(R.id.action_loginFragment_to_emptyFragment);
                }

                else{
                    Toast.makeText(requireActivity(), "Wrong password or mail !!", Toast.LENGTH_LONG ).show();
                }


            }


        });

    }

}