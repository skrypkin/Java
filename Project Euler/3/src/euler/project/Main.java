package euler.project;

/*
Largest prime factor

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */

public class Main {

    public static void main(String[] args) {

        double x = 600851475143d;

        for (double i = 2; i * i <= x; i++) {

            if (x % i == 0) {

                System.out.println("Простые делители: " + i);
            }
        }

    }
}