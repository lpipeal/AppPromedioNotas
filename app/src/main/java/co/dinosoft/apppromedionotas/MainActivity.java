package co.dinosoft.apppromedionotas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1= (EditText)findViewById(R.id.txt_matematicas);
        et2= (EditText)findViewById(R.id.txt_fisica);
        et3= (EditText)findViewById(R.id.txt_quimica);

        tv1= (TextView)findViewById(R.id.tv_estatus);

    }


    public void estatus(View view){
        String matematicas_string = et1.getText().toString();
        String fisica_string = et2.getText().toString();
        String quimica_string = et3.getText().toString();

        int matematicas = Integer.parseInt(matematicas_string);
        int fisica = Integer.parseInt(fisica_string);
        int quimica = Integer.parseInt(quimica_string);

        int promedio= (matematicas+fisica+quimica)/3;

        if(promedio>=6){
            tv1.setText("Estatus aprobado con promedio de: "+promedio);

        }if(promedio<=3){

            tv1.setText("Estatus Reprobado con promedio de: "+promedio);
        }


    }


}
