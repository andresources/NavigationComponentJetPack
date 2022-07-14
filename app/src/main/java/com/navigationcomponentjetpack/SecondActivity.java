package com.navigationcomponentjetpack;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle b=getIntent().getExtras();
        Toast.makeText(getApplicationContext(),""+b.getString("amount"),Toast.LENGTH_LONG).show();
    }

    public void clickMe(View view) {
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
    }
}