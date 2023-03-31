/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author admin
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Input size of list
        int size = GetInputData.GetSizeOfArray("Input size of array: ", "Size of array must be positive integer number!");
        //Input elements of list
        ArrayList<Integer> list = new ArrayList();
        list = GetInputData.GetArray(size, "Please input elements of array");
        //input number of elements in a set
        int n = GetInputData.GetNumberOfElement("Input number of elements in a set", "Must be input positive integer number");
        //Sort list in ascending order
        Collections.sort(list);
        show(list);
        System.out.println("Number of element in set is: " + n);
        //display result
        DisplayResult(list, n);
    }

    private static void show(ArrayList<Integer> list) {
        System.out.print("Array: ");
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void DisplayResult(ArrayList<Integer> list, int n) {
        ArrayList<ArrayList<Integer>> sets = getSets(list, n);
               
        for (ArrayList<Integer> set : sets) {
            for (int i = 0; i < set.size(); i++) {
                System.out.print(set.get(i));
                if (i < set.size() - 1) {
                    System.out.print("&");
                }
            }
            System.out.println();
        }
    }
    
    public static ArrayList<ArrayList<Integer>> getSets(ArrayList<Integer> list, int n) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        if (n == 0) {
            result.add(new ArrayList<Integer>());
            return result;
        }

        if (list.isEmpty()) {
            return result;
        }

        int first = list.get(0);
        ArrayList<Integer> subList = new ArrayList<Integer>(list.subList(1, list.size()));

        ArrayList<ArrayList<Integer>> withoutFirst = getSets(subList, n);
        ArrayList<ArrayList<Integer>> withFirst = getSets(subList, n - 1);

        result.addAll(withoutFirst);
        for (ArrayList<Integer> set : withFirst) {
            set.add(0, first);
            result.add(set);
        }

        return result;
    }


}
