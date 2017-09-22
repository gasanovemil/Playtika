package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Application {

    public static void main(String[] args) {

            String[] students = new String[] {"Stud1","Stud2","Stud3","Stud4","Stud5"};
            int[] results = new int[] {1,2,3,4,5};
            int mark;
            double sum = 0;

            Random rrand = new Random();

            for (int i=0; i<students.length; i++)
            {
                mark = rrand.nextInt(results.length)+1;
                sum +=mark;
            }

            double avg=sum/results.length;
        System.out.println("Сумма оценок " + sum);
        System.out.println("Средняя оценка " + avg);
    }
}
