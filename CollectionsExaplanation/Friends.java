package CollectionsExaplanation;

import java.util.*;

class Friends {
    private String name;
    private String dept;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " +name + "\nDepartment: " +dept + "\nAge: " +age;
    }
}

class Samples {
    public static void main(String[] args) {
        Friends f1 = new Friends();
        f1.setName("Ganning Joel");
        f1.setDept("ECE");
        f1.setAge(19);
        System.out.println("\n========== GENERAL OUTPUT ==========");
        System.out.println("Name: " +f1.getName() + "\nDepartment: " +f1.getDept() + "\nAge: " +f1.getAge());

        System.out.println("\n========== ARRAYLIST OUTPUT ==========");
        List<Friends> l1 = new ArrayList<>();
        Friends f2 = new Friends();
        f2.setName("Paul Antony");
        f2.setDept("CSE");
        f2.setAge(20);
        l1.add(f1);
        l1.add(f2);

        Friends f3 = new Friends();
        f3.setName("Kishore Kumar");
        f3.setDept("EEE");
        f3.setAge(18);
        l1.add(f3);

        Friends f4 = new Friends();
        f4.setName("Santhosh Kumar");
        f4.setDept("IT");
        f4.setAge(19);
        l1.add(f4);

        Friends f5 = new Friends();
        f5.setName("Harish Kumar");
        f5.setDept("BME");
        f5.setAge(20);
        l1.add(f5);

        Friends f6 = new Friends();
        f6.setName("Mukesh Kumar");
        f6.setDept("CIVIL");
        f6.setAge(20);
        l1.add(f6);

        for(Friends friend : l1) {
            System.out.println(friend);
        }

        l1.remove(f6);
        System.out.println("\nThe ArrayList After removing 6th friend: ");
        for(Friends friend : l1) {
            System.out.println(friend);
        }

        System.out.println("\nArrayList After Replacing the Exisiting friend: ");
        l1.set(0 , f2);
        for(Friends friend : l1) {
            System.out.println(friend);
        }

        System.out.println("\nArrayList After Adding Duplicate Values: ");   // DUPLICATES ARE ALWAYS ADDED TO THE END OF THE LIST
        l1.add(f2);
        for(Friends friend : l1) {
            System.out.println(friend);
        }

        System.out.println("\nThe Size of the ArrayList is: " +l1.size());

        System.out.println("\nThe Reversed ArrayList is: ");

        Collections.reverse(l1);     // IT WILL CHANGE MY ORIGINAL ORDER OF THE LIST (PERMANENTLY). TO GET MY OLD ORDER, I NEED TO SORT IT.
        for(Friends friend : l1) {
            System.out.println(friend);
        }

        for(Friends friend : l1.reversed()) {    // IT WILL NOT CHANGE MY ORIGINAL ORDER OF THE LIST. THE ORIGINAL ONE WILL BE THERE, THE REVERSED IS THE SEPARATE ONE.
            System.out.println(friend);
        }

        System.out.println("\nIs Friend f4 is present in ArrayList? " +l1.contains(f4));

        ArrayList<Friends> l2 = new ArrayList<>();
        l2.ensureCapacity(2);
    }
}
