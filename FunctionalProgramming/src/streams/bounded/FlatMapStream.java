package streams.bounded;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapStream {

	public static void main(String [] args) {
		Stream<String> a = Stream.of("a","b");
		Stream<String> b = Stream.of("c","d");
		
		Stream<String> flatMap = Stream.of(a,b).flatMap( (n) -> n);
		flatMap.forEach(System.out :: println);
		
		Path path = Paths.get("C:\\Users\\soumi\\Documents\\GitHub\\functional-programming-with-java\\FunctionalProgramming\\src\\streams\\bounded\\test.txt");
		
		try(Stream<String> lines = Files.lines(path)){
			Stream<String> flatMap2 = lines.flatMap((line) -> Arrays.stream(line.split(",")));
			List<String> listChar = flatMap2.collect(Collectors.toList());
			//System.out.println(listChar);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		Map<Integer, String> map = Map.of(1, "one", 2, "two", 3, "Three");
		Map<Integer, String> map2 = Map.of(4, "FO", 5, "F", 6, "S");
		//Stream.of(Stream.of(map),Stream.of(map2)).flatMap((e) -> e)
		List<Integer> list = new ArrayList<Integer>();
		map.entrySet().stream().map((e) -> e.getKey()).forEach((e) -> list.add(e));
		
		List<Entry<Integer, String>> collect = Stream.of(map.entrySet().stream(),map2.entrySet().stream()).flatMap((e) -> e).collect(Collectors.toList());
		
		collect.forEach(System.out :: println);
		
		
		
	}
}
