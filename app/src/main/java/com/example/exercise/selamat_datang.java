package com.example.exercise;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class selamat_datang extends AppCompatActivity {
    //Deklarasi variabel untuk button
    FloatingActionButton btnplus;

    //Deklarasi variabel untuk EditText
    EditText edtask, edjenis, edtime;

    //Deklarasi variabel untuk menyimpan nama, email dan password
    String task, jenis, time, bundle;

    TextView namalogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selamat_datang);

        //Menghubungkan variabel btnplus dengan componen button pada layout
        namalogin = findViewById(R.id.name);
        btnplus = findViewById(R.id.buttonplus);

        //Menghubungkan variabel edtask dengan componen button pada layout
        edtask = findViewById(R.id.task);

        //Menghubungkan variabel edjenis dengan componen button pada layout
        edjenis = findViewById(R.id.jenis);

        //Menghubungkan variabel edtime dengan componen button pada layout
        edtime = findViewById(R.id.time);

        Bundle a = getIntent().getExtras();
        bundle = a.getString("a");

        namalogin.setText(bundle);

        //membuat fungsi one klik pada button btnLogin
        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Menyimpan input user di edittext task kedalam variabel task
                task = edtask.getText().toString();

                //Menyimpan input user di edittext email kedalam variabel email
                jenis = edjenis.getText().toString();

                //Menyimpan input user di edittext password kedalam variabel password
                time = edtime.getText().toString();

                //membuat variabel toast dan membuat toast dengan menambahkan variabel nama email dan password
                Toast t = Toast.makeText(getApplicationContext(),
                        "masukkan task: " + task + "masukkan jenis task: " + jenis + " masukkan lama task: " + time, Toast.LENGTH_LONG);

                Bundle b = new Bundle();

                b.putString("task", task.trim());

                b.putString("jenis", jenis.trim());

                b.putString("time", time.trim());

                Intent todo = new Intent(getApplicationContext(), todo.class);

                todo.putExtras(b);

                startActivity(todo);

                //memvalidasi inputan user

                if (task.isEmpty() || jenis.isEmpty()) {
                    Toast.makeText(selamat_datang.this, "Login Gagal", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(selamat_datang.this, "Login Sukses", Toast.LENGTH_SHORT).show();
                }

                //Menampilkan toast
                t.show();
            }

        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.submit){
            task = edtask.getText().toString();
            jenis = edjenis.getText().toString();
            time = edtime.getText().toString();


            Toast.makeText(getApplicationContext(),
                    "Berhasil", Toast.LENGTH_LONG).show();

            Bundle b = new Bundle();

            b.putString("task", task.trim());

            b.putString("jenis", jenis.trim());

            b.putString("time", time.trim());

            Intent activity_todo = new Intent(getApplicationContext(), todo.class);

            activity_todo.putExtras(b);

            startActivity(activity_todo);
        }
        else {
            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}
