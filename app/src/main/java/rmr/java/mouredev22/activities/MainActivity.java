package rmr.java.mouredev22.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import rmr.java.mouredev22.R;
import rmr.java.mouredev22.models.Cuadrado;
import rmr.java.mouredev22.models.Rectangulo;
import rmr.java.mouredev22.models.Triangulo;

public class MainActivity extends AppCompatActivity {
    private Cuadrado cuadrado;
    private Triangulo triangulo;
    private Rectangulo rectangulo;
    private TextView tvCuadrado, tvTriangulo, tvRectangulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvCuadrado = findViewById(R.id.tvTextoCuadrado);
        tvTriangulo = findViewById(R.id.tvTextoTriangulo);
        tvRectangulo = findViewById(R.id.tvTextoRectangulo);
        cuadrado = new Cuadrado(4.0);
        triangulo = new Triangulo(6.0, 5.0);
        rectangulo = new Rectangulo(2.0, 4.0);
        tvCuadrado.append(" Para un cuadrado con lado " + cuadrado.getLado().toString() +
                " el área es " + cuadrado.calcArea());
        tvTriangulo.append(" Para un triángulo de base " + triangulo.getBase().toString() +
                " y altura " + triangulo.getAltura().toString() + " el área es " + triangulo.calcArea());
        tvRectangulo.append(" Para un rectángulo de base " + rectangulo.getBase().toString() +
                " y altura " + rectangulo.getAltura().toString() + " el área es " + rectangulo.calcArea());

    }

}