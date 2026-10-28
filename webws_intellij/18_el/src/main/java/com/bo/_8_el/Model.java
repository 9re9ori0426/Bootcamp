package com.bo._8_el;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

public class Model {
    public static void calcScore(HttpServletRequest req) {
        String name =  req.getParameter("name");
        double mid = Double.parseDouble(req.getParameter("mid"));
        double fin = Double.parseDouble(req.getParameter("fin"));

        double avg = (mid+fin)/2;
        String grade = "F";
        if( avg >= 90 ){
            grade = "A";
        }
        else if (avg >= 80 ){
            grade = "B";
        }
        else if (avg >= 70 ){
            grade = "C";
        }

        Student st = new Student(name, mid, fin, avg, grade);

        req.setAttribute("bean", st);

        //////////////////////////////////

        req.setAttribute("a","asdasd");
        req.setAttribute("b",12);

        int [] ar = {3, 6, 9};
        req.setAttribute("c",ar);

        Student[] ss = new Student[2];
        ss[0] = st;
        ss[1] = new Student("mz1", 20, 30, 99.9, "S");

        req.setAttribute("studentsss",ss);

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("mz2", 20, 30, 45, "S"));
        students.add(new Student("mz3", 20, 40, 90, "A"));

        req.setAttribute("students",students);
    }
}
