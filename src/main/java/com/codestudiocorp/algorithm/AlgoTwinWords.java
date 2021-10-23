package com.codestudiocorp.algorithm;

import java.util.HashMap;
import java.util.Set;

public final class AlgoTwinWords {
	
	//private constructor to keep class non-instantiable
	private AlgoTwinWords() {}
	
	public static boolean isEqualLength(String word1, String word2) {
    	return (word1.length() == word2.length());
    }
    
    public static HashMap<Character, Integer> getRepeatedLetters(String word) {
    	HashMap<Character, Integer> repeatedLetters = new HashMap<Character, Integer>();
    	
    	//String in char array
    	char[] tab = word.toCharArray();
    	
    	//Search in tab number of repeated letters
    	for(int i = 0; i < tab.length; i++) {
    		int count = 0;
    		
    		for(int searchLetter = 0 ; searchLetter < tab.length; searchLetter++) {
    			if(tab[i] == tab[searchLetter]) {
    				count++;
    				//System.out.println(tab[i] + " is present " + count + " time");
    				repeatedLetters.put(tab[i], count);
    			}
    		}
    	}
    	
    	return repeatedLetters;
	}
    
    public static boolean isAllLettersOfWord1PresentInWord2(HashMap<Character, Integer> word1Letters,
    		HashMap<Character, Integer> wordToCompareWithLetters) {
    	boolean res = false;
    	
    	/*Stock HashMap Character type part in a Set of Character.
    	Each keys represent a Character used atleast once in the word */
    	Set<Character> lettersOf1stWord = word1Letters.keySet();
    	Set<Character> lettersOf2ndWord = wordToCompareWithLetters.keySet();
    	
    	//Check the size of Keys of Both HashMap
    	if(lettersOf1stWord.size() == lettersOf2ndWord.size()) {
    		int totalCommonLetters = 0;
    		
    		for(char letter : lettersOf1stWord) {
        		System.out.println(letter + " " + word1Letters.get(letter));
        		
        		for(char letterToCompareWith : lettersOf2ndWord) {
        			//Find the match of current letter in lettersOf2ndWord
        			if(letterToCompareWith == letter) {
        				
        				//Count every matching values for each key between Both HashMap
        				if(word1Letters.get(letter) == wordToCompareWithLetters.get(letterToCompareWith)) {
        					System.out.println("Current Letter: <" + letter + "> " + word1Letters.get(letter) +
							" [=] <" + letterToCompareWith + ">" + wordToCompareWithLetters.get(letterToCompareWith));
        					
        					totalCommonLetters++;
        				}
        				break;
        			}
        		}
        	}
    		res = (totalCommonLetters == lettersOf1stWord.size());
    	}
    	
    	return res;
    }
    
    public static boolean isTwinWords(String word, String compareTo) {
    	boolean res = false;
        word = word.toUpperCase();
        compareTo = compareTo.toUpperCase();
        
        if(AlgoTwinWords.isEqualLength(word, compareTo)) {        	
        	res = AlgoTwinWords.isAllLettersOfWord1PresentInWord2(AlgoTwinWords.getRepeatedLetters(word),
        			AlgoTwinWords.getRepeatedLetters(compareTo));        	
        }
    	
    	return res;
    }
}
