import exercise_1.StringLength;
import exercise_2.CharAt;
import exercise_3.StringComparison;
import exercise_4.CaseConversion;
import exercise_5.SearchInString;
import exercise_6.CountVowels;
import exercise_7.ReverseString;
import exercise_8.PasswordValidation;
import utils.*;

class Main {
  public static void main(String[] args) {
    StringLength exercise_1;
    CharAt exercise_2;
    StringComparison exercise_3;
    CaseConversion exercise_4;
    SearchInString exercise_5;
    CountVowels exercise_6;
    ReverseString exercise_7;
    PasswordValidation exercise_8;

    boolean showMenu = true;

    String menu = "\n1. String's length" +
        "\n2. Access to characters" +
        "\n3. String comparison" +
        "\n4. Case conversion" +
        "\n5. Search in string" +
        "\n6. Count vowels" +
        "\n7. Reverse string" +
        "\n8. Simple password validation" +
        "\n0. Exit";

    while (showMenu) {
      switch (IOManager.readInt(menu)) {
        case 1:
          exercise_1 = new StringLength();
          exercise_1.stringLength();
          break;

        case 2:
          exercise_2 = new CharAt();
          exercise_2.charAt();
          break;

        case 3:
          exercise_3 = new StringComparison();
          exercise_3.compareStrings();
          break;

        case 4:
          exercise_4 = new CaseConversion();
          exercise_4.caseConversion();
          break;

        case 5:
          exercise_5 = new SearchInString();
          exercise_5.searchInString();
          break;

        case 6:
          exercise_6 = new CountVowels();
          exercise_6.countVowels();
          break;

        case 7:
          exercise_7 = new ReverseString();
          exercise_7.reverseString();
          break;

        case 8:
          exercise_8 = new PasswordValidation();
          exercise_8.validatePassword();
          break;

        case 0:
          showMenu = false;
          break;

        default:
          IOManager.write("Invalid option");
          break;
      }
    }
  }
}
