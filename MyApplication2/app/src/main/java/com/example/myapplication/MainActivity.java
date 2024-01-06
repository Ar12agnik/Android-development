package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textview;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        textview=findViewById(R.id.textView2);
        editText=findViewById(R.id.editTextText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  Toast.makeText(MainActivity.this, "Hi click Listner Worked!!", Toast.LENGTH_SHORT).show();
                try {
                    String s = editText.getText().toString();

                    int kg = Integer.parseInt(s);
                    double pound = kg * 2.205;
                    textview.setText("The corrosponding value in pound is " + pound);
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "Please Enter a integer value", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}