package code.challenge.solutions.tests;

import static org.junit.Assert.*;
import org.junit.Test;

import code.challenge.solutions.FirstNonRepeatingCharacter;

public class FirstNonRepeatingCharacterTests {

	@Test
	public void testFirstNonRepeatingCharacterWithValidInput() {
		assertEquals('s', FirstNonRepeatingCharacter.findFirstNonRepeatingChar("basketball")); 
		assertEquals('t', FirstNonRepeatingCharacter.findFirstNonRepeatingChar("training")); 
		assertEquals('r', FirstNonRepeatingCharacter.findFirstNonRepeatingChar("immersive")); 
		assertEquals(' ', FirstNonRepeatingCharacter.findFirstNonRepeatingChar("aabbccdd"));		
	}
	
	@Test
	public void testFirstNonRepeatingCharacterWithInValidInput() {
		assertEquals(' ', FirstNonRepeatingCharacter.findFirstNonRepeatingChar(" ")); 	
	}
}
