import java.util.ArrayList;
public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(permsUnique("rro"));

	}
	public static ArrayList<String> perms(String word) {

		ArrayList<String> perms = new ArrayList<String>();
		permutationsHelper("", word, perms);
		if (word.equals("")){
			perms.add("");
			return perms;
		}
		return perms;
	}

	public static void permutationsHelper(String usedLetters, String unusedLetters, ArrayList<String> perms) {
		for(int i=0;i<unusedLetters.length();i++){
			String newused =usedLetters + unusedLetters.substring(i, i+1);
			String newunused = unusedLetters.substring(0, i)+ unusedLetters.substring(i+1, unusedLetters.length());
		
			if (newunused.length()== 0){
				perms.add(newused);
			}
			else{
				permutationsHelper(newused, newunused, perms);
			}
		}
	}
	public static ArrayList<String> permsUnique(String word) {

		ArrayList<String> perms = new ArrayList<String>();
		
		permsUniqueHelper("", word, perms);
		return perms;
	}

	public static void permsUniqueHelper(String usedLetters, String unusedLetters, ArrayList<String> perms) {
		for(int i=0;i<unusedLetters.length();i++){
			String newused =usedLetters + unusedLetters.substring(i, i+1);
			String newunused = unusedLetters.substring(0, i)+ unusedLetters.substring(i+1, unusedLetters.length());
		
			if (newunused.length()== 0){
				System.out.println("Here");
				if (!perms.contains(newused)){
					System.out.println("Here");
					perms.add(newused);
				}
				
			}
			else{
				permsUniqueHelper(newused, newunused, perms);
			}
		}
	}
	

}
