import java.util.Scanner;

public class MyClass {
    public static int readGrades() {
        int idx = 0;
        int input = 0;
        Scanner scnr = new Scanner(System.in);
        
        int [] grades = new int [5];
        
        while (input >= 0) {
            System.out.println("Enter a grade: ");
            input = scnr.nextInt();
            if (input > 0) {
                grades[idx] = input;
                idx = idx + 1;
            }
        }
        
        return idx;
    }

    public static void main(String args[]) {
        readGrades();
    }
}
