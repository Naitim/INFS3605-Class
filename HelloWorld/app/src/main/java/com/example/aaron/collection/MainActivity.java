package com.example.aaron.collection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnAdd, btnMinus, btnMultiply, btnDivide;
    private TextView result;
    private EditText num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnMinus = (Button)findViewById(R.id.btnMinus);
        btnMultiply = (Button)findViewById(R.id.btnMultiply);
        btnDivide = (Button)findViewById(R.id.btnDivide);
        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText)findViewById(R.id.num2);
        result = (TextView)findViewById(R.id.result);

        btnAdd.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);

    }

    @Override
    public void onClick(View view){
        String firstNo = num1.getText().toString();
        String secondNo = num2.getText().toString();

        switch(view.getId()) {
            case R.id.btnAdd:
                int addition = Integer.parseInt(firstNo) + Integer.parseInt(secondNo);
                result.setText(String.valueOf(addition));
                break;
            case R.id.btnMinus:
                int subtraction = Integer.parseInt(firstNo) - Integer.parseInt(secondNo);
                result.setText(String.valueOf(subtraction));
                break;
            case R.id.btnMultiply:
                int multiplication = Integer.parseInt(firstNo) * Integer.parseInt(secondNo);
                result.setText(String.valueOf(multiplication));
                break;
            case R.id.btnDivide:
                try {
                    int divide = Integer.parseInt(firstNo) / Integer.parseInt(secondNo);
                    result.setText(String.valueOf(divide));
                } catch (Exception e) {
                    result.setText("CANNOT DIVIDE");
                }
                break;
        }
    }
}



