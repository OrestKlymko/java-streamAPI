package oddIndex;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class OddIndex {
	public String leaveOddIndexName(List<String> listName){
		AtomicInteger index= new AtomicInteger();
		Object[] result = listName.stream().map(name -> index.getAndIncrement() + ". " + name).toArray();

		return new StringTransformator().transformToStringForOdd(result);
	}

}
