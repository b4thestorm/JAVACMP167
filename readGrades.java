import java.util.Scanner;
import java.util.Arrays;

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
            
            if (idx > grades.length - 1) {
                //make a copy of grades
                int [] tempArray = new int [grades.length];
                tempArray = Arrays.copyOf(grades, grades.length);
                //resize the array to handle more inputs
                grades = new int[grades.length * 2];
                //add back original values into the new grades array
                for (int i = 0; i < tempArray.length; i++) {
                    grades[i] = tempArray[i];
                }
                idx = idx + 1;
            }
        }
        
        return idx;
    }
    
    public static void main(String args[]) {
        readGrades();
    }
}