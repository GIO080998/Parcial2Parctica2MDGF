package mdgf.edu.tesoem.itics.parcial2parctica2mdgf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton rmasculino, rfemenido;
    RadioButton rsuma, rresta, rmultiplicacion, rdivision;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rmasculino = (RadioButton) findViewById(R.id.rmasculino);
        rfemenido = (RadioButton) findViewById(R.id.rfemenino);
        rsuma = (RadioButton) findViewById(R.id.rsuma);
        rresta = (RadioButton) findViewById(R.id.rresta);
        rmultiplicacion = (RadioButton) findViewById(R.id.rmulti);
        rdivision = (RadioButton) findViewById(R.id.rdivision);
        result = (TextView) findViewById(R.id.Resultado);


    }

    public void invocarmensaje(View view) {
        if (rmasculino.isChecked()) {
            Toast.makeText(this, "Selecciono Masculino", Toast.LENGTH_LONG).show();

        }
        if (rfemenido.isChecked()) {
            Toast.makeText(this, "Selecciono Femenino", Toast.LENGTH_LONG).show();
        }
    }
    public void operacion(View view) {
        if (rsuma.isChecked()) {
            EditText n1 = (EditText) findViewById(R.id.txtnum1);
            EditText n2 = (EditText) findViewById(R.id.txtnum2);
            double valor1 = Double.parseDouble(n1.getText().toString());
            double valor2 = Double.parseDouble(n2.getText().toString());

            double res = valor1+valor2;
            result.setText(" " + res);

        }
        if (rresta.isChecked()) {
            EditText n1 = (EditText) findViewById(R.id.txtnum1);
            EditText n2 = (EditText) findViewById(R.id.txtnum2);
            double valor1 = Double.parseDouble(n1.getText().toString());
            double valor2 = Double.parseDouble(n2.getText().toString());

            double res = valor1-valor2;
            result.setText(" " + res);

        } if (rmultiplicacion.isChecked()) {
            EditText n1 = (EditText) findViewById(R.id.txtnum1);
            EditText n2 = (EditText) findViewById(R.id.txtnum2);
            double valor1 = Double.parseDouble(n1.getText().toString());
            double valor2 = Double.parseDouble(n2.getText().toString());

            double res = valor1*valor2;
            result.setText(" " + res);

        } if (rdivision.isChecked()) {
            EditText n1 = (EditText) findViewById(R.id.txtnum1);
            EditText n2 = (EditText) findViewById(R.id.txtnum2);
            double valor1 = Double.parseDouble(n1.getText().toString());
            double valor2 = Double.parseDouble(n2.getText().toString());

            double res = valor1/valor2;
            result.setText(" " + res);

        }
    }

}



