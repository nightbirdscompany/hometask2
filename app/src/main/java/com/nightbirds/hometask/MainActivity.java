package com.nightbirds.hometask;



import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editext, weekbox;
    Button but, but2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        editext = findViewById(R.id.editext);
        but = findViewById(R.id.but);
        weekbox = findViewById(R.id.weekbox);
        but2 = findViewById(R.id.but2);


        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mystring = editext.getText().toString();
                int mynumber = Integer.parseInt(mystring);

                if ( mynumber%5 == 0 ){
                    Toast.makeText(MainActivity.this, mynumber+" কে ৫ দিয়ে ভাগ করা যায়", Toast.LENGTH_LONG).show();
                } else if ( mynumber%11 == 0) {

                    Toast.makeText( MainActivity.this, mynumber+"কে ১১ দিয়ে ভাগ করা যায়", Toast.LENGTH_LONG).show();

                } else {
                    Toast.makeText(MainActivity.this, mynumber+"কে ৫ অথবা ১১ দিয়ে ভাগ করা যায় না", Toast.LENGTH_LONG).show();
                }
            }
        });


        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mystring = weekbox.getText().toString();
                int myweek = Integer.parseInt(mystring);

                if (myweek)
            }
        });

    }
}