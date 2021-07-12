package hashMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MorseCodeTranslator {

	public Map<String, Character> dictionary = new HashMap<String, Character>();

	public void mapPopulate() {
		dictionary.put(".-", 'A');
		dictionary.put("-...", 'B');
		dictionary.put("-.-.", 'C');
		dictionary.put("-..", 'D');
		dictionary.put(".", 'E');
		dictionary.put("..-.", 'F');
		dictionary.put("--.", 'G');
		dictionary.put("....", 'H');
		dictionary.put("..", 'I');
		dictionary.put(".---", 'J');
		dictionary.put("-.-", 'K');
		dictionary.put(".-..", 'L');
		dictionary.put("--", 'M');
		dictionary.put("-.", 'N');
		dictionary.put("---", 'O');
		dictionary.put(".--.", 'P');
		dictionary.put("--.-", 'Q');
		dictionary.put(".-.", 'R');
		dictionary.put("...", 'S');
		dictionary.put("-", 'T');
		dictionary.put("..-", 'U');
		dictionary.put("...-", 'V');
		dictionary.put(".--", 'W');
		dictionary.put("-..-", 'X');
		dictionary.put("-.--", 'Y');
		dictionary.put("--..", 'Z');
		dictionary.put("/", ' ');

	}

	public String translate(String toTranslate) {
		mapPopulate();
		String translated = "";
		String[] splitTranslation = toTranslate.split(" ");
		for (String Translation : splitTranslation) {
			translated += dictionary.get(Translation);
		}
		return translated;

	}

	public String convert(String toConvert) {
		mapPopulate();
		String convert = "";
		for (Character conversion : toConvert.toCharArray()) {
			for (Entry<String, Character> entry : dictionary.entrySet()) {
				if (entry.getValue() != conversion.charValue()) {
					continue;
				} else {
					convert += entry.getKey();
					convert += " ";
				}
			}
		}
		return convert.trim();
	}

}
