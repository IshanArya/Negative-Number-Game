/**
 * Created by Ishan on 3/14/2015.
 */

import java.util.Scanner;
public class negativeNumber {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Put in your first number: ");
        int input = sc.nextInt();
        int check = input;

        while (input > 0){
            if(input < check){
                check = input;
            }

            System.out.println("Put in your next number: ");
            input = sc.nextInt();
        }

        System.out.println(check);
    }
}
