package com.example.proyecto_avance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    TextView btn;
    private EditText inputEmail_LOG, inputPassword_LOG;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn=findViewById(R.id.textviewsignup);

        inputEmail_LOG = (EditText) findViewById(R.id.InputEmail_log);
        inputPassword_LOG = (EditText) findViewById(R.id.InputPassword_log);
        btnLogin = (Button) findViewById(R.id.btnlogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String verificaremail = inputEmail_LOG.getText().toString();
                String verificarpass = inputPassword_LOG.getText().toString();
                if (verificaremail.isEmpty()){
                    inputEmail_LOG.setError("No se ingreso ningun caracter");
                }
                else if (verificarpass.isEmpty()){
                    inputPassword_LOG.setError("No se ingreso ningun caracter");
                }
                else {
                    Toast.makeText(LoginActivity.this,"Bienvenido", Toast.LENGTH_LONG).show();
                    btnLogin.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent i = new Intent(LoginActivity.this,WelcomeActivity.class);
                            startActivity(i);
                        }
                    });
                }
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
            }
        });

    }


}