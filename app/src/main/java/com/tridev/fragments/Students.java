package com.tridev.fragments;

import java.util.ArrayList;

/**
 * Created by Tridev on 09-07-2016.
 */
public class Students {

    public  static class Student {
        String sNo;
        String name;
        int image_id;
        String company;

        public Student(String sNo,String name,String company, int image_id) {
            this.name = name;
            this.image_id = image_id;
            this.company =company;
            this.sNo=sNo;

        }


    }

    public static ArrayList<Student>getStudents(){

        ArrayList<Student> students = new ArrayList<>(10);

            students.add(new Student("01", "Steve Jobs", "Apple", R.drawable.a));
            students.add(new Student("02", "Bill Gates", "Microsoft", R.drawable.hi));
            students.add(new Student("03", "Larry Page", "Google", R.drawable.b));
            students.add(new Student("04", "Sergey Brin", "Google", R.drawable.ii));
            students.add(new Student("05", "Jeff Bezos", "Amazon", R.drawable.gi));
            students.add(new Student("06", "Mark Zuckerberg", "Facebook", R.drawable.c));
            students.add(new Student("07", "Elon Musk","Tesla",R.drawable.f));
            students.add(new Student("08", "Sundar Pichai","Google",R.drawable.d));
            students.add(new Student("09", "Satya Nadella","Microsoft",R.drawable.e));
            students.add(new Student("10", "Sachin Bansal","Flipkart",R.drawable.ji));


        return students;
    }

}