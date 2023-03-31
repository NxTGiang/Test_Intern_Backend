/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Input index of number in Fibonacci
        int n = GetIndex();
        //Generate number has index is n
        int result = Fibonacci(n);
        //display result
        System.out.println("Number has index " + n + " is: " + result);
    }
    
    
    static int Fibonacci(int n){
        if (n == 1 || n == 2){
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
    
    private static Scanner sc = new Scanner(System.in);

    private static int GetIndex() {
        int input;
        while (true) {
            try {
                System.out.print("Input index of number: ");
                input = Integer.parseInt(sc.nextLine());
                if (input <= 0) {
                    throw new Exception();
                }
                return input;
            } catch (Exception e) {
                System.out.println("Index must be positve integer number");
            }
        }
    }
}
