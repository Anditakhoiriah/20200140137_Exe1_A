package com.example.exercise;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class register  extends AppCompatActivity {
    //Deklarasi variabel untuk button
    Button btnregister;

    //Deklarasi variabel untuk EditText
    EditText ednama, edEmail, edpassword, edrepass;

    //Deklarasi variabel untuk menyimpan nama, email dan password
    String nama, email, password, repassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        //Menghubungkan variabel btnLogin dengan componen button pada layout
        btnregister = findViewById(R.id.button3);

        //Menghubungkan variabel ednama dengan componen button pada layout
        ednama = findViewById(R.id.tnama);

        //Menghubungkan variabel edEmail dengan componen button pada layout
        edEmail = findViewById(R.id.temail);

        //Menghubungkan variabel edPassword dengan componen button pada layout
        edpassword = findViewById(R.id.tpassword);

        //Menghubungkan variabel edPassword dengan componen button pada layout
        edrepass = findViewById(R.id.rerpass);

        //membuat fungsi one klik pada button btnLogin
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Menyimpan input user di edittext nama kedalam variabel nama
                nama = ednama.getText().toString();

                //Menyimpan input user di edittext email kedalam variabel email
                email = edEmail.getText().toString();

                //Menyimpan input user di edittext password kedalam variabel password
                password = edpassword.getText().toString();

                //Menyimpan input user di edittext re password kedalam variabel re password
                repassword = edrepass.getText().toString();

                //membuat variabel toast dan membuat toast dengan menambahkan variabel nama email dan password
                Toast t = Toast.makeText(getApplicationContext(),
                        "nama anda: " + nama + "email anda: " + email  + " Password anda: " + password + " rePassword anda: " + repassword , Toast.LENGTH_LONG);

                //memvalidasi inputan user
                if (nama.isEmpty() || password.isEmpty()) {
                    Toast.makeText(register.this, "Login Gagal", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(register.this, "Login Sukses", Toast.LENGTH_SHORT).show();
                }

                //Menampilkan toast
                t.show();
            }
        });
    }
}
