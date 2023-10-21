package com.croco.student;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>();

        Student student1 = new Student("Joseph", 14.3, 15, 18);
        students.add(student1);
        Student student2 = new Student("Marie", 10, 9, 6, 5);
        students.add(student2);
        Student student3 = new Student("Judith", 15.0, 17.0, 14.5);
        students.add(student3);


        System.out.println("Je me nomme " + student1.nom + " ma moyenne est de :" + student1.moyenne());
        System.out.println("Je me nomme " + student2.nom + " ma moyenne est de :" + student2.moyenne());
        System.out.println("Je me nomme " + student3.nom + " ma moyenne est de :" + student3.moyenne());


        }
    }
