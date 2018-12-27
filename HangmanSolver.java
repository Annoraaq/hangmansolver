import java.util.*;

public class HangmanSolver {

  static Scanner sc = new Scanner(System.in);

  public static void main(String args[]) {
    int guessesLeft = 6;
    int letter = 0;
    // String toGuess = "etaoinshrdlcumwfgypbvkjxqz";
    String toGuess ="eaitrnoslcudpmyhgfbvwkxqjz";
    String lastRound = sc.nextLine();

    while (true) {
      System.out.println(""+toGuess.charAt(letter));
      letter++;

      if (letter >= 25) {
        letter = 0;
      }

      String input = sc.nextLine();
      if (lastRound.equals(input)) {
        guessesLeft--;
      }
      if (guessesLeft < 1 || !input.contains("_")) {
        guessesLeft = 6;
        letter = 0;
        input = sc.nextLine();
      }
      lastRound = input;
    }
  }

}
