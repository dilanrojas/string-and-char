package exercise_4;

import utils.IOManager;

public class CaseConversion {
  public void caseConversion() {
    String input = IOManager.readString("\nYour phrase to convert in upper\nand lower case ☟");

    IOManager.write("\nUpper case: " + input.toUpperCase());
    IOManager.write("Lower case: " + input.toLowerCase());

    IOManager.enterToContinue();
  }
}
