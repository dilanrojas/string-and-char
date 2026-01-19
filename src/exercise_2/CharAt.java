package exercise_2;

import utils.IOManager;

public class CharAt {
  public void charAt() {
    String input = IOManager.readString("\nType a word to get its first\nand last character ☟");

    IOManager.write(
        "\nFirst character: " + input.charAt(0) +
            "\nLast character: " + input.charAt(input.length() - 1));

    IOManager.enterToContinue();
  }
}
