package com.meroapp.calculatorapp.MathOperation;

public class MathOperationClass {
    private double firstNumber,secondNumber;

    public MathOperationClass(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double addition(){
        return firstNumber+secondNumber;
    }
    public double substraction(){
        return firstNumber-secondNumber;

    }public double multiplication(){
        return firstNumber*secondNumber;
    }
    public double division(){
        return firstNumber/secondNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
}
