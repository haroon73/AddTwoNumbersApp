package com.example.addtwonumbersapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        // declaring views
    EditText value1 , vlaue2;
    TextView welcome , result;
    Button btn;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        value1 = findViewById(R.id.valueOne);
        vlaue2 = findViewById(R.id.valueTwo);
        welcome = findViewById(R.id.WelcomeView);
        result = findViewById(R.id.getValue);
        btn = findViewById(R.id.buttonOne);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double numOne = Double.parseDouble(value1.getText().toString());
                if(numOne < 5){
                    Toast.makeText(MainActivity.this, "This is less than 5" , Toast.LENGTH_LONG).show();
                     numOne = Double.parseDouble(value1.getText().toString());
                }

                double numTwo = Double.parseDouble(vlaue2.getText().toString());

                // display the result in textview by callig=ng method to add two numbers

                result.setText("" + addNumbers(numOne, numTwo));

            }
        });



    }

    public double addNumbers(double num1 , double num2){
        return (num1 + num2);
    }
}