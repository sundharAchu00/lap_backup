package relavantzGrooming;

import java.util.Scanner;

public class Aarthi {
	public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
      System.out.println("Enter a sentence: ");
      String sentence = scanner.nextLine();
      
      String[] words = sentence.split(" ");
      
      for (String word : words) {
          if (isPalindrome(word)) {
              System.out.print("1 ");
          }
      }
  }


//---------------------------------

public static boolean isPalindrome(String word) {
    int left = 0;
    int right = word.length() - 1;
    
    while (left < right) {
        if (word.charAt(left) != word.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    
    return true;
}
}

