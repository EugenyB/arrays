package main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by eugeny on 26.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        //part1();
        //part2();
        part3();
    }

    private void part3() {
        Person[] persons = new Person[4];
        persons[0] = new Person("Иванов", 35);
        persons[1] = new Person("Сидоров", 27);
        persons[2] = new Person("Петров", 30);
        persons[3] = new Person("Петров", 28);

        Arrays.sort(persons, Comparator.comparing(Person::getName).thenComparing(Person::getAge));
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].getName() + " " +persons[i].getAge());
        }
    }

    private void part2() {
        int[] x;
        x = new int[5];
        x[0] = 4;
        x[1] = -8;
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
        System.out.println("---------------");
        double[] z = {5.2, -7.3, 0.45, -0.1};
        Arrays.sort(z);
        for (int i = 0; i < z.length; i++) {
            System.out.println(z[i]);
        }
        // Найти наибольший элемент
        double[] t = {5.2, -7.3, 10, 0.45, -0.1};
        double max = t[0];
        for (int i = 1; i < t.length; i++) {
            if (t[i]>max) {
                max = t[i];
            }
        }
        double min = t[0];
        for (int i = 1; i < t.length; i++) {
            if (t[i]<min) {
                min = t[i];
            }
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }

    private void part1() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        double x  = in.nextDouble();
        if (n>4) {
            System.out.println("Много");
        } else {
            System.out.println("Мало");
        }

        switch (n) {
            case 1:
                System.out.println("Один");
                break;
            case 2:
                System.out.println("Два");
                break;
            default:
                System.out.println("Другое");
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Hello!");
        }

        int k = 0;
        while (k<n) {
            System.out.println("k hello");
            k++;
        }

        int j = 8;
        do {
            System.out.println("j hello");
            j++;
        } while (j<n);
    }
}
