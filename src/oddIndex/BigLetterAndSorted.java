package oddIndex;

import java.util.List;

public class BigLetterAndSorted {
	public String makeBigLetterAndSorted(List<String>listName){

		Object[] result = listName.stream().map(String::toUpperCase).sorted((s, anotherString) -> anotherString.compareTo(s)).toArray();
		return new StringTransformator().transformToString(result);


	}
}
