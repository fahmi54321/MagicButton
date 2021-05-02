package com.android.a15magicbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import br.com.bloder.magic.view.MagicButton;

public class MainActivity extends AppCompatActivity {

    MagicButton magicButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        magicButton = findViewById(R.id.magic_button);
        magicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Klik", Toast.LENGTH_SHORT).show();
            }
        });
    }
}