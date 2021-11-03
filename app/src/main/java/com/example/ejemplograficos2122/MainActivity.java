package com.example.ejemplograficos2122;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new EjemploView(this));
    }

    //Clase que extiende la clase View, modificando el método onDraw
    public class EjemploView extends View {
        private Drawable miImagen;
        //private ShapeDrawable miImagen;
        public EjemploView(Context context) {
            //Se crea la vista a partir de código
            super(context);
        //miImagen = ContextCompat.getDrawable(context, R.drawable.mi_imagen);
        miImagen = ContextCompat.getDrawable(context, R.drawable.mi_estrella);
        miImagen.setBounds(30,30,200,200);



        }


        @Override
        protected void onDraw(Canvas canvas) {
            /*
            Path trazo = new Path();
            trazo.addCircle(150, 150, 100, Path.Direction.CCW);
            canvas.drawColor(Color.WHITE);
            Paint pincel = new Paint();
            pincel.setColor(Color.BLUE);
            pincel.setStrokeWidth(8);
            pincel.setStyle(Paint.Style.STROKE);
            canvas.drawPath(trazo, pincel);
            pincel.setStrokeWidth(1);
            pincel.setStyle(Paint.Style.FILL);
            pincel.setTextSize(20);
            pincel.setTypeface(Typeface.SANS_SERIF);
            canvas.drawTextOnPath("Programación multimedia y dispositivos" +
                    " móviles", trazo, 10, 40, pincel);
             */
            miImagen.draw(canvas);
        }
    }
}
