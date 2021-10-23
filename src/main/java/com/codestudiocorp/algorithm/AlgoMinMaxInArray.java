package com.codestudiocorp.algorithm;

import java.util.Arrays;

public class AlgoMinMaxInArray {
	
	public static int getMinValue(int ints[]) {
		return (Arrays.stream(ints).count() > 0)? Arrays.stream(ints).min().getAsInt() : 0;		
	}
	
	public static int getMaxValue(int ints[]) {
		return (Arrays.stream(ints).count() > 0)? Arrays.stream(ints).max().getAsInt() : 0;		
	}
}
