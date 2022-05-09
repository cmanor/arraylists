package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
           int listItem = Integer.parseInt(scanner.nextLine());
            if (listItem == 0)
                break;
            else
                list.add(listItem);
        }
        System.out.println("Done entering integers into the list");
        System.out.println("What number are you looking for in the list?");
        int desiredIndex = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == desiredIndex){
                System.out.println(desiredIndex + " is at index " + i);
        }
        }
    }
}
