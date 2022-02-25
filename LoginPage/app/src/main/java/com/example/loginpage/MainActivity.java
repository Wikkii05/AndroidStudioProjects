package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username =(TextView) findViewById(R.id.text1);
        TextView password =(TextView) findViewById(R.id.text2);

        Button loginbtn=(Button) findViewById(R.id.btn1);

        //admin and admin

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    //correct
                    Toast.makeText(MainActivity.this,"LOGIN Successful",Toast.LENGTH_SHORT).show();
                }
                else {
                    //incorrect
                    Toast.makeText(MainActivity.this,"LOGIN Failed",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}