package oddIndex;

import java.util.Iterator;
import java.util.stream.Stream;

public class MixOfStreams {

		public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
			Iterator<T> firstIterator = first.iterator();
			Iterator<T> secondIterator = second.iterator();

			Stream.Builder<T> resultBuilder = Stream.builder();
			while (firstIterator.hasNext() && secondIterator.hasNext()) {
				resultBuilder.accept(firstIterator.next());
				resultBuilder.accept(secondIterator.next());
			}

			return resultBuilder.build();
		}
}
