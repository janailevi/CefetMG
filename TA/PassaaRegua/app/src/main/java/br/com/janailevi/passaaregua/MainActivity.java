package br.com.janailevi.passaaregua;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editValordaConta;
    EditText editValordaBebida;
    EditText editQtdeBebem;
    EditText editQteNaoBebem;
    EditText editTotalBebem;
    EditText editTotalNaoBebem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editValordaConta  = (EditText) findViewById(R.id.inputValorConta);
        editValordaBebida = (EditText) findViewById(R.id.inputValorBebida);
        editQtdeBebem = (EditText) findViewById(R.id.inputQtdeBebem);
        editQteNaoBebem = (EditText) findViewById(R.id.inputQteNaoBebem);
        editTotalBebem = (EditText) findViewById(R.id.inputTotalBebem);
        editTotalNaoBebem = (EditText) findViewById(R.id.inputTotalNaoBebem);

    }

    public void calcularConta(View v){


        double ValordaConta = Double.parseDouble(editValordaConta.getText().toString());
        double Valordabebida = Double.parseDouble(editValordaBebida.getText().toString());
        double QtdeBebem = Double.parseDouble(editQtdeBebem.getText().toString());
        double QteNaoBebem = Double.parseDouble(editQteNaoBebem.getText().toString());

        double TotalnaoBebem = (ValordaConta -Valordabebida) / (QteNaoBebem + QtdeBebem);

        double TotalBebem = TotalnaoBebem + (Valordabebida/ QtdeBebem);

        //Montra Resultado no Campo

        editTotalBebem.setText(String.valueOf(TotalBebem));
        editTotalNaoBebem.setText(String.valueOf(TotalnaoBebem));


    }
}
