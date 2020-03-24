package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = this.<TextView>findViewById(R.id.showText);
        tv.setText("swufe");
        EditText inp = this.<EditText>findViewById(R.id.inpText);
        String str = inp.getText().toString();
        System.out.print("input="+str);
        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.i("click","onClick");
    }
}
