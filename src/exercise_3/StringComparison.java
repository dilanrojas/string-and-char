package exercise_3;

import utils.IOManager;

public class StringComparison {
  public void compareStrings() {
    IOManager.write("\nLet's compare strings");
    if (IOManager.readString("\nFirst string ☟").equalsIgnoreCase(
        IOManager.readString("\nSecond string ☟"))
    ) {
      IOManager.write("\nStrings are the same");
    } else {
      IOManager.write("\nStrings are not the same");
    }

    IOManager.enterToContinue();
  }
}
