package oddIndex;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringToInt {
	public String sortNumbers(String[] array){
		return Arrays.stream(array)
				.map(i->i.replace("\"", ""))
				.mapToInt(i -> Integer.parseInt(i))
				.sorted()
				.mapToObj(i->String.valueOf(i))
				.collect(Collectors.joining(","));


	}
}
