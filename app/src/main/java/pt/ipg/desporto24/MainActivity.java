package pt.ipg.desporto24;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void zonaFutebol(View view){
        Toast.makeText(this, "Acedeu à zona do Futebol.",
                Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, Futebol.class);
        startActivity(intent);
    }
    public void zonaFutsal(View view){
        Toast.makeText(this, "Acedeu à zona do Futsal.",
                Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, Futsal.class);
        startActivity(intent);

    }
    public void zonaHoquei(View view){
        Toast.makeText(this, "Acedeu à zona do Hóquei.",
                Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, Hoquei.class);
        startActivity(intent);

    }
    public void zonaAndebol(View view){
        Toast.makeText(this, "Acedeu à zona do Andebol.",
                Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, Andebol.class);
        startActivity(intent);

    }
    public void zonaTenis(View view){
        Toast.makeText(this, "Acedeu à zona do Ténis.",
                Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, Tenis.class);
        startActivity(intent);

    }
    public void zonaNoticias(View view){
        Toast.makeText(this, "Acedeu à zona das Noticias.",
                Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, Noticias.class);
        startActivity(intent);

    }
}
