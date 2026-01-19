package utils;

import java.util.Scanner;

public class IOManager {
  static Scanner sc = new Scanner(System.in);

  public static int readInt(String msg) {
    System.out.println(msg);
    String input = sc.nextLine();
    return Integer.parseInt(input);
  }

  public static String readString(String msg) {
    System.out.println(msg);
    String input = sc.nextLine();
    return input;
  }

  public static void write(String msg) {
    System.out.println(msg);
  }

  public static void enterToContinue() {
    System.out.println("\nPress enter to continue...");
    sc.nextLine();
  }

}
