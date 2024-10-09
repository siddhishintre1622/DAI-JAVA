package streams;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {

	
	public static void main(String[] args)
	{
		List<Integer> list1 = new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
		System.out.println(list1);
		
		
		//Using collection
		List<Integer> even = new ArrayList();
		for(Integer i : list1)
		{
			if(i%2==0)
			{
				even.add(i);
			}
		}
		
		System.out.println(even);
		
		//using stream
		Stream<Integer> stream = list1.stream();
		List<Integer> newList = stream.filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println(newList);
		
		
		list1.stream().filter(i-> i%2==0).collect(Collectors.toList()).forEach(System.out::println);
		list1.stream().filter(i -> i>3).collect(Collectors.toList()).forEach(System.out::println);
		
		
		
		
		
		
		
		
	}
}
