package com.msb;

public class Student {

    private String name="Jenny";
    private int age =18;

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s);
    }

}
