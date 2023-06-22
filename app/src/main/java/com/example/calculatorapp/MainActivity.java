package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9,btndecimal ,btndouble0, buttonAdd, buttonSub, buttonDivision,
            buttonMul, buttonC, buttonEqual, btnbksp;
    TextView res;
    int index = 0;

    float mValueOne, mValueTwo;
    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.btn0);
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);
        button5 = (Button) findViewById(R.id.btn5);
        button6 = (Button) findViewById(R.id.btn6);
        button7 = (Button) findViewById(R.id.btn7);
        button8 = (Button) findViewById(R.id.btn8);
        button9 = (Button) findViewById(R.id.btn9);
        btndouble0 = (Button) findViewById(R.id.btndouble0);
        btndecimal = (Button) findViewById(R.id.btndecimal);
        buttonAdd = (Button) findViewById(R.id.btnadd);
        buttonSub = (Button) findViewById(R.id.btnsub);
        buttonMul = (Button) findViewById(R.id.btnmulti);
        buttonDivision = (Button) findViewById(R.id.btndivide);
        buttonC = (Button) findViewById(R.id.btnclr);
        buttonEqual = (Button) findViewById(R.id.btnresult);
        btnbksp = (Button) findViewById(R.id.btnbksp);
        res =findViewById(R.id.tvInput);

//        tvInput = findViewById(R.id.tvInput);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText() + "9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.length() == 0) {
                    return;
                }
                res.setText(res.getText() + "0");
            }
        });

        btndecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.length() == 0) {
                    return;
                }
                res.setText(res.getText() + ".");
            }
        });

        btndouble0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.length() == 0) {
                    return;
                }
                res.setText(res.getText() + "00");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.length() == 0) {
                    return;
                } else {
                    index = res.length() + 1;
                    mValueOne = Float.parseFloat(res.getText() + "");
                    crunchifyAddition = true;
                    res.setText(res.getText() + "+");
                }
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.length() == 0) {
                    return;
                }else
                {
                    index = res.length() + 1;
                    mValueOne = Float.parseFloat(res.getText() + "");
                    mSubtract = true;
                    res.setText(res.getText() + "-");
                }
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.length() == 0) {
                    return;
                }else {
                    index = res.length() + 1;
                    mValueOne = Float.parseFloat(res.getText() + "");
                    crunchifyMultiplication = true;
                    res.setText(res.getText() + "*");
                }
            }
        });
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.length() == 0) {
                    return;
                }else {
                    index = res.length() + 1;
                    mValueOne = Float.parseFloat(res.getText() + "");
                    crunchifyDivision = true;
                    res.setText(res.getText() + "/");
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = String.valueOf(res.getText());
                temp = temp.substring(index, temp.length());

                mValueTwo = Float.parseFloat(temp + "");
                if (crunchifyAddition == true) {
                    res.setText(mValueOne + mValueTwo + "");
                    crunchifyAddition = false;
                }
                if (mSubtract == true) {
                    res.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }
                if (crunchifyMultiplication == true) {
                    res.setText(mValueOne * mValueTwo + "");
                    crunchifyMultiplication = false;
                }
                if (crunchifyDivision == true) {
                    res.setText(mValueOne / mValueTwo + "");
                    crunchifyDivision = false;
                }
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText("");
            }
        });
        btnbksp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.length() == 0) {
                    return;
                }else {
                    String temp = String.valueOf(res.getText());
//                System.out.println(temp.substring(0, temp.length() - 1));
                    temp = temp.substring(0, temp.length() - 1);
                    res.setText(temp);
                }
            }
        });
    }
}