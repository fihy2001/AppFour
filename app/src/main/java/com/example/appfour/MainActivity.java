package com.example.appfour;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtAnimal = findViewById(R.id.txtAnimal);
        TextView txtCat = findViewById(R.id.txtCat);
        TextView txtLion = findViewById(R.id.txtLion);
        TextView txtLeopard = findViewById(R.id.txtLeopard);
        TextView txtBird = findViewById(R.id.txtBird);

        Animal animalOne = new Animal("Tiger", "Orange", 60, 80);
        txtAnimal.setText(animalOne.toString());

        Cat catOne = new Cat("Tabby", "Chocolate", 10, 5, 4, true);
        txtCat.setText(catOne.toString());

        Lion lionOne = new Lion("Lion", "Golden", 100, 140, 4, true,true);
        txtLion.setText(lionOne.toString());

        Leopard leopardOne = new Leopard("Leopard", "Black", 150, 120, 4, true, "Sharp");
        txtLeopard.setText(leopardOne.toString());

        Bird birdOne = new Bird("Jay", "Blue", 400, 2,  true, 2);
        txtBird.setText(birdOne.toString());
    }

}