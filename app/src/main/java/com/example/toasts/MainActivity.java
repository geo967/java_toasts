package com.example.toasts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // Resources res=getResources();
        //Drawable shape= ResourcesCompat.getDrawable(res,R.drawable.shape,getTheme());

        button1 = findViewById(R.id.button1);
        //button1.setBackground(shape);
        button2 = findViewById(R.id.button2);
        //button2.setBackground(shape);
        button3 = findViewById(R.id.button3);
        //button3.setBackground(shape);

        button1.setOnClickListener(v -> Toast.makeText(this, "You Pressed Button 1", Toast.LENGTH_SHORT).show());

        button2.setOnClickListener(v -> {
            Toast t=Toast.makeText(this, "You Pressed Button 2", Toast.LENGTH_LONG);

            t.setGravity(Gravity.TOP ,0, 0);
            t.show();

        });

        button3.setOnClickListener(v -> showSnackBar());


    }

   /* private void showSnackBar() {

        Snackbar.make(findViewById(R.id.my_linear_layout),"undo operation",Snackbar.LENGTH_LONG).show();
    }*/

    private void showSnackBar() {

       Snackbar snackbar= Snackbar.make(findViewById(R.id.my_linear_layout),"undo operation",Snackbar.LENGTH_LONG)
               .setAction("Undo", v -> Toast.makeText(this, "You Pressed snackbar", Toast.LENGTH_SHORT).show());
       snackbar.show();
    }
}