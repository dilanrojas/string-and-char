package exercise_5;

import utils.IOManager;

public class SearchInString {
  public void searchInString() {
    IOManager.write("\nSee if a word is contained in a phrase");
    String phrase = IOManager.readString("\nType a phrase ☟");
    String word = IOManager.readString("\nType a word to search in the previous phrase ☟");

    if (phrase.toLowerCase().contains(word.toLowerCase())) {
      IOManager.write("\nTyped word is in the phrase");
    } else {
      IOManager.write("\nTyped word is not in the phrase");
    }

    IOManager.enterToContinue();
  }
}
