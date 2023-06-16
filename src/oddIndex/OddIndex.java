package oddIndex;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddIndex {
	public String leaveOddIndexName(List<String> listName){
	return 	IntStream.range(0,listName.size()).filter(i->i%2!=0).mapToObj(i->i+". "+listName.get(i)).collect(Collectors.joining(", "));

	}

}
