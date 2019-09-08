package com.example.midterm07600481;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class profileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Toast toast;
        toast = Toast.makeText(profileActivity.this,getString(R.string.Welcome),Toast.LENGTH_SHORT);
        toast.show();
        Intent intent = getIntent();
    }
}
