package laba;

import java.util.Scanner;

public class InputOutputConsole {

    public int inputNumberOfMenu(int minValue, int maxValue) {
        Scanner sc = new Scanner(System.in);
        int count;
        while (true) {
            try {
                count = Integer.parseInt(sc.nextLine());
                if (count >= minValue && count <= maxValue) {
                    break;
                } else {
                    throw new Exception(
                            "The input number must be between from" + minValue + "to" + maxValue + "!");
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        return count;
    }

    public void writeMenu() {
        System.out.println("1 - java.lang.OutOfMemoryError: Java heap space");
        System.out.println("2 - java.lang.OutOfMemoryError: Java heap space (no collections)");
        System.out.println("3 - java.lang.OutOfMemoryError: Metaspace");
        System.out.println("4 - java.lang.StackOverflowError (recursion)");
        System.out.println("5 - java.lang.StackOverflowError (no recursion)");
    }
}
