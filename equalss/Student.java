package collections.equalss;

public class Student {
    public static void main(String[] args) {

        String st1 = new String("Anh");

        String st2 = new String("Anh");

        System.out.println("st1 == s2: " + (st1==st2));

        System.out.println("st1 equals st2: " + st1.equals(st2));

        String studentname = null;
        System.out.println("\"admin\".equals(username): " + "admin".equals(studentname));
    }

}