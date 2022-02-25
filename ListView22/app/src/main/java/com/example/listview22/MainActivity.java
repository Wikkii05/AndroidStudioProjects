package com.example.listview22;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;

import androidx.appcompat.app.AppCompatActivity;

import com.example.listview22.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] imageId = {R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.a5,R.drawable.a6,R.drawable.a7};

        String[] name = {"Vignesh","Anand","Jawahar","Nikson","Aravind","Saran","Arjun",};
        String[] lastMessage = {"Hey","Good morning","Good night","Good evening","Tomorrow","Tonight","Today"};
        String[] lastTime = {"8:45pm","9:45pm","10:45pm","11:45pm","12:45pm","1:45pm","2:45pm",};
        String[] phoneNumber= {"8525889324","8525889321","8525889322","8525889323","8525889325","8525889326","8525889327",};
        String[] country = {"india","usa","uae","uk","poland","china","india",};

        ArrayList<User> userArrayList = new ArrayList<>();

        for ( int i=0; i< imageId.length;i++){

            User user = new User(name[i],lastMessage[i],lastTime[i],phoneNumber[i],country[i],imageId[i]);

            userArrayList.add(user);

        }
        ListAdapter listAdapter = new listAdapter(MainActivity.this,userArrayList);

        binding.listview.setAdapter(listAdapter);
        binding.listview.setClickable(true);
        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long ld) {

                Intent i1 = new Intent(MainActivity.this,User.class);
                i1.putExtra(  "name",name[position]);
                i1.putExtra(  "phone",phoneNumber[position]);
                i1.putExtra(  "name",country[position]);
                i1.putExtra(  "name",imageId[position]);
                startActivity(i1);


            }
        });



    }



    }
