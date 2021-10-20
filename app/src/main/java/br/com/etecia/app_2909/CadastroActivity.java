package br.com.etecia.app_2909;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {
    Button btnEntrar;
    EditText edtUser2, edtPassaword2, edtEmail, edtTelefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        btnEntrar = findViewById(R.id.btnEntrar);
        edtUser2 = findViewById(R.id.edtUser2);
        edtPassaword2 = findViewById(R.id.EdtPassword2);
        edtEmail = findViewById(R.id.edtemail);
        edtTelefone = findViewById(R.id.edtTelefone);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Conta cadastrada!", Toast.LENGTH_SHORT).show();

                edtUser2.getText().toString();
                edtPassaword2.getText().toString();
                edtEmail.getText().toString();
                edtTelefone.getText().toString();
            }
        });
    }
}