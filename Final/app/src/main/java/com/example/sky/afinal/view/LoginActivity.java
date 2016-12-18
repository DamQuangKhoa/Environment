package com.example.sky.afinal.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sky.afinal.R;

public class LoginActivity extends AppCompatActivity {
EditText edtUseName,editPassword;
 TextView txtForgot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtUseName = (EditText) findViewById(R.id.nameUser_edittText);
        editPassword = (EditText) findViewById(R.id.passUser_edittText);
       txtForgot= (TextView) findViewById(R.id.Forgot_textview);
    }
    public void forgotPass(View view){
        Toast.makeText(LoginActivity.this,"Click Able ",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(LoginActivity.this,ForgotPass.class);
        synchronized ()
        startActivity(intent);
//        Function.changeActivity();
    }
}
