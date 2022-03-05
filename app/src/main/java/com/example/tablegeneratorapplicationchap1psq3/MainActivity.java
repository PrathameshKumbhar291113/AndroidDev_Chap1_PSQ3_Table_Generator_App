package com.example.tablegeneratorapplicationchap1psq3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;

    private EditText editNumber;
    private TextView textView2;
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        StringBuffer buffer = new StringBuffer();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editNumber = findViewById(R.id.editNumber);
        textView2 = findViewById(R.id.textView2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                        String s = editNumber.getText().toString();
                        int table = Integer.parseInt(s);
                        for(int i=1 ; i<=10 ; i++){
                            result = table * i;
                          buffer.append(table + " x " + i + " = " + result + "\n\n");
                        }
                textView2.setText(buffer);
            }
        });
    }
}