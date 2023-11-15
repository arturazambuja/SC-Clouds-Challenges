package org.example;

public class Fibonacci {

    public static void main(String[] args) {
        int linearNumber = 7, recursiveNumber = 7;

        System.out.println("Linear fibonacci of " + linearNumber + " : " + linearFibonacci(linearNumber));
        System.out.println("Recursive fibonacci of " + recursiveNumber + " : " + recursiveFibonacci(recursiveNumber));
    }
    public static int linearFibonacci(int n){
        if (n <= 1) {
            return n;
        }
        int fibonacci = 0;
        int fibonacciNumber1 = 1;
        int fibonacciNumber2 = 2;

        for (int i = 2; i <= n; i++){
            fibonacci = fibonacciNumber1 + fibonacciNumber2;
            fibonacciNumber2 = fibonacciNumber1;
            fibonacciNumber1 = fibonacci;
        }
        return fibonacci;
    }
    public static int recursiveFibonacci(int n){
        if (n <= 1) {
            return n;
        }else {
            return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
        }
    }
}