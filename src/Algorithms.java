import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for(int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}

	public static int countPearls(List<Boolean> oysters) {
		int count = 0;
		for(int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i) == true)
				count++;
		}
		return count;
	}

	public static double findTallest(List<Double> peeps) {
		double tallest = 0;
		for(int i = 0; i < peeps.size(); i++)
			if(peeps.get(i) > tallest)
				tallest = peeps.get(i);
		return tallest;
	}

	public static String findLongestWord(List<String> words) {
		String longest = "";
		for(int i = 0; i < words.size(); i++) {
			if(words.get(i).length() > longest.length())
				longest = words.get(i);
		}
		return longest;
	}

	public static Boolean containsSOS(List<String> message) {
		boolean sos = false;
		for(int i = 0; i < message.size(); i++)
			if(message.get(i).contains(" ... --- ... "))
				sos = true;
		return sos;
	}

	public static List<Double> sortScores(List<Double> results) {
		Double temp = 0.0;
		for(int i = 0; i < results.size(); i++)
			for(int j = i+1; j < results.size(); j++)
				if(results.get(i) > results.get(j)) {
					temp = results.get(j);
					results.set(j, results.get(i));
					results.set(i, temp);
				}
		return results;
	}

	public static List<String> sortDNA(List<String> unsortedSequences) {
		String temp = "";
		for(int i = 0; i < unsortedSequences.size(); i++)
			for(int j = i+1; j < unsortedSequences.size(); j++)
				if(unsortedSequences.get(i).length() > unsortedSequences.get(j).length()) {
					temp = unsortedSequences.get(j);
					unsortedSequences.set(j, unsortedSequences.get(i));
					unsortedSequences.set(i, temp);
				}
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		String temp = "";
		for(int i = 0; i < words.size(); i++)
			for(int j = i+1; j < words.size(); j++)
				if(words.get(i).compareTo(words.get(j)) > 0) {
					temp = words.get(j);
					words.set(j, words.get(i));
					words.set(i, temp);
				}
		return words;
	}
}
