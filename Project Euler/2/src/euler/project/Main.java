package euler.project;
/*
Even Fibonacci numbers

Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */

public class Main {

    public static void main(String[] args) {

        int a = 2;
        int b = 0;
        int c = 0;
        int i;
        int x = 0;

        for (i = 2; i < 100; i+=2) {

            if (c % 2 == 0) {
                c = a + b;
                a = b;
                b = c;
                x += c;
                //System.out.println(c);
            }
            if (x >= 4000000) {
                break;
            }
        }
        System.out.println("Сумма чётных эл-ов: " + x);
    }
}
