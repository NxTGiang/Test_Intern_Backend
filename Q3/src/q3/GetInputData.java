/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class GetInputData {
    private static Scanner sc = new Scanner(System.in);

    static int GetSizeOfArray(String inputMsg, String errMsg) {
        int input;
        while (true) {
            try {
                System.out.print(inputMsg);
                input = Integer.parseInt(sc.nextLine());
                if (input <= 0) {
                    throw new Exception();
                }
                return input;
            } catch (Exception e) {
                System.out.println(errMsg);
            }
        }
    }
    
    static int GetElement(String inputMsg, String errMsg) {
        int input;
        while (true) {
            try {
                System.out.print(inputMsg);
                input = Integer.parseInt(sc.nextLine());
                return input;
            } catch (Exception e) {
                System.out.println(errMsg);
            }
        }
    }
    
    static ArrayList<Integer> GetArray(int n, String inputMsg) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(inputMsg);
        for (int i = 0; i < n; i++) {
           int e = GetElement("arr["+ i +"] = ", "Element must be integer number!");
           list.add(e);
        }
        return list;
    }

    static int GetNumberOfElement(String inputMsg, String errMsg) {
        int input;
        while (true) {
            try {
                System.out.print(inputMsg);
                input = Integer.parseInt(sc.nextLine());
                if (input <= 0) {
                    throw new Exception();
                }
                return input;
            } catch (Exception e) {
                System.out.println(errMsg);
            }
        }
    }


}
