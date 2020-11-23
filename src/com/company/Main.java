package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        int maxValue = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (maxValue < numbers[i]) {
                maxValue = numbers[i];
            }
        }
        int minValue = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (minValue > numbers[i]) {
                maxValue = numbers[i];
            }
        }
        int soucet = 0;
        for (int i = 0; i < numbers.length; i++) {
            soucet = soucet + numbers[i];
        }
        int prumer = soucet / numbers.length;

        System.out.println("Největší číslo: " + maxValue);
        System.out.println("Nejmenší číslo: " + minValue);
        System.out.println("Průměr: " + prumer);
    }
}
