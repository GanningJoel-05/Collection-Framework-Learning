package customclassesinjava;

class Student {
    public String name;
    public Integer rollNo;
    public Integer marks;

    Student(String name, Integer rollNo, Integer marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public boolean isPassed() {
        return marks >= 40;
    }
}

public class Example2 {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Ganning Joel", 49, 70),
                new Student("Paul Antony", 55, 30),
                new Student("Kishore Kumar", 34, 23),
                new Student("Regan Joshwa", 67, 89),
                new Student("Santhosh Kumar", 90, 66)
        };

        for (Student s : students) {
            if (s.isPassed()) {
                System.out.println(s.name + " has Passed!");
            }
            else {
                System.out.println(s.name + " has Failed!");
            }
        }
    }
}
