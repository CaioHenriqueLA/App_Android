package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button buttonLimpar;
    private Button buttonConfirmar;
    private TextView textView;
    private EditText editText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonConfirmar = (Button)findViewById(R.id.buttonConfirmar);
        buttonLimpar = (Button)findViewById(R.id.buttonLimpar);
        editText2 = (EditText)findViewById(R.id.editText2);
        textView = (TextView)findViewById(R.id.textView);

        buttonLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText2.setText("");
                textView.setText(getText(R.string.text_padrao));
            }
        });




    }

    public void confirmar(View view) {
        textView.setText(editText2.getText());
    }
}
