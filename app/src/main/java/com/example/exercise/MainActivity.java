package com.example.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Deklarasi variabel untuk button
    Button btnLogin;
    Button btLogin;

    //Deklarasi variabel untuk EditText
    EditText edEmail, edpassword;

    //Deklarasi variabel untuk menyimpan email dan password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variabel btnLogin dengan componen button pada layout
        btnLogin = findViewById(R.id.button);
        btLogin = findViewById(R.id.button2);

        //Menghubungkan variabel edEmail dengan componen button pada layout
        edEmail = findViewById(R.id.renama);

        //Menghubungkan variabel edPassword dengan componen button pada layout
        edpassword = findViewById(R.id.password2);

        //membuat fungsi one klik pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Menyimpan input user di edittext email kedalam variabel nama
                nama = edEmail.getText().toString();

                //Menyimpan input user di edittext password kedalam variabel password
                password = edpassword.getText().toString();

                //membuat variabel toast dan membuat toast dengan menambahkan variabel nama dan password
                Toast t = Toast.makeText(getApplicationContext(),
                        "email anda: " + nama + " dan Password anda: " + password + "", Toast.LENGTH_LONG);
                Bundle b = new Bundle();

                b.putString("a", nama.trim());

                Intent login = new Intent (getApplicationContext(),selamat_datang.class);
                login.putExtras(b);
                startActivity(login);

                //memvalidasi inputan user
                if (nama.isEmpty() || password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Login Gagal", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Login Sukses", Toast.LENGTH_SHORT).show();
                }

                //Menampilkan toast
                t.show();
            }
        });

        btLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent login = new Intent (getApplicationContext(),register.class);
                startActivity(login);
            }
        });
    }
}