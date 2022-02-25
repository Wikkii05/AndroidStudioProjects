package com.example.alarm_manager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.AlarmManager;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.textview);

        Button buttonTimePicker = findViewById(R.id.button_timepicker);
        buttonTimePicker.setOnClickListener(new View.OnClickListener() {

            class TimePickerFragemnt extends DialogFragment {
            }

            @Override
            public void onClick(View view) {
                DialogFragment timepicker = new TimePickerFragemnt();
                timepicker.show(getSupportFragmentManager(),"timepicker");
            }
        });

        Button buttoncancelAlarm = findViewById(R.id.button_cancel);
        buttoncancelAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cancelAlarm();

            }
        });

    }

    @Override
    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minute) {

        Calendar c = Calendar.getInstance();
        c.set(Calendar.HOUR_OF_DAY,hourOfDay);
        c.set(Calendar.MINUTE,minute);
        c.set(Calendar.SECOND,0);

        updateTimeText(c);
        startAlarm(c);
    }
    private void updateTimeText(Calendar c) {
        String timeText =" Alarm set for: " ;
        timeText += DateFormat.getDateTimeInstance(DateFormat.SHORT).format(c);
        mTextView.setText(timeText);
    }
    private void startAlarm (Calendar c) {
        AlarmManager alarmManager = (AlarmManager) getSystemService(context.ALARM_SERVICE);
    }
}
