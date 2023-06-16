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
//		System.out.println(task1);
//		//Task 2
		String task2 = new BigLetterAndSorted().makeBigLetterAndSorted(listName);
//		System.out.println(task2);
//	//Task 3

		String[] arrayString = new String[]{"1 ,2,0", "4, 5"};
		String task3  = new StringToInt().sortNumbers(arrayString);
		System.out.println("task3 = " + task3);
//	//Task 4
//		new GeneratorRandom().generate(25_214_903_917L,11,48).forEach(System.out::println);
//	//Task 5
//		Stream<Integer> firstStream = Stream.of(1, 2, 3, 4, 5);
//		Stream<Integer> secondStream = Stream.of(6, 7, 8);
//
//		Stream<Integer> resultStream = MixOfStreams.zip(firstStream, secondStream);
//		resultStream.forEach(System.out::println);


	}

	}
