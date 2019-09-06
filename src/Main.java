import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num, i;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a number");
        System.out.print(">  ");
        num = keyboard.nextInt();
        keyboard.close();

/*
        // check if user number is prime or not and print
        int j = 0;
        for(i = 2; i < num; i++) {
            if (num % i == 0) {
                j++;
                break;
            }
        }
            if (j==0 && num != 1){
                System.out.print(num + " is prime");
            }else {
                System.out.print(num + " is not prime");
            }
    */

 // check all numbers up to input value is prime or not and print them


        int j;
        for (i = 1; i <= num; i++) {
            int counter = 0;
            for (j = i; j >= 1; j--) {
                if ((j % num) == 0) {
                    counter++;
                }
                System.out.println(i + " is prime");
            }
            if (counter == 2){
                System.out.print(i + " is prime");
            }
            }
        }
    }

