package model;

public class Calculator {
    public static void main(String[] args) {

    }
    public static float add(float num1, float num2){
        return num1 + num2;
    }

    public static float subtract(float num1, float num2){
        return num1 - num2;
    }

    public static float divide(float num1, float num2){
       if (num1 == 0) {
           throw new IllegalArgumentException("Il dividendo è uguale a 0");
       }
       return num1 / num2;
    }

    public static float multiply(float num1, float num2){
        return num1 * num2;
    }
}
