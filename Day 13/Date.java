package practice_java;

public class Date {

	private int day;
	private String months;
	private int year; 
	
	public Date(int day,String months,int year)
	{
		this.day = day;
		this.months = months;
		this.year = year;
	}
	
	public String toString()
	{
		return day+"/"+months+"/"+year;
	}
	
	
	
}
