package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print("enter a number");
                int num = sc.nextInt();

                //calling the method
                int result2 = result(num);

                System.out.println(result2);


                //creating a method


    }
    public static int result(int num){
        int  total = num / 3;
        return total;

    }


}
