package com.example.registerpage;

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

        TextView name =(TextView) findViewById(R.id.text1);
        TextView username=(TextView) findViewById(R.id.text2);
        TextView email =(TextView) findViewById(R.id.text3);
        TextView password =(TextView) findViewById(R.id.text4);
        TextView confirmpassword =(TextView) findViewById(R.id.text5);

        Button loginbtn=(Button) findViewById(R.id.btn2);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name.getText().toString().equals("admin") && username.getText().toString().equals("admin") && email.getText().toString().equals("admin@gmail.com") && password.getText().toString().equals("admin") && confirmpassword.getText().toString().equals("admin")){
                    //correct
                    Toast.makeText(MainActivity.this,"SignUp ",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}