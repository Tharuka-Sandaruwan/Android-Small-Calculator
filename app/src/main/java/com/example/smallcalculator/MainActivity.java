package com.example.smallcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        double num1,num2;
        TextView num1 = (TextView) findViewById(R.id.num1);
        TextView num2 = (TextView) findViewById(R.id.num2);

        TextView results = (TextView) findViewById(R.id.result) ;

        Button addBtn = (Button) findViewById(R.id.addBtn) ;
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Integer.parseInt(num1.getText())+Integer.parseInt(num2.getText())
                int no1= Integer.parseInt(num1.getText().toString());
                int no2= Integer.parseInt(num2.getText().toString());
                results.setText(String.valueOf(no1+no2));
            }
        });
    }
}