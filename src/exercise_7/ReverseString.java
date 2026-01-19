package exercise_7;

import utils.IOManager;

public class ReverseString {
  public void reverseString() {
    String input = IOManager.readString("\nType a string to reverse it ☟");
    String reversedInput = "";

    for (int i = input.length() - 1; i >= 0; i--) {
      reversedInput += input.charAt(i);
    }

    IOManager.write("\nReversed string: " + reversedInput);

    IOManager.enterToContinue();
  }
}
