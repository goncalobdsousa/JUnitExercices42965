package org.example;

public class NumberLenghtMod {

    public double sumDigits(int number) {
        int cont = 0;
        double sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
            cont ++;
        }
        return sum / cont;

    }

}
