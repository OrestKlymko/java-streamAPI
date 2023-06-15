import oddIndex.*;


import java.math.BigInteger;
import java.sql.Array;
import java.util.*;

import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
	public static void main(String[] args) {


		List<String> listName = new ArrayList<>();
		listName.add("Ivan");
		listName.add("Petro");
		listName.add("Vasyl");
		listName.add("Danilo");

		List<String> listName2 = new ArrayList<>();
		listName.add("Ihor");
		listName.add("Orest");

		//Task 1
		String task1 = new OddIndex().leaveOddIndexName(listName);
		//Task 2
		String task2 = new BigLetterAndSorted().makeBigLetterAndSorted(listName);

	//Task 3
		ArrayList arrayList = new ArrayList<>();
		arrayList.add("\"1");
		arrayList.add(2);
		arrayList.add("0\"");
		arrayList.add("\"4");
		arrayList.add("5\"");

		int[] array = arrayList.stream().map(i -> i.toString().replace("\"", "")).mapToInt(i -> Integer.parseInt(String.valueOf(i))).sorted().toArray();
		System.out.println(new StringTransformator().transformToString(array));
	//Task 4
		new GeneratorRandom().generate(25_214_903_917L,11,48).forEach(System.out::println);
	//Task 5
		Stream<Integer> firstStream = Stream.of(1, 2, 3, 4, 5);
		Stream<Integer> secondStream = Stream.of(6, 7, 8);

		Stream<Integer> resultStream = new MixOfStreams().zip(firstStream, secondStream);
		resultStream.forEach(System.out::println);
	}

	}
