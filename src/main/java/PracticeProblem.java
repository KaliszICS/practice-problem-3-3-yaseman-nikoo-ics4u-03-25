import java.util.ArrayList;
public class PracticeProblem {

	public static void main(String args[]) {
		

	}
	public static ArrayList<String> perms(String word) {

		ArrayList<String> perms = new ArrayList<String>();
		permutationsHelper("", word, perms);
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
		permutationsHelper("", word, perms);
		return perms;
	}

	public static void permsUnitqueHelper(String usedLetters, String unusedLetters, ArrayList<String> perms) {
		for(int i=0;i<unusedLetters.length();i++){
			String newused =usedLetters + unusedLetters.substring(i, i+1);
			String newunused = unusedLetters.substring(0, i)+ unusedLetters.substring(i+1, unusedLetters.length());
		
			if (newunused.length()== 0){
				for(int j =0; j<perms.size();j++){
					if (!newused.equals(perms.get(i))){
						perms.add(newused);
					}
					
				}
				
			}
			else{
				permutationsHelper(newused, newunused, perms);
			}
		}
	}
	

}
