package chile.maps.biblioteca;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class github_act extends AppCompatActivity {
    private Spinner spn;
    private TextView tx1;
    private Button btn1;
    private int[] precios = new int[]{5000, 12000,45000,88000,156000};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_act);

        spn = (Spinner)findViewById(R.id.spinner);
        tx1= (TextView)findViewById(R.id.txc1);
        btn1= (Button)findViewById(R.id.btnn2);

        Bundle dat = getIntent().getExtras();
        String[] lista = dat.getStringArray("Preciosgit");

        ArrayAdapter adapt = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, lista);

        spn.setAdapter(adapt);


    }
    public void Calcular(View v)
    {
        if(spn.getSelectedItem().toString().equals("Farenheit"))
        {
            tx1.setText("El valor de Farenheit es :"+precios[0]);
        }

        if(spn.getSelectedItem().equals("Revival"))
        {
            tx1.setText("El valor de Revival es :"+precios[1]);
        }

        if(spn.getSelectedItem().equals("El Alquimista"))
        {
            tx1.setText("El valor de El Alquimista es :"+precios[2]);

        }
        if(spn.getSelectedItem().equals("El Poder"))
        {
            tx1.setText("El valor de  El Poder es : "+precios[3]);

        }
        if(spn.getSelectedItem().equals("El Despertar"))
        {
            tx1.setText("El valor de El Despertar es : "+precios[4]);

        }

    }

    }

