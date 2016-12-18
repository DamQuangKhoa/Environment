package com.example.sky.afinal.control;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;

import com.example.sky.afinal.view.MainActivity;

/**
 * Created by Sky on 17/12/2016.
 */

public class Function extends AppCompatActivity {
    private static final String USERNAME_KEY = "username";
    private static final String PASSWORD_KEY = "password";

    public static void changeActivity(){
        Context context = MyApplication.getContext();
        Intent intent = new Intent(context,MainActivity.class);
        context.startActivity(intent);
    }
    public static SharedPreferences getSharePreferences() {
        Context context = MyApplication.getContext();
        SharedPreferences sharedpreferences = context.
                getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        return sharedpreferences;
    }

    public static void saveUsername(String username) {
        SharedPreferences sharedPreferences = getSharePreferences();
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(USERNAME_KEY, username);
        editor.commit();
    }
    public static String getUsername() {
        SharedPreferences sharedPreferences = getSharePreferences();
        String username = sharedPreferences.getString(USERNAME_KEY, "");
        return username;
    }

    public static void savePassword(String password) {
        SharedPreferences sharedPreferences = getSharePreferences();
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(PASSWORD_KEY, password);
        editor.commit();
    }

    public static String getPassword() {
        SharedPreferences sharedPreferences = getSharePreferences();
        String password = sharedPreferences.getString(PASSWORD_KEY, "");
        return password;
    }



}
