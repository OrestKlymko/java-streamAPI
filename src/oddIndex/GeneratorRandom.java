package oddIndex;

import java.util.stream.Stream;

public class GeneratorRandom {
	public Stream<Long> generate(long a, int c,int m){
		double k = Math.pow(2,m);

		int index=0;
		return Stream.iterate(new long[]{0}, x -> new long[]{(long) ((a * x[index] + c) % k)}).map(n -> n[0]);
	}
}
