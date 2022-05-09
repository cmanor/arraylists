package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int listItem = 1;
        while (!(listItem == 0)) {
            listItem = Integer.parseInt(scanner.nextLine());
            if (listItem == 0)
                break;
            else
                list.add(listItem);
        }
        System.out.println("Done entering integers into the list");
        System.out.println("What number are you looking for in the list?");
        String desiredIndex = scanner.nextLine();
        System.out.println(desiredIndex + "Is at index " + list.indexOf(Integer.valueOf(desiredIndex)));
    }
}
