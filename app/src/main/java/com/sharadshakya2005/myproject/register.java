package com.sharadshakya2005.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class register extends AppCompatActivity {


    Button lg, register1;
    TextInputLayout fullname_var,username_var1,email_var,mobile_var,dob_var,aadhar_var,pass_var;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        lg = findViewById(R.id.login2);
        register1 = findViewById(R.id.register_button);

        fullname_var = findViewById(R.id.fullname_feild);
        username_var1 = findViewById(R.id.username_feild);
        email_var = findViewById(R.id.Email_feild);
        mobile_var = findViewById(R.id.phone_feild);
        dob_var = findViewById(R.id.dob_feild);
        aadhar_var = findViewById(R.id.aadhar_feild);
        pass_var = findViewById(R.id.password_input_feild2);




        register1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fullname_ = fullname_var.getEditText().getText().toString();
                String username_1 = username_var1.getEditText().getText().toString();
                String email_ = email_var.getEditText().getText().toString();
                String mobile_ = mobile_var.getEditText().getText().toString();
                String dob_ = dob_var.getEditText().getText().toString();
                String aadhar_ = aadhar_var.getEditText().getText().toString();
                String pass_ = pass_var.getEditText().getText().toString();


                if(!fullname_.isEmpty()){
                    fullname_var.setError(null);
                    fullname_var.setErrorEnabled(false);
                    if(!username_1.isEmpty()){
                        username_var1.setError(null);
                        username_var1.setErrorEnabled(false);
                        if(!email_.isEmpty()){
                            email_var.setError(null);
                            email_var.setErrorEnabled(false);
                            if(!mobile_.isEmpty()){
                                mobile_var.setError(null);
                                mobile_var.setErrorEnabled(false);
                                if(!dob_.isEmpty()){
                                    dob_var.setError(null);
                                    dob_var.setErrorEnabled(false);
                                    if(!aadhar_.isEmpty()){
                                        aadhar_var.setError(null);
                                        aadhar_var.setErrorEnabled(false);
                                        if(!pass_.isEmpty()){
                                            pass_var.setError(null);
                                            pass_var.setErrorEnabled(false);
                                            if(email_.matches("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")){
                                                if(mobile_.matches("^(?:0091|\\+91|0)[6-9][0-9]{9}$")){
                                                    if(dob_.matches("^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$")){
                                                        if(aadhar_.matches("^[2-9][0-9]{11}$")){

                                                            firebaseDatabase = FirebaseDatabase.getInstance();
                                                            reference = firebaseDatabase.getReference("datauser");

                                                            String fullname_s = fullname_var.getEditText().getText().toString();
                                                            String username_1s = username_var1.getEditText().getText().toString();
                                                            String email_s = email_var.getEditText().getText().toString();
                                                            String mobile_s = mobile_var.getEditText().getText().toString();
                                                            String dob_s = dob_var.getEditText().getText().toString();
                                                            String aadhar_s = aadhar_var.getEditText().getText().toString();
                                                            String pass_s = pass_var.getEditText().getText().toString();


                                                            storingdata storingdatass = new storingdata(fullname_s, username_1s, email_s, mobile_s, dob_s, aadhar_s, pass_s);

                                                            reference.child(username_1s).setValue(storingdatass);

                                                            Toast.makeText(getApplicationContext(), "Register successfully", Toast.LENGTH_SHORT).show();

                                                            Intent intent = new Intent(getApplicationContext(), dashborad.class);
                                                            startActivity(intent);
                                                            finish();

                                                        }else{
                                                            aadhar_var.setError("Please enter a valid 12 digits aadhar number");
                                                        }
                                                    }else{
                                                        dob_var.setError("Please enter the date in dd/mm/yyyy format");
                                                    }
                                                }else{
                                                    mobile_var.setError("Please enter a valid 10 digits numbers i.e. Begin with 0 and +91 or followed by 6 7 8 9");
                                                }
                                            }else{
                                                email_var.setError("Invalid email");
                                            }

                                        }else{
                                            pass_var.setError("Please enter the password");
                                        }
                                    }else{
                                        aadhar_var.setError("Please enter the aadhar number");
                                    }
                                }else{
                                    dob_var.setError("Please enter the DOB");
                                }
                            }else{
                                mobile_var.setError("Please fill the mobile");
                            }
                        }else{
                            email_var.setError("Please fill valid email");
                        }
                    }else{
                        username_var1.setError("Please fill the username");
                    }
                }else{
                    fullname_var.setError("Please fill the name");
                }

            }
        });




        lg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), login.class);
                startActivity(intent);
                finish();
            }
        });
    }
}