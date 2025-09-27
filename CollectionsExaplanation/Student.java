package CollectionsExaplanation;

import java.util.*;

class Student {
    public String name;
    public String dept;
    public Integer age;

    Student(String name, String dept, Integer age) {
        this.name = name;
        this.dept = dept;
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nName: " +name + "\nDepartment: " +dept + "\nAge: " +age;
    }
}

class Sample {
    public static void main(String[] args) {
        Student s1 = new Student("Ganning Joel", "ECE", 19);
        System.out.println(s1);

        List<Student> s2 = new ArrayList<>();
        s2.add(new Student("Paul Antony", "CSE", 23));

        for(Student student : s2) {
            System.out.println(student);
        }
    }
}
