package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String listEntry ="place holder";
        ArrayList<String> list = new ArrayList<>();
        while (!listEntry.equals("")) {
            listEntry = scanner.nextLine();
            list.add(listEntry);
        }
        System.out.print("The fifth item in the list is: ");
        System.out.println(list.get(4));
    }
}
