package oddIndex;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringToInt {
	public String sortNumbers(String[] array){
		return Arrays.stream(Arrays.stream(array)
				.map(i->i.replace("\"","")
						.replace(" ",""))
				.collect(Collectors.joining(","))
				.split(","))
				.mapToInt(Integer::parseInt)
				.sorted()
				.mapToObj(String::valueOf)
				.collect(Collectors.joining(","));


	}
}
