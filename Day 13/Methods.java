package streams;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {

	
	public static void main(String[] args)
	{
		
		List<String> names = List.of("a","b","c","d","e","aa","ab");
		
		
		//filter
		
		List<String> newNames = names.stream().filter(e -> e.startsWith("a")).collect(Collectors.toList());
		names.stream().filter(e -> e.startsWith("a")).forEach(System.out :: print);
		System.out.print(newNames);
		
		
		
		//map
		
		List<Integer> number = List.of(11,20000,333,4,52);
		List<Integer> sq =  number.stream().map(i ->i*i).collect(Collectors.toList());
		System.out.println(sq);
		
		names.stream().forEach(e ->
		{
			System.out.println(e+ " hi");
		});
		
		
		//sort
		
		number.stream().sorted().forEach(System.out :: println);
		
		//min
		Integer min = number.stream().min((x,y)-> x.compareTo(y)).get();
		System.out.println(min);
		
		
		//max
		Integer max = number.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println(max);
		
		
		
	}
}
