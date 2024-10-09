package twitter;



import java.time.LocalDate;
import java.util.HashSet;

public class Tweet {
	
	private int id;
	private String sub;
	private int views;
	private LocalDate dateOfPost;
	HashSet<String> hashtags;
	
	
	
	
	public Tweet(int id, String sub, int views, LocalDate dateOfPost, HashSet<String> hashtags) {
		super();
		this.id = id;
		this.sub = sub;
		this.views = views;
		this.dateOfPost = dateOfPost;
		this.hashtags = hashtags;
	}


	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public LocalDate getDateOfPost() {
		return dateOfPost;
	}
	public void setDateOfPost(LocalDate dateOfPost) {
		this.dateOfPost = dateOfPost;
	}
	public HashSet<String> getHashtags() {
		return hashtags;
	}
	public void setHashtags(HashSet<String> hashtags) {
		this.hashtags = hashtags;
	}


	@Override
	public String toString() {
		return "Tweet [id=" + id + ", sub=" + sub + ", views=" + views + ", dateOfPost=" + dateOfPost + ", hashtags="
				+ hashtags + "]";
	}
	

}
