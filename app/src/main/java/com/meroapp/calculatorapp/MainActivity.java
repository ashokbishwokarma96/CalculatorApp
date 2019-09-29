package com.meroapp.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.meroapp.calculatorapp.MathOperation.MathOperationClass;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button_0,button_1,button_2,button_3,button_4,button_5,button_6,button_7,button_8,button_9,
                   button_point,button_equals,button_addition,button_subtraction,button_multiply,button_divide,
                   button_clear;
    private TextView textView_screen;
    private double firstNumber,secondNumber,result;
    boolean mAddition,mSubstraction,mMultiplication,mDivision;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_0= findViewById(R.id.button_0);
        button_1=findViewById(R.id.button_1);
        button_2=findViewById(R.id.button_2);
        button_3=findViewById(R.id.button_3);
        button_4=findViewById(R.id.button_4);
        button_5=findViewById(R.id.button_5);
        button_6=findViewById(R.id.button_6);
        button_7=findViewById(R.id.button_7);
        button_8=findViewById(R.id.button_8);
        button_9=findViewById(R.id.button_9);
        button_point=findViewById(R.id.button_point);
        button_equals=findViewById(R.id.button_equals);
        button_addition=findViewById(R.id.button_addition);
        button_subtraction=findViewById(R.id.button_subtraction);
        button_multiply=findViewById(R.id.button_multiply);
        button_divide=findViewById(R.id.button_divide);
        button_clear=findViewById(R.id.button_clear);
        textView_screen=findViewById(R.id.textView_screen);

        button_0.setOnClickListener(this);
        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_4.setOnClickListener(this);
        button_5.setOnClickListener(this);
        button_6.setOnClickListener(this);
        button_7.setOnClickListener(this);
        button_8.setOnClickListener(this);
        button_9.setOnClickListener(this);
        button_addition.setOnClickListener(this);
        button_subtraction.setOnClickListener(this);
        button_multiply.setOnClickListener(this);
        button_divide.setOnClickListener(this);
        button_equals.setOnClickListener(this);
        button_point.setOnClickListener(this);
        button_clear.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {


        switch (view.getId()){
            case R.id.button_0:
                textView_screen.append("0");
                break;

            case R.id.button_1:

                textView_screen.append("1");
                break;

            case R.id.button_2:

                textView_screen.append("2");
                break;

            case R.id.button_3:

                textView_screen.append("3");
                break;

            case R.id.button_4:

                textView_screen.append("4");
                break;

            case R.id.button_5:

                textView_screen.append("5");
                break;

            case R.id.button_6:

                textView_screen.append("6");
                break;

            case R.id.button_7:

                textView_screen.append("7");
                break;

            case R.id.button_8:

                textView_screen.append("8");
                break;

            case R.id.button_9:

                textView_screen.append("9");

            case R.id.button_point:

                textView_screen.append(".");
                break;

            case R.id.button_addition:
                if(textView_screen == null){
                    textView_screen.setText("");
                }
                else{
                    firstNumber = Float.parseFloat(textView_screen.getText()+"");
                    mAddition = true;
                    textView_screen.setText("");
                 }
                break;

            case R.id.button_subtraction:
                if(textView_screen == null){
                    textView_screen.setText("");
                }
                else{
                    firstNumber = Float.parseFloat(textView_screen.getText()+"");
                    mSubstraction = true;
                    textView_screen.setText("");
                }
                break;

            case R.id.button_multiply:
                if(textView_screen == null){
                    textView_screen.setText("");
                }
                else{
                    firstNumber = Float.parseFloat(textView_screen.getText()+"");
                    mMultiplication = true;
                    textView_screen.setText("");
                }
                break;

            case R.id.button_divide:
                if(textView_screen == null){
                    textView_screen.setText("");
                }
                else{
                    firstNumber = Float.parseFloat(textView_screen.getText()+"");
                    mDivision = true;
                    textView_screen.setText("");
                }
                break;

            case R.id.button_equals:
                secondNumber = Float.parseFloat(textView_screen.getText()+"");



                if(mAddition == true){
                    MathOperationClass mathOperationClass = new MathOperationClass(firstNumber,secondNumber);
                    result = mathOperationClass.addition();
                    textView_screen.setText(result+"");
                    mAddition=false;
                }

                if(mSubstraction == true){
                    MathOperationClass mathOperationClass = new MathOperationClass(firstNumber,secondNumber);
                    result = mathOperationClass.substraction();
                    textView_screen.setText(result+"");
                    mSubstraction=false;
                }

                if(mMultiplication == true){
                    MathOperationClass mathOperationClass = new MathOperationClass(firstNumber,secondNumber);
                    result = mathOperationClass.multiplication();
                    textView_screen.setText(result+"");
                    mMultiplication=false;
                }

                if(mDivision == true){
                    MathOperationClass mathOperationClass = new MathOperationClass(firstNumber,secondNumber);
                    result = mathOperationClass.division();
                    textView_screen.setText(result+"");
                    mDivision=false;
                }
                break;

            case R.id.button_clear:

                textView_screen.setText("");
        }



    }
}
