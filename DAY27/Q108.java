import java.util.*;

public class Q108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks of English: ");
        int eng = sc.nextInt();

        System.out.print("Enter marks of Maths: ");
        int math = sc.nextInt();

        System.out.print("Enter marks of Science: ");
        int sci = sc.nextInt();

        System.out.print("Enter marks of Computer: ");
        int comp = sc.nextInt();

        System.out.print("Enter marks of Hindi: ");
        int hindi = sc.nextInt();

        int total = eng + math + sci + comp + hindi;
        double percentage = total / 5.0;

        String grade;

        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 80)
            grade = "A";
        else if (percentage >= 70)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else if (percentage >= 50)
            grade = "D";
        else
            grade = "Fail";

        System.out.println("\n========== MARKSHEET ==========");
        System.out.println("Roll Number : " + roll);
        System.out.println("Student Name: " + name);
        System.out.println("-------------------------------");
        System.out.println("English   : " + eng);
        System.out.println("Maths     : " + math);
        System.out.println("Science   : " + sci);
        System.out.println("Computer  : " + comp);
        System.out.println("Hindi     : " + hindi);
        System.out.println("-------------------------------");
        System.out.println("Total Marks : " + total + "/500");
        System.out.println("Percentage : " + percentage + "%");
        System.out.println("Grade      : " + grade);
    }
}
