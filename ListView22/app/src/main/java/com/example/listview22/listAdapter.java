package com.example.listview22;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class listAdapter extends ArrayAdapter<User> {


    public listAdapter (Context context, ArrayList<User> userArrayList){
        super(context,R.layout.list_items,userArrayList);


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        User user = getItem(position);

        if (convertView == null) {

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_items, parent, false);
        }

         ImageView imageView = convertView.findViewById(R.id.profile_pic);
         TextView userName = convertView.findViewById(R.id.personName);
         TextView lastMessage = convertView.findViewById(R.id.lastMessage);
         TextView time = convertView.findViewById(R.id.msgTime);

         imageView.setImageResource(user.imageId);
         userName.setText(user.name);
         lastMessage.setText(user.lastMessage);
         time.setText(user.lastMsgTime);

        return convertView;
    }
}

