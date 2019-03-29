﻿package edu.hzuapps.androidlabs.soft1714080902207;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class consumer_Housekeeper1_1714080902207 extends AppCompatActivity implements View.OnClickListener {
    private TextView tvShowDialog;
    private Calendar cal;
    private int year, month, day;

    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consumer__housekeeper1_1714080902207);
        button3 = (Button) findViewById(R.id.button3);
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);
        getDate();
        tvShowDialog = (TextView) findViewById(R.id.tvShowDialog);
        tvShowDialog.setOnClickListener(this);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(consumer_Housekeeper1_1714080902207.this, consumer_Housekeeper_1714080902207.class);
                startActivity(intent);
            }

        });


    }

    private void getDate() {
        cal = Calendar.getInstance();
        year = cal.get(Calendar.YEAR);      
        Log.i("wxy", "year" + year);
        month = cal.get(Calendar.MONTH);   
        day = cal.get(Calendar.DAY_OF_MONTH);

    }


    private Button button3;


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button2:
                Toast.makeText(consumer_Housekeeper1_1714080902207.this, "本次消费记录成功", Toast.LENGTH_SHORT).show();
                switch (v.getId()) {
                    case R.id.tvShowDialog:
                        DatePickerDialog.OnDateSetListener listener = new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker arg0, int year, int month, int day) {
                                tvShowDialog.setText(year + "-" + (++month) + "-" + day);     
                            }
                        };
                        DatePickerDialog dialog = new DatePickerDialog(consumer_Housekeeper1_1714080902207.this, DatePickerDialog.THEME_HOLO_LIGHT, listener, year, month, day);
                        dialog.show();
                        break;

                    default:
                        break;
        }
    }


    }
}



