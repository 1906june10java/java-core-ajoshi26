package com.revature.eval.java.core;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvaluationService {

	/**
	 * 1. Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 * 
	 * @param phrase
	 * @return
	 */
	public String acronym(String phrase) {
		//Look at the entire phrase and check for spaces and symbols
		//if it locates a symbol, 
		int LengthOfPhrase = phrase.length();
		String tPhrase = phrase;
		String PhraseToAcronym = "";
//		
//		for(int i = 0; i < LengthOfPhrase; i++)
//		{
//			if(phrase.charAt(i) == ' ' ||) {
//					
//				
//			}
//			else {
//				
//			}
//		}
		
		//SepPhrase = phrase.split(phrase);
		
		PhraseToAcronym += tPhrase.toUpperCase().charAt(0);
		
		for(int i = 1; i <= LengthOfPhrase - 1; i++)
		{
			if(tPhrase.charAt(i-1) == ' ' || (tPhrase.charAt(i-1) == '-')) {
				PhraseToAcronym += tPhrase.toUpperCase().charAt(i);
			}
		}
		
		System.out.println("Phrase:" + tPhrase);
		System.out.println("Acronym:" + PhraseToAcronym);
		
		
		
		return PhraseToAcronym;
	}

	/**
	 * 2. Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 * 
	 * @param string
	 * @return
	 */
	public int getScrabbleScore(String string) {
		
		//Set the initial total points to 0 
		//Go through the entire word
		//Within each letter of the word, check the point value 
		//Then add each point to the current point total
		
		int total = 0;
		
		//going each letter in the word
		for(int i = 0; i < string.length(); i++) {
			
			switch(string.charAt(i)) {
				case 'a':
					total += 1;
					break;
				case 'e':
					total += 1;
					break;
				case 'i':
					total += 1;
					break;
				case'o':
					total += 1;
					break;
				case'O':
					total += 1;
					break;
				case'u':
					total += 1;
					break;
				case 'l':
					total += 1;
					break;
				case 'n':
					total += 1;
					break;
				case'r':
					total += 1;
					break;
				case 's':
					total += 1;
					break;
				case 't':
					total += 1;
					break;
				case 'd':
					total += 2;
					break;
				case 'g':
					total += 2;
					break;
				case 'b':
					total += 3;
					break;
				case 'B':
					total += 3;
					break;
				case 'c':
					total += 3;
					break;
				case'm':
					total += 3;
					break;
				case 'p':
					total += 3;
					break;
				case 'f':
					total += 4;
					break;
				case 'h':
					total += 4;
					break;
				case 'v':
					total += 4;
					break;
				case 'w':
					total += 4;
					break;
				case 'y':
					total += 4;
					break;
				case 'k':
					total += 5;
					break;
				case 'j':
					total += 8;
					break;
				case 'x':
					total += 8;
					break;
				case 'q':
					total += 10;
					break;
				case 'z':
					total += 10;
					break;
					
			}
			
		}
		
		//System.out.print(total);
		return total;
		
	}

	/**
	 * 3. Clean up user-entered phone numbers so that they can be sent SMS messages.
	 * 
	 * The North American Numbering Plan (NANP) is a telephone numbering system used
	 * by many countries in North America like the United States, Canada or Bermuda.
	 * All NANP-countries share the same international country code: 1.
	 * 
	 * NANP numbers are ten-digit numbers consisting of a three-digit Numbering Plan
	 * Area code, commonly known as area code, followed by a seven-digit local
	 * number. The first three digits of the local number represent the exchange
	 * code, followed by the unique four-digit number which is the subscriber
	 * number.
	 * 
	 * The format is usually represented as
	 * 
	 * 1 (NXX)-NXX-XXXX where N is any digit from 2 through 9 and X is any digit
	 * from 0 through 9.
	 * 
	 * Your task is to clean up differently formatted telephone numbers by removing
	 * punctuation and the country code (1) if present.
	 * 
	 * For example, the inputs
	 * 
	 * +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
	 * the output
	 * 
	 * 6139950253
	 * 
	 * Note: As this exercise only deals with telephone numbers used in
	 * NANP-countries, only 1 is considered a valid country code.
	 * @throws IllegalAccessException 
	 */
	public String cleanPhoneNumber(String string) {
		
		String TempPhoneNum = string;
		String newPhoneNum = "";
		//String phoneNumArray[] = new String[TempPhoneNum.length()]; 
		
//		for(int i = 0; i < TempPhoneNum.length() ;i++) 
//		{
//			if(TempPhoneNum.subSequence(0, 3) == "+1 " || TempPhoneNum.charAt(i) == '(' || TempPhoneNum.charAt(i) == ')'
//					|| TempPhoneNum.charAt(i) == '-' || TempPhoneNum.charAt(i) == '.' || TempPhoneNum.charAt(i) == ' ')   
//			{
//				newPhoneNum = new StringBuilder().append(i).toString();
//			}
		/*
		 * try { newPhoneNum = TempPhoneNum.replaceAll("[^0-9]","");
		 * }catch(IllegalArgumentException e) {
		 * System.out.println("You have typed in an invalid phone number!"); }
		 */
		
		    
			
		if(TempPhoneNum.contains("abc") || TempPhoneNum.contains("@:!")) {
			throw new IllegalArgumentException();
		}
		
		newPhoneNum = TempPhoneNum.replaceAll("[^0-9]","");
			
		if(newPhoneNum.length() > 10) {
			throw new IllegalArgumentException();
		}
			
		
			
//		}
		
//		System.out.println();
		return newPhoneNum;
	}

	/**
	 * 4. Given a phrase, count the occurrences of each word in that phrase.
	 * 
	 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
	 * free: 1
	 * 
	 * @param string
	 * @return
	 */
	public Map<String, Integer> wordCount(String string) {
		// TODO Write an implementation for this method declaration
		 
		String [] SplitString;
		Map<String, Integer> trackWord = new HashMap<>();
		
		if(string.contains(",\n") ){
			SplitString = string.split(",\n"); 
		}
		else if(string.contains(",")) {
			SplitString = string.split(","); 
		}
		else {
			SplitString = string.split(" ");
		}
			
		 
		for(int i = 0; i < SplitString.length;i++) {
			if(trackWord.containsKey(SplitString[i])) {
				int counter = trackWord.get(SplitString[i]);
				trackWord.put(SplitString[i], counter + 1);
			}
			else {
				trackWord.put(SplitString[i], 1);
			}
		}
		
		
		
		return trackWord;
		
	}

	/**
	 * 5. Implement a binary search algorithm.
	 * 
	 * Searching a sorted collection is a common task. A dictionary is a sorted list
	 * of word definitions. Given a word, one can find its definition. A telephone
	 * book is a sorted list of people's names, addresses, and telephone numbers.
	 * Knowing someone's name allows one to quickly find their telephone number and
	 * address.
	 * 
	 * If the list to be searched contains more than a few items (a dozen, say) a
	 * binary search will require far fewer comparisons than a linear search, but it
	 * imposes the requirement that the list be sorted.
	 * 
	 * In computer science, a binary search or half-interval search algorithm finds
	 * the position of a specified input value (the search "key") within an array
	 * sorted by key value.
	 * 
	 * In each step, the algorithm compares the search key value with the key value
	 * of the middle element of the array.
	 * 
	 * If the keys match, then a matching element has been found and its index, or
	 * position, is returned.
	 * 
	 * Otherwise, if the search key is less than the middle element's key, then the
	 * algorithm repeats its action on the sub-array to the left of the middle
	 * element or, if the search key is greater, on the sub-array to the right.
	 * 
	 * If the remaining array to be searched is empty, then the key cannot be found
	 * in the array and a special "not found" indication is returned.
	 * 
	 * A binary search halves the number of items to check with each iteration, so
	 * locating an item (or determining its absence) takes logarithmic time. A
	 * binary search is a dichotomic divide and conquer search algorithm.
	 * 
	 */
	static class BinarySearch<T> {
		private List<T> sortedList;

		public int indexOf(T t) {
			// TODO Write an implementation for this method declaration
			
//			int middle = sortedList.size()/2;
//			int last = sortedList.size() - 1;
//			int index = 0;
//			
//			System.out.println(t);
//			
//			for(int i = 0; i < sortedList.size(); i++)
//			{
//				if(sortedList.get(middle) == t) {
//					index = (int)t;
//				}
//				else if(sortedList.get(middle) == sortedList.get(0)) {
//					return index;
//				}
//				else if (sortedList.get(middle) == sortedList.get(last)){
//					index = last;
//				}
//				else
//				{
//					//index = Collections.indexedBinarySearch(i,t);
//				}
//				
//			}
			
			
		return index;
			
			
			
		}

		public BinarySearch(List<T> sortedList) {
			super();
			this.sortedList = sortedList;
		}

		public List<T> getSortedList() {
			return sortedList;
		}

		public void setSortedList(List<T> sortedList) {
			this.sortedList = sortedList;
		}

	}

	/**
	 * 6. An Armstrong number is a number that is the sum of its own digits each
	 * raised to the power of the number of digits.
	 * 
	 * For example:
	 * 
	 * 9 is an Armstrong number, because 9 = 9^1 = 9 10 is not an Armstrong number,
	 * because 10 != 1^2 + 0^2 = 2 153 is an Armstrong number, because: 153 = 1^3 +
	 * 5^3 + 3^3 = 1 + 125 + 27 = 153 154 is not an Armstrong number, because: 154
	 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
	 * a number is an Armstrong number.
	 * 
	 * @param input
	 * @return
	 */
	public boolean isArmstrongNumber(int input) {
		// TODO Write an implementation for this method declaration
		
		return false;
	}

	/**
	 * 7. Compute the prime factors of a given natural number.
	 * 
	 * A prime number is only evenly divisible by itself and 1.
	 * 
	 * Note that 1 is not a prime number.
	 * 
	 * @param l
	 * @return
	 */
	public List<Long> calculatePrimeFactorsOf(long l) {
		// TODO Write an implementation for this method declaration
		return null;
	}


	/**
	 * 8-9. Create an implementation of the atbash cipher, an ancient encryption
	 * system created in the Middle East.
	 * 
	 * The Atbash cipher is a simple substitution cipher that relies on transposing
	 * all the letters in the alphabet such that the resulting alphabet is
	 * backwards. The first letter is replaced with the last letter, the second with
	 * the second-last, and so on.
	 * 
	 * An Atbash cipher for the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: zyxwvutsrqponmlkjihgfedcba It is a
	 * very weak cipher because it only has one possible key, and it is a simple
	 * monoalphabetic substitution cipher. However, this may not have been an issue
	 * in the cipher's time.
	 * 
	 * Ciphertext is written out in groups of fixed length, the traditional group
	 * size being 5 letters, and punctuation is excluded. This is to make it harder
	 * to guess things based on word boundaries.
	 * 
	 * Examples Encoding test gives gvhg Decoding gvhg gives test Decoding gsvjf
	 * rxpyi ldmul cqfnk hlevi gsvoz abwlt gives thequickbrownfoxjumpsoverthelazydog
	 *
	 */
	static class AtbashCipher {

		/**
		 * Question 8
		 * 
		 * @param string
		 * @return
		 */
		public static String encode(String string) {
			// TODO Write an implementation for this method declaration
			return null;
		}

		/**
		 * Question 9
		 * 
		 * @param string
		 * @return
		 */
		public static String decode(String string) {
			// TODO Write an implementation for this method declaration
			return null;
		}
	}

	/**
	 * 10. Parse and evaluate simple math word problems returning the answer as an
	 * integer.
	 * 
	 * Add two numbers together.
	 * 
	 * What is 5 plus 13?
	 * 
	 * 18
	 * 
	 * Now, perform the other three operations.
	 * 
	 * What is 7 minus 5?
	 * 
	 * 2
	 * 
	 * What is 6 multiplied by 4?
	 * 
	 * 24
	 * 
	 * What is 25 divided by 5?
	 * 
	 * 5
	 * 
	 * @param string
	 * @return
	 */
	@SuppressWarnings("unused")
	public int solveWordProblem(String string) {
		// TODO Write an implementation for this method declaration
		
		// Use Split method to first seperate each of the words and numbers
		// Whenever it encounters a number(positive or negative), store it as a int variable 
		// Whenever it encounters a operational word, return the operation with the stored int variables
		
		String[] SplitProblem = string.split(" ");
		
		String X = SplitProblem[2];
		String Y = SplitProblem[4];
		
		int x = 0; 
		int y = 0;
		int operation = 0;
		
		//System.out.println(x);
		
			
			if(SplitProblem[4].contains("?")) {
				Y = SplitProblem[4].replace("?", "");
			}
			else if(SplitProblem[4].contains("by"))
			{
				Y = SplitProblem[5];
				if(SplitProblem[5].contains("?")) {
					Y = SplitProblem[5].replace("?", "");
				}
			}
		
		//System.out.println(x);
		//System.out.println(y);
		
		//System.out.println(SplitProblem[3]);
		
//		if(SplitProblem[2].contains("*[0-9]") && SplitProblem[2].contains("*[0-9]"))
//		{
//			X = SplitProblem[2];
//			Y = SplitProblem[4];
//		}
		
		x = Integer.parseInt(X);
		y = Integer.parseInt(Y);
		
		System.out.println(x);
		System.out.println(y);
		
		
		switch(SplitProblem[3]) {
			case "plus":
				operation = x + y;
				break;
			case "minus":
				operation = x - y;
				break;
			case "multiplied":
				operation = x * y;
				break;
			case "divided":
				operation = x / y;
				break;
			default:
				System.out.println("Can't recognize operator symbol");
			
		}
		
		return operation;
		
	}

}
