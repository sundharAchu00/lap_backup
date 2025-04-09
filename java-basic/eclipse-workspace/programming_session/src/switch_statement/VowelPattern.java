package switch_statement;

import java.util.*;

public class VowelPattern {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter character");
		char ch = s.next().charAt(0);
		switch (ch) {
		case 'a': {
			System.out.println("it is a lowercase vowel " + ch);
			break;
		}
		case 'e': {
			System.out.println("it is a lowercase vowel " + ch);
			break;
		}
		case 'i': {
			System.out.println("it is a lowercase vowel " + ch);
			break;
		}
		case 'o': {
			System.out.println("it is a lowercase vowel " + ch);
			break;
		}
		case 'u': {
			System.out.println("it is a lowercase vowel " + ch);
			break;
		}
		case 'A': {
			System.out.println("it is a uppercase vowel " + ch);
			break;
		}
		case 'E': {
			System.out.println("it is a uppercase vowel " + ch);
			break;
		}
		case 'I': {
			System.out.println("it is a uppercase vowel " + ch);
			break;
		}
		case 'O': {
			System.out.println("it is a uppercase vowel " + ch);
			break;
		}
		case 'U': {
			System.out.println("it is a uppercase vowel " + ch);
			break;
		}
		default:{
			System.out.println("the given charcter is a consonant");
			break;}
		}

	}

}
