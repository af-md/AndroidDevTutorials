package com.example.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Button b1;
    private TextView t1;
    private String item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1 = (Button) findViewById(R.id.button1);
        t1 = (TextView) findViewById(R.id.label1);

        View.OnClickListener b1Listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent1 = new Intent(MainActivity.this, MainActivity2.class);
            int var = 32;
            intent1.putExtra("MyVariableName", item);
            startActivity(intent1);
            }
        };
        b1.setOnClickListener(b1Listener);

        Spinner spinner = (Spinner) findViewById(R.id.planets_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        item = parent.getItemAtPosition(position).toString();
        Log.d(item,"asdas");

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}