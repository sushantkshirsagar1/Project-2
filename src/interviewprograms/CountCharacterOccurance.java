package interviewprograms;

public class CountCharacterOccurance {
	
	//imp interview program to count how many times a character is repeating or its occurance.

	public static void main(String[] args) {
		
		String s = "sncblldbcabhbbkbakbkaaaxbcbeurttyrffghdcnvdda";
		
		int totalcount = s.length();
		System.out.println(totalcount);
		
		int totalcountafterremoving_a = s.replace("a", "").length();
		System.out.println(totalcountafterremoving_a);
		
		int count = totalcount-totalcountafterremoving_a;
		System.out.println(count);
	}
}
