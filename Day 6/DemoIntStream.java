package day6;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DemoIntStream {
	
	public static void main (String[]args) {
		int [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
		IntStream stream = Arrays.stream(nums);
		
		System.out.println(stream.count());
		stream = Arrays.stream(nums);
		System.out.println(stream.distinct().sorted().count());
		
		stream = Arrays.stream(nums);
// stream.discount().sorted.forEach((n) -> System.out.println(n));
		
		stream.distinct().sorted().forEach(System.out::println);
		
		stream = Arrays.stream(nums);
		List<Integer> squares = stream.map((n) -> n*n).boxed().collect(Collectors.toList());
		System.out.println(squares);
		
		stream = Arrays.stream(nums);
		List<Integer> even = stream.filter((n) -> n%2==0).boxed().collect(Collectors.toList());
		System.out.println(even);
	}
	

}
