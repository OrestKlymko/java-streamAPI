package oddIndex;

import java.util.List;
import java.util.stream.Collectors;

public class BigLetterAndSorted {
	public String makeBigLetterAndSorted(List<String>listName){
		return listName.stream().map(String::toUpperCase).sorted((s, anotherString) -> anotherString.compareTo(s)).collect(Collectors.joining(", "));
	}
}
