package sorelyth.manillas;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Main extends AppCompatActivity {
    private Resources recursos;
    private TextView Total;
    private TextView Cant;
    private Spinner MaterialSpinner;
    private Spinner DijeSpinner;
    private Spinner ColorSpinner;
    private Spinner MonedaSpinner;
    private String Material[];
    private String Dije[];
    private String Color[];
    private String Moneda[];
    private Button Boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            Cant = findViewById(R.id.txtCantidad);
            Total = findViewById(R.id.lblTotal);
            recursos = this.getResources();


            MaterialSpinner = findViewById(R.id.cmbMaterial);
            DijeSpinner = findViewById(R.id.cmbDije);
            ColorSpinner = findViewById(R.id.cmbColor);
            MonedaSpinner = findViewById(R.id.cmbMoneda);


            Material = recursos.getStringArray(R.array.ListMaterial);
            ArrayAdapter<String> MaterialMan = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,Material);
            MaterialSpinner.setAdapter(MaterialMan);

            Dije = recursos.getStringArray(R.array.ListDije);
            ArrayAdapter<String> DijeMan = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Dije);
            DijeSpinner.setAdapter(DijeMan);

            Color = recursos.getStringArray(R.array.ListColor);
            ArrayAdapter<String> ColorMan = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,Color );
            ColorSpinner.setAdapter(ColorMan);

            Moneda = recursos.getStringArray(R.array.ListMoneda);
            ArrayAdapter<String> MonedaMan = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Moneda);
            MonedaSpinner.setAdapter(MonedaMan);


            Boton = findViewById(R.id.btnCalcular);
    }

    public boolean Validar() {



        if (Cant.getText().toString().isEmpty()) {
            Cant.requestFocus();
            Cant.setError(recursos.getString(R.string.esta_vacio));
            return false;
        }

        if (Integer.parseInt(Cant.getText().toString())<1) {
            Cant.requestFocus();
            Cant.setError(recursos.getString(R.string.menor_uno));
            return false;

        }
        return true;
    }



}
