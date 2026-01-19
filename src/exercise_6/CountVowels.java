package exercise_6;

import utils.IOManager;

public class CountVowels {
  public void countVowels() {
    String vowels = "aeiou";
    String input = (IOManager.readString("\nType a string to count\nhow many vowels it has ☟")).toLowerCase();
    int vowelsInInput = 0;

    for (int i = 0; i < input.length(); i++) {
      if (vowels.indexOf(input.charAt(i)) != -1) {
        vowelsInInput++;
      }
    }

    IOManager.write("\nYour string contains " + vowelsInInput + " vowels");
    IOManager.enterToContinue();
  }
}
