package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String listEntry = "place holder";
        while(!listEntry.equals("")) {
            listEntry = scanner.nextLine();
            if (listEntry.equals(""))
                break;
            else
                list.add(listEntry);
        }
        System.out.print("The last item in the list is: ");
        System.out.println(list.get(list.size()-1));

    }
}
