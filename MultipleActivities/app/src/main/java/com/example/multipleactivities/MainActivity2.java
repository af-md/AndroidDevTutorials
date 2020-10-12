package com.example.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle extra = getIntent().getExtras();

        if (extra != null){
            String var = extra.getString("MyVariableName");
            Toast.makeText(MainActivity2.this, "val:" + var, Toast.LENGTH_LONG).show();
        }
    }
}