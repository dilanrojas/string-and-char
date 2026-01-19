package exercise_8;

import utils.IOManager;

public class PasswordValidation {
  public void validatePassword() {
    final int MIN_LENGTH = 8;

    String password = IOManager.readString("\nType your password ☟");

    if (password.length() < MIN_LENGTH) {
      IOManager.write("\nPassword must be 8 characters or longer");
      IOManager.enterToContinue();
      return;
    }

    boolean hasCapitalLetter = false;

    for (char c : password.toCharArray()) {
      if (Character.isUpperCase(c)) {
        hasCapitalLetter = true;
        break;
      }
    }

    if (hasCapitalLetter) {
      IOManager.write("\nPassword meets the requirements");
    } else {
      IOManager.write("\nPassword must contain at least\n1 capital letter");
    }

    IOManager.enterToContinue();
  }
}
