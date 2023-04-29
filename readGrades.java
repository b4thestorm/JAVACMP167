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

    public static int sum(int [] arr) {
        int value = 0;
        for (int i = 0; i < arr.length; i++) {
            value += arr[i];
        }
        return value;
    }
    
    public static int sum(int [] arr, int firstIndex, int lastIndex) {
        int value = 0;
        int access;
        
        try {
           access = arr[firstIndex];
        } catch(Exception e) {
            return -666;
        }
        try {
           access = arr[lastIndex];
        } catch(Exception e) {
            return -666;
        }
        
        for (int i = firstIndex; i <= lastIndex; i++) {
            value += arr[i];
        }
        
        return value;
    }

     public static double average(int [] arr) {
        int sum = 0;
        int i;
        double avgValue;
        for (i = 0 ; i < arr.length - 1; i++) {
            sum += arr[i];
        }
        
        avgValue = sum / i;
        
        return avgValue;
    }

    public static int maxValue(int[] arr) {
        int max = arr[0];
         
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i] ) {
                max = arr[i];
            }
        }

       return max;
    }

    public static int maxValue(int[] arr, int firstIndex, int lastIndex) {
        int max = arr[firstIndex];
        int access;
        
        try {
           access = arr[firstIndex];
        } catch(Exception e) {
            return -666;
        }
        
        try {
           access = arr[lastIndex];
        } catch(Exception e) {
            return -666;
        }
        
        for (int i = firstIndex + 1; i <= lastIndex; i++) {
            if (max < arr[i] ) {
                max = arr[i];
            }
        }

       return max;
    }

    
    public static void main(String args[]) {
        readGrades();
    }
}