package pal;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import palindrom.Pal;


public class TestPal {
	@Test
	public void whenEmptyString_thenAccept() {
	    Pal palindromeTester = new Pal();
	    assertTrue(palindromeTester.isPalindrome(""));
	}
}
