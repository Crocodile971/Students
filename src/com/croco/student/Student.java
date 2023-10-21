package com.croco.student;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    String nom;
    double[] notes;

    public Student(String nom, double... notes) {
        this.nom = nom;
        this.notes = notes;
    }

    double moyenne() {
        double sum = 0;
        for (double note : notes) {
            sum += note;
        }
            return sum / notes.length;

    }


}
