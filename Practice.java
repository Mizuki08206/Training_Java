package practice;

import lib.Input;

public class Practice {

	public static void main(String[] args) {
		

		
//		Chara c1=new Chara();
//		c1.name="taro";
//		System.out.println("11"+c1.name);
//		Chara c2=new Chara();
//		System.out.println("13"+c2.name);
//		c2.name="jiro";
//		System.out.println("16"+c1.name);
//		System.out.println("17"+c2.name);
		
		
//		Chara c1=new Chara("たいすけ",100);
//		System.out.println(c1.getName());
//		System.out.println(c1);
//		System.out.println("------------------------");
//		String str1="こんにちは";
//		String str2="こんばんは";
//		str1=str2;
//		str1="おはようございます";//新しくstr1のインスタンスが生成されている？
//		System.out.println(str1);
//		System.out.println(str2);
		
		
//		Pra2_1 tmpr=new Pra2_1();
//		tmp.pra();
		
//		Pra2_2 tmp=new Pra2_2();
//		tmp.pra();
		
//		Pra2_3 tmp=new Pra2_3();
//		tmp.pra();
		
//		Pra2_4 tmp=new Pra2_4();
//		tmp.pra();
		
//		Pra2_5 tmp=new Pra2_5();
//		tmp.pra();
		
//		Pra2_6 tmp=new Pra2_6();
//		tmp.pra();
		
//		Rectangle re=new Rectangle(10,7);
//		System.out.println(re.getArea());
		
//		Order order=new Order("リンゴ",5);
//		order.show();
		
//		Cash obj=new Cash(10000);
//		System.out.println(obj.getBalance());
//		obj.deposit(3000);
//		System.out.println(obj.getBalance());
//		obj.drown(8000);
//		System.out.println(obj.getBalance());
//		obj.drown(12000);
//		System.out.println(obj.getBalance());
		
		
		
		
	}
	
}
class Chara{
	private String name;
	private int hp;
	public Chara(String nam,int h) {
		this.name=nam;
		this.hp=h;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return "名前:"+this.name+"HP:"+this.hp;
	}
}


//デジタルテキスト第二回練習問題
class Pra2_1{
	public void pra() {
		int sum=0;
		for(int i=1;i<101;i++) {
			sum+=i;
		}
		System.out.println("合計は"+sum);
	}
}
class Pra2_2{
	public void pra() {
		for(int i=0;i<101;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}
}
class Pra2_3{
	public void pra() {
		int[] array=new int[5];
		for(int i=0;i<5;i++) {
			array[i]=Input.getInt();
		}
		for(int i=0;i<5;i++) {
			System.out.println(array[i]*2);
		}
	}
}
class Pra2_4{
	public void pra() {
		int sum=0;
		int[] a= {1,2,4,8,16,32};
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println("合計は"+sum);
	}
}
class Pra2_5{
	public void pra() {
		for(int i=1;i<10;i++) {
			for(int l=1;l<10;l++) {
				System.out.printf("\t%2d",i*l);
			}
			System.out.println();
		}
	}
}
class Pra2_6{
	public void pra() {
		int[] array= {15,30};
		for(int i=0;i<array.length;i++) {
			System.out.println((i+1)+"つ目の整数の2乗は"+square(array[i]));
		}
	}
	public int square(int num) {
		return num*num;
	}
}

//デジタルテキスト第三回練習問題
class Rectangle{
	private int width;
	private int height;
	
	public Rectangle(int width,int height) {
		this.width=width;
		this.height=height;
	}
	public int getArea() {
		return width*height;
	}
}
class Order{
	private String name;
	private int num;
	void show() {
		System.out.println(name+"を"+num+"個注文します。");
	}
	public Order(String name,int num) {
		this.name=name;
		this.num=num;
	}
}
class Cash{
	private int balance;
	
	public Cash() {//引数がないコンストラクタ
		
	}
	public Cash(int balance) {//引数ありのコンストラクタ、残高の初期値を設定する
		this.balance=balance;
	}
	public void deposit(int balance) {
		this.balance+=balance;
	}
	public void drown(int balance) {
		if(this.balance<balance) {
			this.balance=0;
		}else {
			this.balance-=balance;
		}
	}
	public int getBalance() {
		return this.balance;
	}
}