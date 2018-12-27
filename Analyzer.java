import java.util.*;

public class Analyzer {

  static Scanner sc = new Scanner(System.in);

  public static void main(String args[]) {
    List<Set<Character>> freqs = new ArrayList<>();

    while (sc.hasNext()) {
      String input = sc.nextLine();
      Set<Character> freq = new HashSet<>();
      freqs.add(freq);
      for (int i=0; i<input.length(); i++) {
        char c = input.charAt(i);
        freq.add(c);
      }
    }

    Map<Character, Integer> sum = new TreeMap<>();
    for (Set<Character> freq : freqs) {
      for (Character c : freq) {
        if (sum.containsKey(c)) {
          sum.put(c, sum.get(c)+1);
        } else {
          sum.put(c, 1);
        }
      }
    }

    for (char c='a'; c<='z'; c++) {
      if (!sum.containsKey(c)) {
        System.out.println(c + ": 0");
      } else {
        System.out.println(c + ": " + sum.get(c));
      }
    }

  }

}
