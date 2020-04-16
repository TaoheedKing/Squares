import java.util.Scanner;

public class Shape {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = keyboard.nextInt();
        int squared;
        for (int i = 1; i <= num; i++){
            squared = i * num;
            System.out.printf("%d\t\t%d\n", i, squared);
            //squared = (num*num);
            //System.out.print("squared");
        }
    }
}


/**
 *User enters a number
 *it starts at 1, prints the square of that number next to it
 * then, then it repeats this process with the next number(2).
 * the number imputed by the user is the max.
 * once the program increments up to that number, it exits the program.
 * */