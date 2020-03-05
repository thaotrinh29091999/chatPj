package com.example.messagesspj;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.messagesspj.db.DatabaseHelper;

public class Login extends Fragment {

    EditText edEmail;
    EditText edPasswork;
    DatabaseHelper db;

    public Login() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_login, container, false);
        edEmail = view.findViewById(R.id.ed_email);
        edPasswork = view.findViewById(R.id.ed_pass_work);
        Button btsignin = view.findViewById(R.id.btsignin);
        db=new DatabaseHelper(getContext());
        Button btSignUp = view.findViewById(R.id.btSignUp);
        btSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = edEmail.getText().toString();
                String passwork = edPasswork.getText().toString();

                if (email.equals("") || passwork.equals("")) {
                    Toast.makeText(getActivity(), "Fields are emty", Toast.LENGTH_SHORT).show();
                } else {
                        Boolean checkemail = db.checkEmail(email);
                        if (checkemail == true){
                            Boolean insert = db.insert(email, passwork);
                            if (insert == true){
                                Toast.makeText(getActivity(),"",Toast.LENGTH_SHORT).show();
                            }
                        }
                        else {
                            Toast.makeText(getActivity(),"Email already exists",Toast.LENGTH_SHORT).show();
                        }
                    Toast.makeText(getActivity(),"Passwork do not  match", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;
    }


}
