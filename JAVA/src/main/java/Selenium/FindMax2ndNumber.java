package Selenium;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class FindMax2ndNumber {

	public static void main(String[] args) {
		
		
		int[]a= {1,5,4,8,3,9,7};
		
	Arrays.sort(a);
	System.out.println(a[a.length-2]);

	}

}
