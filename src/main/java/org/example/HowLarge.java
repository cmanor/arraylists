package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class HowLarge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String listEntry = "place holder";
        ArrayList<String> list = new ArrayList<>();
        while (!listEntry.equals("")){
            listEntry = scanner.nextLine();
            if (listEntry.equals(""))
                break;
            else
                list.add(listEntry);
        }
        System.out.print("The total amount of item in the list was: ");
        System.out.println(list.size());
    }
}
