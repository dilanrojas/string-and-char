package exercise_1;

import utils.IOManager;

public class StringLength {
  public void stringLength() {
    String input = IOManager.readString("\nType a string to get its length ☟");

    IOManager.write(
      "\nThis string contains " +
      input.length() +
      " characters"
    );

    IOManager.enterToContinue();
  }
}
