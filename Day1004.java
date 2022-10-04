package practice;

public class Day1004 {
	public static void main(String[] args) {
		//デバッグ検証用
//		Debug db=new Debug();
//		db.sub();
//		Main.me();
//		FieldAccess fa=new FieldAccess();
//		fa.main(args);
		
//		MethodAccess ma=new MethodAccess();
//		ma.main(args);
		

		
		
	}
}
class Debug{//デバッグ検証用
	public static void sub() {
		System.out.println("---1---");
		System.out.println("---2---");
		System.out.println("---3---");
		System.out.println("---4---");
		System.out.println("---5---");
		System.out.println("---6---");
		System.out.println("---7---");
		System.out.println("---8---");
		System.out.println("---9---");
	}
}
class Main{
	public static void me() {
//		Staff s1=new Staff();
//		System.out.println(s1.nibai(1));
//		System.out.println("足し算の結果："+s1.tasu(1, 2));
//		System.out.println("掛け算の結果："+s1.kakeru(1, 2));
		
//		int[] n= {17,30,8080};
//		for(int num:n) {
//			System.out.println(num);
//			System.out.println(s1.nibai(num));
//		}
//		Namae n1=new Namae();
//		n1.setSei("田中");
//		n1.setMei("太郎");
//		System.out.println(n1.getSei()+"\n"+n1.getMei());
		
//		Scanner sc1=new Scanner(System.in);
//		System.out.println("入力＞");
//		String t1=sc1.nextLine();
//		System.out.println("("+t1+")");
//		sc1.close();
		
		//Math.random()の戻り値は0<=ran<1だから0～2にするなら3倍して0<=ran<3の幅にする必要がある
//		double ran=Math.random();
//		int num=(int)(Math.random()*3)+1;
//		System.out.println(num);
		
//		char tmp='a';//charは''
//		String str="aaa";//Stringは""
		
//		System.out.print("5より大きいならH、5以下ならLを入力してください＞");
//		String in=new java.util.Scanner(System.in).nextLine();
//		char ch=in.charAt(0);
//		System.out.println("あなたの入力＞"+ch);
//		int ran=(int)(Math.random()*10)+1;
//		System.out.println("出た数字："+ran);
//		if((ran>5 && ch=='H') || (ran<=5 && ch=='L')) {
//			System.out.println("あたり！");
//		}else{
//			System.out.println("はずれっ！");
//			System.out.println("あははははは！！！");
//		}
	}
}
class Factorial{//https://ksuap.github.io/2016spring/basic/java.html#basic_form
	void run() {
		int number=10;
		int factorialValue=factorial(number);
		System.out.printf("%d! = %d%n", number,factorialValue);
	}
	int factorial(int number) {
		int result;
		if(number>0) {
			result=factorial(number--);
		}
		return result;
	}
}
class FieldAccess{
	String name;
	void run() {
		this.name="mizuki";
		System.out.println("---78---");
		System.out.println(this.name);
	}
	public static void main(String[] args) {
		FieldAccess app=new FieldAccess();
		app.run();
	}
}
class MethodAccess{
	void run() {
		greet("mizuki");
	}
	void greet(String name) {
		System.out.print("Hello");
		System.out.println(name);
	}
	public static void main(String[] ags) {
		MethodAccess app=new MethodAccess();
		app.run();
	}
}
class Namae{
	private String sei;
	private String mei;
	
	public void setSei(String sei) {
		this.sei=sei;
	}
	public void setMei(String mei) {
		this.mei=mei;
	}
	public String getSei() {
		return this.sei;
	}
	public String getMei() {
		return this.mei;
	}
	
}
class Staff{
	String name;
	int age;
	public void output() {
		System.out.println(this.name+"\n"+this.age);
	}
	public int nibai(int num) {
		return num*2;
	}
	public int tasu(int num1,int num2) {
		return num1+num2;
	}
	public int kakeru(int num1,int num2) {
		return num1*num2;
	}
}