package pt.ipg.desporto24;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class Futsal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_futsal);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void TabelaDaLigaFutsal(View view){
        Toast.makeText(this, "Aqui poderás ver as tabelas de classificação ", Toast.LENGTH_LONG).show();

    }
    public void JogosFutsal(View view){
        Toast.makeText(this, "Aqui poderás ver o resultado dos ultimos jogos ", Toast.LENGTH_LONG).show();

    }
    public void EquipasFutsal(View view){
        Toast.makeText(this, "Aqui poderás ver as equipas e o seu plantel ", Toast.LENGTH_LONG).show();

    }

}
