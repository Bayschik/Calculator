package com.example.calculator;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private String operation = "";
    private Integer first, second, sum;
    private Boolean isOperationClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);

    }

    public void onNumberClick(View view) {
        String textButton = ((Button) view).getText().toString();
        if (textButton.equals("AC")) {
            textView.setText("0");
            first = 0;
        }else if (textView.getText().toString().contains(".")) {
            textView.append(".");
        } else if (textView.getText().toString().equals("0") || isOperationClick) {
            textView.setText(textButton);
        } else {
            textView.append(textButton);
        }
        isOperationClick = false;
    }

    public void onOperationClick(View view) {
        String textButton = ((Button) view).getText().toString();
        switch (textButton) {
            case "+":
                first = Integer.valueOf(textView.getText().toString());
                operation = "+";
                isOperationClick = true;
                break;
            case "-":
                first = Integer.valueOf(textView.getText().toString());
                operation = "-";
                isOperationClick = true;
                break;
            case "X":
                first = Integer.valueOf(textView.getText().toString());
                operation = "X";
                isOperationClick = true;
                break;
            case "/":
                first = Integer.valueOf(textView.getText().toString());
                operation = "/";
                isOperationClick = true;
                break;
            case "%":
                first = Integer.valueOf(textView.getText().toString());
                operation = "%";
                isOperationClick = true;
                break;
            case ".":
                first = Integer.valueOf(textView.getText().toString());
                operation = ".";
                isOperationClick = true;
                break;
            case "=":
                second = Integer.valueOf(textView.getText().toString());
                if (operation.equals("+")) {
                    sum = first + second;
                    textView.setText(sum.toString());
                } else if (operation.equals("-")) {
                    sum = first - second;
                    textView.setText(sum.toString());
                } else if (operation.equals("X")) {
                    sum = first * second;
                    textView.setText(sum.toString());
                } else if (operation.equals("/")) {
                    sum = first / second;
                    textView.setText(sum.toString());
                } else if (operation.equals("%")) {
                    sum = (first/100) * second;
                    textView.setText(sum.toString());
                }else if (operation.equals(".")) {
                    textView.setText(textButton.toString());
                }
                isOperationClick = true;
        }
    }

//    public void clickPercent(View view) {
//        if(operation == ""){
//            String textButton = ((Button) view).getText().toString();
//            double temp = Double.parseDouble(textButton) / 100;
//            textButton = temp + "";
//            textView.setText(textButton);
//        }else{
//
//        }
//    }
}


/*
switch (textButton){
            case "+":
                first = Integer.valueOf(textView.getText().toString());
                break;
            case "-":
                first = Integer.valueOf(textView.getText().toString());
                break;
            case "X":
                first = Integer.valueOf(textView.getText().toString());
                break;
            case "/":
                first = Integer.valueOf(textView.getText().toString());
                break;
            case"=":
                second = Integer.valueOf(textView.getText().toString());
                sum = first + second;
                textView.setText(sum.toString());
                break;
        }
        isOperationClick = true;
    }
 */