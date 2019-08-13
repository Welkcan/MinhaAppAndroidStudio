package com.example.aluno.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.HashMap;


public class MainActivity extends AppCompatActivity {
    private static final HashMap<String, String> usuariosMap = new HashMap<>();
     EditText editTextLogin;
     EditText editTextPass;
     Button btnLimpar;
     Button btnOk;

    {
        usuariosMap.put("huguinho","123");
        usuariosMap.put("zezinho","123");
        usuariosMap.put("luizinho","123");
        usuariosMap.put("welkcan","gui123");

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editTextLogin = findViewById(R.id.editTextLogin);
        editTextPass = findViewById(R.id.editTextPassord);
        btnLimpar = findViewById(R.id.btnLimparCampos);
        btnOk = findViewById(R.id.btnOk);


        this.btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               editTextLogin.setText(null);
               editTextPass.setText(null);
            }
        });

        this.btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nomeDeUserInformado = editTextLogin.getText().toString();
                String senhaDeUserInformada = editTextPass.getText().toString();

                Toast.makeText(getApplicationContext(),
                        "editTextLogin.getText()=" + editTextLogin.getText(),
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getApplicationContext(),
                        "editTextPass.getText()=" + editTextPass.getText(),
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getApplicationContext(),
                        "editTextLogin.getText().toString=" + editTextLogin.getText().toString(),
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getApplicationContext(),
                        "editTextPass.getText().toString=" + editTextPass.getText().toString(),
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getApplicationContext(),
                        "senhaDeUserInformada=" + senhaDeUserInformada,
                        Toast.LENGTH_LONG).show();

                //se a chave nomeDeUserInformada existir, o get retorna a senha
                String pwCadastrado = MainActivity.usuariosMap.get(nomeDeUserInformado);

                if (pwCadastrado != null && pwCadastrado.equals(senhaDeUserInformada)) {
                    Toast.makeText(getApplicationContext(), "Login Feito Com Sucesso!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Login Falhou!", Toast.LENGTH_LONG).show();
                }

            }


        });
    }
}





        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}*/
