package com.example.testing;


/*import android.provider.Settings;
import android.content.Intent;
import android.annotation.SuppressLint;
import android.content.AsyncQueryHandler;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.view.View;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import android.os.Environment;
import android.Manifest;
import android.view.View;
import androidx.annotation.NonNull;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.List;*/

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity  {
    Button rnd, two;
    TextView one;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        rnd = (Button) findViewById(R.id.button);
        two = (Button) findViewById(R.id.button2);
        one = (TextView) findViewById(R.id.textView);


    rnd.setOnClickListener(v ->{
        Random numGen = new Random();
        int numg;
        numg = numGen.nextInt(100);
        String stringG = String.valueOf(numg);
        one.setText(stringG);
        showToast("itworks");
    });
    two.setOnClickListener(v -> {
        Intent nextScreen = new Intent(MainActivity2.this, MainActivity3.class);
        startActivity(nextScreen);
    });
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }


}
