package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stramobject {
	
	public static void main(String[] args)
	{
		//blank stream
		
		Stream<Object> emptyStream =  Stream.empty();
		emptyStream.forEach(i -> {System.out.println(i);
		});
		
		
		String names[] = {"a","b","c","d","e"};
		
		List<String> newlist = Arrays.asList(names);
		
		Stream<String> stream = newlist.stream();
		
		stream.forEach(i ->{System.out.print(i+" ");});
		
	}

}
