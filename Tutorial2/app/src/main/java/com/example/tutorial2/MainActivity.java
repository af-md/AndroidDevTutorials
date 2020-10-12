package com.example.tutorial2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1;
    EditText miles;
    EditText kilometers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // create a toast. the toast will appear for a second at the bottom of the app.
        Toast.makeText(MainActivity.this, "Hello, this is my toast", Toast.LENGTH_LONG).show();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        miles = (EditText) findViewById(R.id.miles);
        button1 = (Button) findViewById(R.id.button1);
        kilometers = (EditText) findViewById(R.id.kilometers);

        button1.setOnClickListener(b1Listener);

    }

    View.OnClickListener b1Listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        Double milesToTransform = Double.parseDouble(miles.getText().toString());
        Double kilometersTranformed = 1.2 * milesToTransform;
        kilometers.setText(String.valueOf(kilometersTranformed));
        }
    };
}