package collections.classandobj;

import java.util.Scanner;

public class New {
        // Attributes (private)
        private String name;
        private int age;

        // Constructor (public, no-args)
        public New(String name, int age) {
            this.name = "";
            this.age = 0;
        }

        // Methods (public)
        public void getInformation() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter name: ");
            this.name = sc.nextLine();

            System.out.print("Enter age: ");
            while (!sc.hasNextInt()) {
                System.out.print("Invalid age. Enter age again: ");
                sc.next(); // bỏ token sai
            }
            this.age = sc.nextInt();
        }

        public void display() {
            System.out.println("Student Information:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }
