package com.example.listview22;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;

import androidx.appcompat.app.AppCompatActivity;

import com.example.listview22.databinding.ActivityMainBinding;
import com.example.listview22.databinding.ActivityUserBinding;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class UserActivity extends AppCompatActivity {

    ActivityUserBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUserBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = this.getIntent();

        if (intent != null){

            String name = intent.getStringExtra("name");
            String phone = intent.getStringExtra("phone");
            String country = intent.getStringExtra("country");
            int imageid =intent.getIntExtra("imageid",R.drawable.a1);


            binding.scodeProfile.setText(name);
            binding.scodeProfile.setText(phone);
            binding.scodeProfile.setText(country);
            binding.scodeProfile.setText(imageid);

        }

    }
}
