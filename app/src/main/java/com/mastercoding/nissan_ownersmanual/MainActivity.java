package com.mastercoding.nissan_ownersmanual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button myBtn;
    Button ownMan;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edittext);
        myBtn = findViewById(R.id.btn);
        ownMan = findViewById(R.id.Owners_Manual);
        title = findViewById(R.id.title);

        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputName = editText.getText().toString();

                Toast.makeText(MainActivity.this, "Welcome "+inputName+", to Nissan", Toast.LENGTH_LONG).show();
            }
        });


    }

    public void qrCode(View view){
        setContentView(R.layout.owners_manual);
    }

    public void homesScreen(View view){
        setContentView(R.layout.activity_main);
    }

    public void easterEgg(View view){
        setContentView(R.layout.easter_egg);
    }
}