package oddIndex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class MixOfStreams {
	public <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
		Iterator<T> firstIterator = first.iterator();
		Iterator<T> secondIterator = second.iterator();

		Iterable<T> iterable = () -> new Iterator<T>() {
			private boolean isFirst = true;

			@Override
			public boolean hasNext() {
				return isFirst ? firstIterator.hasNext() : secondIterator.hasNext();
			}

			@Override
			public T next() {
				T element = isFirst ? firstIterator.next() : secondIterator.next();
				isFirst = !isFirst;
				return element;
			}
		};

		return StreamSupport.stream(iterable.spliterator(), false);
	}
}
