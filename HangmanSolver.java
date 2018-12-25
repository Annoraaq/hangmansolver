import java.util.*;

public class HangmanSolver {

  static Scanner sc = new Scanner(System.in);

  public static void main(String args[]) {
    String input;
    int guesses = 26;
    String toGuess = "etaoinshrdlcumwfgypbvkjxqz";
    boolean isGame = true;

    while (isGame) {
      input = sc.nextLine();
      if (!input.contains("_")) {
        // input = sc.nextLine();
      }
      System.out.println(""+toGuess.charAt(guesses-1));
      guesses--;
      if (guesses <= 0) {
        // input = sc.nextLine();
        guesses = 26;
      }
    }
  }

  private static boolean containsOnlyUnderscores(String input) {
    for (int i=0; i<input.length(); i++) {
      if (input.charAt(i) != '_') {
        return false;
      }
    }
    return true;
  }

}
