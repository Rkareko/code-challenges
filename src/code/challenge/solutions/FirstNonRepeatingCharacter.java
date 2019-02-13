package code.challenge.solutions;

import java.util.HashMap;

/**
 * Program to find the first non-repeating character in a string
 *
 * @author Richard Kareko
 */
public class FirstNonRepeatingCharacter {
	
	public static char findFirstNonRepeatingChar(String inputString) {
		HashMap<Character, Integer> charCountMap = new HashMap<>();
		char fisrtNonRepeatingChar = ' ';
		
		// check for invalid input
		if (inputString == null || inputString.trim().isEmpty()) {
			return fisrtNonRepeatingChar;
		}
		
		//populate the map containing the count for each character
		charCountMap = getCharCountMap(inputString);
		
		// Pass through the string to get the first non repeating char		
		return getFirstNonRepeatingChar(charCountMap, inputString);
		
	}
	
	/**
	 * This method populates a HasMap with the count for each character 
	 * in the input string.
	 *
	 * @param inputString The string from which the character count map is build.
	 * 
	 * @result charCountMap HashMap containing the count for each character in the input string.
	 */
	private static HashMap<Character, Integer> getCharCountMap(String inputString) {
		HashMap<Character, Integer> charCountMap = new HashMap<>();
		
		for (int i = 0; i < inputString.length(); i++) {
			char character = inputString.charAt(i);
			if (charCountMap.containsKey(character)) {
				charCountMap.put(character, charCountMap.get(character) + 1);
			} else {
				charCountMap.put(character, 1);
			}			
		}
		
		return charCountMap;
	}
	
	/**
	 * This method determines the first non repeating character in a given string
	 * from the map containing the count of each character in that string.
	 *
	 * @param inputString The string from which the first non repeating character is determined.
	 * 
	 * @param charCountMap HashMap containing the count for each character in the input string.
	 * 
	 * @result fisrtNonRepeatingChar The first non repeating character in the input string
	 */
	private static char getFirstNonRepeatingChar(HashMap<Character, Integer> charCountMap, String inputString) {
		char fisrtNonRepeatingChar = ' ';
		for (int j = 0; j < inputString.length(); j++) {
			char character = inputString.charAt(j);
			if (charCountMap.get(character) == 1) {
				fisrtNonRepeatingChar =  character;
				break;
			}
		}
		return fisrtNonRepeatingChar;
	}

}

