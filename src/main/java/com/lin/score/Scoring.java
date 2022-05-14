package com.lin.score;

import java.util.ArrayList;
import java.util.List;

public class Scoring {
    public static void main(String[] args) {
       /* Student jack = new Student("Jack",70,88);
//        jack.name = "Jack";
        //jack.english = 70;
        //jack.math = 88;
        Student hack = new Student("Hank",60,30);
        Student s = new Student();
        GraduateStudent jane = new GraduateStudent("Jane", 70, 80, 60);
        jane.name = "Jane";
        jane.print();
        jack.print();
        hack.print();
        */
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jack",70,88));
        students.add(new Student("Hank",60,30));
        students.add(new GraduateStudent("Jane", 70, 80, 60));
        for (Student c: students) {
            c.print();
        }
    }
}
