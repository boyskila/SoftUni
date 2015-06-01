import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CognateWords {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] words = sc.nextLine().split("[^a-zA-Z]+");

		String word = null;

		List<String> list = new ArrayList<String>();
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words.length; j++) {
				for (int k = 0; k < words.length; k++) {

					if (i != j) {

						if ((words[i] + words[j]).equals(words[k])
								&& !list.contains(words[i] + "|" + words[j]
										+ "=" + words[k])) {

							list.add(word);
							System.out.println(words[i] + "|" + words[j] + "=" + words[k]);
						}

					}

				}
			}
		}

		if (list.isEmpty()) {
			System.out.println("No");
		}
	}
}
