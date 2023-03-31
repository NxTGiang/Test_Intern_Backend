/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author admin
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Input size of list
        int n = GetInputData.GetSizeOfArray("Input size of list: ", "Size of array must be positive integer number!");
        //Input elements of list
        ArrayList<Integer> list = new ArrayList();
        list = GetInputData.GetArray(n, "Please input elements of array");
        //Sort list in ascending order
        Collections.sort(list);
        //Remove prime number in list
        list = removePrimeNumber(list);
        //Print list
        show(list);
    }

    private static ArrayList<Integer> removePrimeNumber(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (isPrimeNumber(list.get(i))){
                list.remove(i);
                i--;
            }
        }
        return list;
    }

    private static boolean isPrimeNumber(int i) {
        if (i == 0 || i == 1){
            return false;
        }else {
            for (int j = 2; j < i/2; j++) {
                if (i % j == 0 && i != j)
                    return false;
            }
        }
        return true;
    }
    
        private static void show(ArrayList<Integer> list) {
            System.out.print("Array: ");
            for (int i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
    }
}
