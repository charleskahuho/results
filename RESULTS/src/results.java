import java.util.Scanner;

public class results {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello Charles");
        String name = "Kahuho Charles Mbithi";
        double semester = 2.2;
        String regNo = "C026-01-0941/2022";
        System.out.println("Enter the number of units");
        int units = scanner.nextInt();
        double average;
        int total = 0;
        char grade = ' ';
        String[] unitCodes = new String[units];
        String[] unitNames = new String[units];
        int[] scores = new int[units];

        for (int i = 0; i < units; i++) {
            System.out.println("Enter the unit code for unit " + (i + 1));
            unitCodes[i] = scanner.next();
            System.out.println("Enter the unit name for unit " + (i + 1));
            unitNames[i] = scanner.next();
            System.out.println("Enter your score for unit " + (i + 1));
            scores[i] = scanner.nextInt();
            total += scores[i];
        }

        average = (double) total / units;
        
        if (average >= 70) {
            grade = 'A';
        } else if (average >= 60) {
            grade = 'B';
        } else if (average >= 50) {
            grade = 'C';
        } else if (average >= 40) {
            grade = 'D';
        } else if (average > 0) {
            grade = 'F';
        } else {
            System.out.println("Invalid grade");
        }

        System.out.println("\t\t\t\tDepartment of Computer Science");
        System.out.println("\t\t\t\t\tEnd Semester Results");
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("|Name:" + name + "\t\t|Roll.No:" + regNo + "\t\t\tSemester" + semester);
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("|Unit code:\t\t|Unit Name\t\t\tScore");
        System.out.println("--------------------------------------------------------------------------------------------------");
        for (int i = 0; i < units; i++) {
            System.out.println("|" +unitCodes[i] + "\t\t|" + unitNames[i] + "\t\t\t|" + scores[i]);
        }
        
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("|Total\t\t\t\t\t\t\t|" + total);
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("|Average\t\t\t\t\t\t|" + average);
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("|Grade\t\t\t\t\t\t\t|" + grade);
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\tRecommendation |");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("Grading    criteria\t\t Overall Grade(A-D)\tRecommend pass");
        System.out.println("70-100\t\tA");
        System.out.println("60-70\t\tB");
        System.out.println("50-60\t\tC");
        System.out.println("40-50\t\tD");
        System.out.println("Below 40\t F");
        System.out.println("------------------------------------------------------------------------------------------------------");
    }
}
