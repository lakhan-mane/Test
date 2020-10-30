import java.util.*;

class TestDate{
	
	private int day,month,year;
	
	public TestDate(){
	
		day = 20;
		month = 10;
		year=2020;
	
	}
	
	public TestDate(int d, int m, int y){
		this.setDay(d);
		this.setMonth(m);
		this.setYear(y);
	}
	
	
	
	
	public int getDay(){
		return day;
	}
	public int getMonth(){
		return month;
	}
	public int getYear(){
		return year;
	}
	
	public void setDay(int day){
		this.day= day;
	}
	
	public void setMonth(int month){
		this.month= month;
	}
	
	public void setYear(int year){
		this.year=year;
	}
	
	
	
	
	public void show(TestDate t){
		System.out.println(t.getDay()+"/"+t.getMonth()+"/"+t.getYear());
	}
	
// 	public void accept(TestDate t){
// 		Scanner sc = new Scanner(System.in);
// 		int a=0;
// 		System.out.println("Enter day");
// 		a= sc.nextInt();
// 		t.setDay(a);
// 		System.out.println("Enter month");
// 		a= sc.nextInt();
// 		t.setMonth(a);
// 		System.out.println("Enter Year");
// 		a= sc.nextInt();
// 		t.setYear(a);
// 		//System.out.println("New Date");
// 	}
	
	public static void check(){
		System.out.println("This is static method");
	}
	
	public static void main(String x[]){
		TestDate t = new TestDate();
		System.out.println("Default Constructor Date");
		t.show(t);
		System.out.println("\n");
		
		TestDate t1 = new TestDate(05,10,2020);
		System.out.println("Parameterized Constructor Date");
		t.show(t1);
		System.out.println("\n");
		
// 		t.accept(t);
// 		System.out.println("\n");
		
// 		System.out.println("Date given by user");
// 		t.show(t);
		System.out.println("\n");
		TestDate.check();
	}
	
	
}
