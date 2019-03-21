package pt.ipg.desporto24;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class Tenis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenis);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void Torneios(View view){
        Toast.makeText(this, "Aqui poderás ver quando são os proximos torneios ", Toast.LENGTH_LONG).show();

    }
    public void Raking(View view){
        Toast.makeText(this, "Aqui poderás ver o top 10 do mundo ", Toast.LENGTH_LONG).show();

    }
    public void Jogadores(View view){
        Toast.makeText(this, "Aqui poderás ver quando os jogadores jogam e o seu lugar no ranking ", Toast.LENGTH_LONG).show();

    }
}
