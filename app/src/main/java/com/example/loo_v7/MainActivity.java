package com.example.loo_v7;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    TextView text;
    TextInputEditText intext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.textView);
        intext = (TextInputEditText) findViewById(R.id.textToUse);
    }


    public void testMethod(View v) {
        System.out.println("Hello World!");
        text.setText(intext.getText());
    }
}