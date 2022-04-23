package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/*Tanggal Pengerjaan:22/04/2022
NIM:10119255
Nama: Rizki Lail Rahman
Kelas: IF-7
 */
public class LoginActivity extends AppCompatActivity {

    private Button btnLogin;
    private Button btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    btnLogin = findViewById(R.id.btn_login);
    btnSignup = findViewById(R.id.btn_daftar);


    btnLogin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
        }


    });
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}