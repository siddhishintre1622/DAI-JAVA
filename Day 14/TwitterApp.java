package twitter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwitterApp {

	public List<Tweet> initializedTweet()
	{
		List<Tweet> tweetList = new ArrayList();
		
		tweetList.add(new Tweet(1,"a",100,LocalDate.of(2024, 10, 8),new HashSet(Set.of("#a","#aa"))));
		tweetList.add(new Tweet(2,"b",200,LocalDate.of(2024, 10, 7),new HashSet(Set.of("#b","#bb"))));
		tweetList.add(new Tweet(3,"c",300,LocalDate.of(2024, 10, 6),new HashSet(Set.of("#c","#cc"))));
		tweetList.add(new Tweet(4,"d",400,LocalDate.of(2024, 10, 5),new HashSet(Set.of("#d","#dd"))));
		tweetList.add(new Tweet(5,"e",500,LocalDate.of(2024, 10, 4),new HashSet(Set.of("#e","#ee"))));
		
		return tweetList;	
		
			
	}
	
	public static void main(String[] args)
	{
		TwitterApp twitterApp = new TwitterApp();
        List<Tweet> tweetList = twitterApp.initializedTweet();

        System.out.println("___________________________________________________________");
        Stream<Tweet> tweetStream = tweetList.stream();
        tweetStream.filter((tweet) -> (tweet.getDateOfPost().getMonthValue()) == (LocalDate.now().getMonthValue())).forEach(System.out::println);

        System.out.println("___________________________________________________________");
        tweetStream = tweetList.stream();
        tweetStream.filter((tweet) -> tweet.getHashtags().contains("#aa")).forEach(System.out::println);

        System.out.println("___________________________________________________________");
        tweetStream = tweetList.stream();
        Map<String,List<Tweet>> countTweetBySub = tweetStream.collect(Collectors.groupingBy(Tweet::getSub));
        countTweetBySub.forEach((key, value) -> System.out.println(key + " : " + value.size()));

        System.out.println("___________________________________________________________");
        tweetStream = tweetList.stream();
        tweetStream.filter((tweet) -> (tweet.getViews() > 10000)).forEach(System.out::println);

        System.out.println("___________________________________________________________");
        tweetStream = tweetList.stream();
        tweetStream.sorted(Comparator.comparing(Tweet::getViews).reversed()).limit(5).forEach(System.out::println);
    }
	}
	
	
