package oddIndex;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringToInt {
	public String toInt(List arrayList){
		return arrayList.stream()
				.map(i -> i.toString().replace("\"", ""))
				.mapToInt(i -> Integer.parseInt(String.valueOf(i)))
				.sorted()
				.mapToObj(String::valueOf)
				.collect(Collectors.joining(","));

	}
}
