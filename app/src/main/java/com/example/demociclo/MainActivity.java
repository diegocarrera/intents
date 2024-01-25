package com.example.demociclo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText usernameEditText, passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = (EditText) findViewById(R.id.username_edittext);
        passwordEditText = (EditText) findViewById(R.id.password_edittext);
        Button loginButton = findViewById(R.id.login_button);

    }

    public void sendMessage (View view) {

        Log.i("tagNuevo", "hola mundo");

        String username = usernameEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        if (!username.isEmpty() && !password.isEmpty()) {
            // Los campos no están vacíos
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("USERNAME", username);
            startActivity(intent);
        } else {
            // Mostrar mensaje de error o realizar otras acciones según sea necesario
        }
    }




        @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume en MainActivity", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause en MainActivity", Toast.LENGTH_SHORT).show();
    }



}