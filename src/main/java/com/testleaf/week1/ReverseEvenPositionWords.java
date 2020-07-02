package com.testleaf.week1;

public class ReverseEvenPositionWords {

	public static void main(String[] args) {
		String input = "When the world realise its own mistake, corona will dissolve automatically";
		String output = "";
		String[] eachWords = input.split(" ");
		for (int i=1; i<eachWords.length; i=i+2) {
			StringBuilder sb = new StringBuilder(eachWords[i]);
			sb.reverse();
			output = output+" "+eachWords[i-1]+" "+sb;
		}
		if ((eachWords.length%2)!=0) {
			output = output+" "+eachWords[eachWords.length-1];
		}
		System.out.println(output.trim());
	}

}
