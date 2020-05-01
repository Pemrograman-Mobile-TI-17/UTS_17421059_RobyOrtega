package com.roby.uts.users;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;

import com.roby.uts.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();
    }
    public void pindah(View v){
        Intent intent = new Intent(LoginActivity.this, RegistrasiActivity.class);
        startActivity(intent);
    }
}
