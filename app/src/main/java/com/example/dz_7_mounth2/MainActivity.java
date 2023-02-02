package com.example.dz_7_mounth2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private static final String emptyString = "";
    private Button[] buttonsNumber, buttonOperation;
    private Button buttonEqual;
    private TextView tvResult;
    private String firstNumber, secondNumber, result;
    private OperationStatus operationStatus = OperationStatus.DEFAULT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        funFindViewByiD();
        funNumber(buttonsNumber);
        funOperation(buttonOperation);
        funEqual();
    }


    private void funOperation(Button[] buttonOperation) {
        Button button_plus = findViewById(R.id.btn_plus);
        Button button_minus = findViewById(R.id.btn_minus);
        Button button_multiple = findViewById(R.id.btn_umn);
        Button button_divided = findViewById(R.id.btn_delenie);
        Button button_ac = findViewById(R.id.btn_ac);


        button_ac.setOnClickListener(v -> {
            tvResult.setText("0");
        });
        button_plus.setOnClickListener(v -> {
            firstNumber = tvResult.getText().toString();
            tvResult.setText("0");
            operationStatus = OperationStatus.PLUS;
        });
        button_minus.setOnClickListener(v -> {
            firstNumber = tvResult.getText().toString();
            tvResult.setText("0");
            operationStatus = OperationStatus.MINUS;
        });
        button_multiple.setOnClickListener(v -> {
            firstNumber = tvResult.getText().toString();
            tvResult.setText("0");
            operationStatus = OperationStatus.MULTIPLE;
        });
        button_divided.setOnClickListener(v -> {
            firstNumber = tvResult.getText().toString();
            tvResult.setText("0");
            operationStatus = OperationStatus.DIVIDE;
        });

    }

    private void funEqual() {
        buttonEqual.setOnClickListener(v -> {
            secondNumber = tvResult.getText().toString();
            Integer frstNumber = Integer.parseInt(firstNumber);
            Integer scndNumber = Integer.parseInt(secondNumber);
            switch (operationStatus){
                case PLUS:
                    result = String.valueOf(frstNumber + scndNumber);
                    break;
                case MINUS:
                    result = String.valueOf(frstNumber - scndNumber);
                    break;
                case DIVIDE:
                    result = String.valueOf(frstNumber / scndNumber);
                    break;
                case MULTIPLE:
                    result = String.valueOf(frstNumber * scndNumber);
                    break;
                case DEFAULT:
                    break;
            }
            tvResult.setText(result);
            firstNumber = emptyString;
            secondNumber = emptyString;
            operationStatus = OperationStatus.DEFAULT;

        });


    }

    private void funNumber(Button[] buttonsNumber) {
        Button button = findViewById(R.id.btn_one);
        Button button2 = findViewById(R.id.btn_two);
        Button button3 = findViewById(R.id.btn_three);
        Button button4 = findViewById(R.id.btn_four);
        Button button5 = findViewById(R.id.btn_five);
        Button button6 = findViewById(R.id.btn_six);
        Button button7 = findViewById(R.id.btn_seven);
        Button button8 = findViewById(R.id.btn_eight);
        Button button9 = findViewById(R.id.btn_nine);
        Button button0 = findViewById(R.id.btn_zero);
        firstNumber = "";


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Objects.equals(firstNumber, "")) {
                    firstNumber = "1";
                }
                else firstNumber = firstNumber + "1";
                tvResult.setText(firstNumber);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Objects.equals(firstNumber, "")) firstNumber = "2";
                else firstNumber = firstNumber + "2";
                tvResult.setText(firstNumber);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Objects.equals(firstNumber, "")) firstNumber = "3";
                else firstNumber = firstNumber + "3";
                tvResult.setText(firstNumber);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Objects.equals(firstNumber, "")) firstNumber = "4";
                else firstNumber = firstNumber + "4";
                tvResult.setText(firstNumber);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Objects.equals(firstNumber, "")) firstNumber = "5";
                else firstNumber = firstNumber + "5";
                tvResult.setText(firstNumber);
            }
        });


        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Objects.equals(firstNumber, "")) firstNumber = "6";
                else firstNumber = firstNumber + "6";
                tvResult.setText(firstNumber);
            }
        });


        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Objects.equals(firstNumber, "")) firstNumber = "7";
                else firstNumber = firstNumber + "7";
                tvResult.setText(firstNumber);
            }
        });


        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Objects.equals(firstNumber, "")) firstNumber = "8";
                else firstNumber = firstNumber + "8";
                tvResult.setText(firstNumber);
            }
        });


        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Objects.equals(firstNumber, "")) firstNumber = "9";
                else firstNumber = firstNumber + "9";
                tvResult.setText(firstNumber);
            }
        });


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Objects.equals(firstNumber, "")) firstNumber = "0";
                else firstNumber = firstNumber + "0";
                tvResult.setText(firstNumber);
            }
        });

    }

    private void funFindViewByiD() {
        buttonOperation = new Button[]{
                findViewById(R.id.btn_plus),
        };

        buttonsNumber = new Button[]{
                findViewById(R.id.btn_one), findViewById(R.id.btn_two)
        };

        buttonEqual = findViewById(R.id.btn_equal);
        tvResult = findViewById(R.id.tv_result);

    }
    private enum OperationStatus{
        DEFAULT, PLUS, MINUS, MULTIPLE, DIVIDE
    }


}