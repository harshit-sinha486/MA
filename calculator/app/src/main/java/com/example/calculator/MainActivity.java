package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    TextView res;
    EditText n1,n2;
    Button ba,bs,bm,bd;
    double val1,val2,r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        res=(TextView)findViewById(R.id.result);
        n1=(EditText)findViewById(R.id.e1);
        n2=(EditText)findViewById(R.id.e2);
        ba=(Button)findViewById(R.id.badd);
        bs=(Button)findViewById(R.id.bsub);
        bm=(Button)findViewById(R.id.bmul);
        bd=(Button)findViewById(R.id.bdiv);
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Double.parseDouble(n1.getText().toString());
                val2=Double.parseDouble(n2.getText().toString());
                r=val1+val2;
                res.setText(Double.toString(r));
            }
        });
        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Double.parseDouble(n1.getText().toString());
                val2=Double.parseDouble(n2.getText().toString());
                r=val1-val2;
                res.setText(Double.toString(r));
            }
        });
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Double.parseDouble(n1.getText().toString());
                val2=Double.parseDouble(n2.getText().toString());
                r=val1*val2;
                res.setText(Double.toString(r));
            }
        });
        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Double.parseDouble(n1.getText().toString());
                val2=Double.parseDouble(n2.getText().toString());
                r=val1/val2;
                res.setText(Double.toString(r));
            }
        });
    }
}

