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
        Toast.makeText(this, "Zona de Futebol em desenvolvimento!! Nesta Zona irás ter acesso a todas as novidades do Futebol!!",
                Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, Futebol.class);
        startActivity(intent);
    }
    public void zonaFutsal(View view){
        Toast.makeText(this, "Zona de Futsal em desenvolvimento!! Nesta Zona irás ter acesso a todas as novidades do Futsal!!",
                Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, Futsal.class);
        startActivity(intent);

    }
    public void zonaHoquei(View view){
        Toast.makeText(this, "Zona de Hoquei em desenvolvimento!! Nesta Zona irás ter acesso a todas as novidades do Hoquei!!",
                Toast.LENGTH_LONG).show();

    }
    public void zonaAndebol(View view){
        Toast.makeText(this, "Zona de Andebol em desenvolvimento!! Nesta Zona irás ter acesso a todas as novidades do Andebol!!",
                Toast.LENGTH_LONG).show();

    }
    public void zonaTenis(View view){
        Toast.makeText(this, "Zona de Tenis em desenvolvimento!! Nesta Zona irás ter acesso a todas as novidades do Tenis!!",
                Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, Tenis.class);
        startActivity(intent);

    }
    public void zonaNoticias(View view){
        Toast.makeText(this, "Zona de Noticias em desenvolvimento!! Aqui poderás aceder a todas as noticias do mundo do desporto!!",
                Toast.LENGTH_LONG).show();

    }
}
