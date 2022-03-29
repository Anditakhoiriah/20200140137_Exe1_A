package com.example.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class todo extends AppCompatActivity {

    //Deklarasi variabel untuk menyimpan nama, email dan password
    String itask, ijenis, itime;

    TextView task, jenis, time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);

            setContentView(R.layout.activity_todo);
            task = findViewById(R.id.task1);
            jenis = findViewById(R.id.jenis1);
            time = findViewById(R.id.time1);
            Bundle bundle = getIntent().getExtras();
            itask = bundle.getString("task");
            ijenis = bundle.getString("jenis");
            itime = bundle.getString("time");
            task.setText(itask);
            jenis.setText(ijenis);
            time.setText(itime);
    }
}