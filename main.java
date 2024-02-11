/**
 * arrayhw
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class arrayhw {

    public static void main(String[] args) {
        final int ARRAY_SIZE = 5;
        Scanner sc = new Scanner (System.in);
        Random rd = new Random();
        int [] array = new int [ARRAY_SIZE];
        class1 test1 = new class1();
        class2 test2 = new class2();
        int choice = 0;

        // creating the array
        for (int i = 0; i < array.length; i++){
            array[i] = rd.nextInt(101);
        }
        System.out.println("the array is: " + Arrays.toString(array));
        System.out.println();

        // displaying the menu options until user enters 4
        do {
            test1.displayMenu();
            System.out.print("enter the option: ");
            choice = sc.nextInt();
            System.out.println();
        // print maximum and minimum of the array
            if (choice == 1){
                System.out.println("min. of the array: " + test1.findMinOfArray(array));
                System.out.println("max. of the array: " + test1.findMaxOfArray(array));
            }
        // print the average and deviation of each element from the average
            else if (choice == 2){
                System.out.println(Arrays.toString(test2.findAverageAndDeviations(array)));
            }
        // print the sum of even and odd indexes
            else if (choice == 3){
                System.out.println("sum of odd indexes: " + test2.sumOfIndexes(array, true));
                System.out.println("sum of even indexes: " + test2.sumOfIndexes(array, false));
            }
        // exit
            else if (choice == 4){
                System.out.println("Goodbye...");
            }
            System.out.println();
        }
        while (choice != 4);


    









}
    









}
