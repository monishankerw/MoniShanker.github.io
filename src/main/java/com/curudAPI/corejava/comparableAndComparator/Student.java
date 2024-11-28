package org.example.corejava.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private String section;
    public Student(){}

    public Student(int id, String name, String section) {
        this.id = id;
        this.name = name;
        this.section = section;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }



    public String getSection() {
        return section;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", section='" + section + '\'' +
                '}';
    }

    public int compareTo(Student student){
        return this.id-student.id;
    }

    public static void main(String[] args) {
        List<Student>stu=new ArrayList<>();
        stu.add(new Student(121,"abc","1A"));
        stu.add(new Student(123,"dbc","2B"));
        stu.add(new Student(122,"bbc","3M"));


        //sort by id
        Collections.sort(stu);
        System.out.println("Sorted By id:::");
        for (Student student:stu){
            System.out.println(student);
        }
    }

}
