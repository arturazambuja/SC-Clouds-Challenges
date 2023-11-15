package org.example;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    public static void main(String[] args){
        int linearNumber = 9, recursiveNumber = 9;
        System.out.println("Linear Prime numbers until " + linearNumber + ": " + linearPrimes(linearNumber));
        System.out.println("Recursive Prime numbers until " + recursiveNumber + ": " + recursivePrimes(recursiveNumber));
    }
    private static boolean isPrime(int n) {
        if (n <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static List<Integer> linearPrimes(int n) {
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i<= n; i++){
            if (isPrime(i)){
                primes.add(i);
            }
        }
        return primes;
    }
    private static void recursiveAssistantPrimes(int n, List<Integer> primes, int candidate){
        if (candidate > n){
            return;
        }
        if (isPrime(candidate)){
            primes.add(candidate);
        }
        recursiveAssistantPrimes(n, primes, candidate + 1);
    }
    public static List<Integer> recursivePrimes(int n){
        List<Integer> primes = new ArrayList<>();
        recursiveAssistantPrimes(n, primes, 2);
        return primes;
    }
}
