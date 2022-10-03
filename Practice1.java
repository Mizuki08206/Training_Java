package practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import practice.Q8_1.Cat;

public class Practice1 {

	public static void main(String[] args) {//練習問題URL：https://kitako.tokyo/lib/JavaExercise.aspx?id=4
//		Q4_1.q();
//		Q4_2.q();
//		Q4_3.q();
//		Q4_4.q();
//		Q4_5.q();
//		Q4_6.q();
//		Q4_7.q();
//		Q4_8.q();
//		Q4_9.q();
//		Q7_1.q();
//		Q7_2.q();
//		Q7_3.q();
//		Q7_4.q();
//		Q7_5.q();
//		Q7_6.q();
//		Q8_1.q();
//		Q8_2.q();
//		Q8_3.q();
//		Q8_4.q();
//		Q8_5.q();
	}
}
//練習問題4-1
class Q4_1{
	public static void q() {
		for(int i=0;i<10;i++) {
			System.out.println("SPAM");
		}
	}
}
//練習問題4-2
class Q4_2{
	public static void q() {
		for(int i=3;i<28;i++) {
			System.out.println(i*3);
		}
	}
}
//練習問題4-3
class Q4_3{
	public static void q() {
		for(int i=1;i<9;i++) {
			final int num=3;
			int sum=num;
			for(int j=1;j<i;j++) {
				sum*=num;
			}
			System.out.println(sum);
		}
	}
}
//練習問題4-4
class Q4_4{
	public static void q() {
		int sum=7;
		for(int i=sum-1;i>0;i--) {
			sum*=i;
		}
		System.out.println(sum);
	}
}
//練習問題4-5
class Q4_5{
	public static void q() {
		int sum=0;
		int i=0;
		while(true) {
			try {
				System.out.print("整数を入力>>");
				sum+=new java.util.Scanner(System.in).nextInt();
				i++;
				if(i==10) {
					System.out.println(sum/10);
					break;
				}
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
//練習問題4-6
class Q4_6{
	public static void q() {
		int win=0;
		int lose=0;
		int num=0;
		while(true) {
			try {
				System.out.println("0:負け、1:勝ち");
				int in=new java.util.Scanner(System.in).nextInt();
				if(in==0 || in==1) {
					if(in==0) {
						lose++;
					}else {
						win++;
					}
					num++;
				}else {
					System.out.println("0か1で入力してください");
				}
				if(num==10) {
					System.out.println("---入力終了---");
					System.out.println("勝ち数："+win);
					System.out.println("負け数："+lose);
					break;
				}
			}catch(Exception e) {
				System.out.println(e);
			}
		}

		
	}
}
//練習問題4-7
class Q4_7{
	public static void q() {
		int hansin=0;
		int kyozin=0;
		int num=1;
		boolean flag=false;
		while(num<11) {
			try {
				if(!flag) {
					System.out.print(num+"回表、巨人の得点は？");
					int tmp=new java.util.Scanner(System.in).nextInt();
					if(tmp<0) {
						System.out.println("入力値がおかしい");
					}else {
						kyozin+=tmp;
						flag=true;
					}
				}else {
					System.out.print(num+"回裏、阪神の得点は？");
					int tmp=new java.util.Scanner(System.in).nextInt();
					if(tmp<0) {
						System.out.println("入力値がおかしい");
					}else {
						hansin+=tmp;
						flag=false;
						num++;
					}
				}
			}catch(Exception e) {
				System.out.println("数値で入力してください");
			}
		}
		System.out.println("巨人："+kyozin+"点、阪神："+hansin+"点");
		if(kyozin>hansin) {
			System.out.println("巨人の勝ち");
		}else if(hansin==kyozin){
			System.out.println("引き分け");
		}else {
			System.out.println("阪神の勝ち");
		}
	}
}
//練習問題4-8
class Q4_8{
	public static void q() {
		int num=0;
		int max=0;
		while(num<10) {
			try {
				System.out.print((num+1)+"回目の入力：");
				int input=new java.util.Scanner(System.in).nextInt();
				if(input<0) {
					System.out.println("自然数で入力してください");
					continue;
				}else {
					if(max<input) {
						max=input;
					}
					num++;
				}
			}catch(Exception e) {
				System.out.println("数値で入力してください");
			}
		}
		System.out.println("最大値:"+max);
	}
}
//練習問題4-9
class Q4_9{
	public static void q() {
		int num=0;
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		while(num<10) {
			try {
				System.out.print((num+1)+"回目の入力：");
				int input=new java.util.Scanner(System.in).nextInt();
				if(input<0) {//入力値が正の数
					System.out.println("自然数で入力してください");
					continue;
				}else {//入力値が負の数
					if(num==0) {//1回目の入力
						min=input;
						max=input;
					}else {//2回目以降の入力
						if(min>input) {
							min=input;
						}else if(max<input) {
							max=input;
						}
					}
					num++;
				}
				
			}catch(Exception e) {
				System.out.println("数値で入力してください");
			}
		}
		System.out.println("最大値:"+max+"、最小値:"+min);
	}
}
//練習問題7-1
class Q7_1{//アウタークラス
	public static void q() {
		Q7_1 obj=new Q7_1();
		Dog dog=obj.new Dog();
		dog.setName("ポチ");
		dog.showProfile();
	}
	class Dog{//インナークラス
		private String name;
		public void setName(String name) {
			this.name=name;
		}
		public void showProfile() {
			System.out.println("名前は、"+this.name+"です。");
		}
	}
}
//練習問題7-2
class Q7_2{//アウタークラス
	public static void q() {
		Q7_2 obj=new Q7_2();
		Dog dog=obj.new Dog();
		dog.setName("ポチ");
		dog.setAge(3);
		dog.showProfile();
	}
	class Dog{//インナークラス
		private String name;
		private int age;
		
		public void setName(String name) {
			this.name=name;
		}
		public void setAge(int age) {
			this.age=age;
		}
		public void showProfile() {
			System.out.println("名前は"+this.name+"、年齢は"+age+"です。");
		}
	}
}
//練習問題7-3
class Q7_3{//アウタークラス
	public static void q() {
		Q7_3 obj=new Q7_3();//アウタークラスのobj１つでインナークラスのインスタンスが2つ以上作れる
		Dog dog1=obj.new Dog();
		Dog dog2=obj.new Dog();
		dog1.setName("ポチ");
		dog2.setName("タマ");
		dog1.setAge(2);
		dog2.setAge(3);
		dog1.showProfile();
		dog2.showProfile();
	}
	class Dog{//インナークラス
		private String name;
		private int age;
		public void setName(String name) {
			this.name=name;
		}
		public void setAge(int age) {
			this.age=age;
		}
		public void showProfile() {
			System.out.println("名前は"+this.name+"、年齢は"+age+"です。");
		}
	}
}
//練習問題7-4
class Q7_4{//アウタークラス
	public static void q() {
		Q7_4 obj=new Q7_4();
		Dog dog=obj.new Dog("あげぱん");
		dog.setAge(2);
		dog.setName("ポチ");
		dog.showProfile();
	}
	class Dog{//インナークラス
		private String name;
		private int age;
		private String type;
		public Dog(String type) {
			this.type=type;
		}
		public void setName(String name) {
			this.name=name;
		}
		public void setAge(int age) {
			this.age=age;
		}
		public void showProfile() {
			System.out.println("名前は"+this.name+"、年齢は"+age+"、犬種は"+this.type+"です。");
		}
	}
}
//練習問題7-5
class Q7_5{//アウタークラス
	public static void q() {
		Map<Integer,Integer> array=new HashMap<>();
		array.put(0,0);
		array.put(1,0);
		array.put(2,0);
		array.put(3,0);
		array.put(4,0);
		array.put(5,0);
		Q7_5 obj=new Q7_5();
		CoinCase cc=obj.new CoinCase(array);
		int num;
		
		//check
		for(int i=0;i<6;i++) {
			num=cc.getCount(i);
			if(num==-1) {
				System.out.println("そのようなコインはありません。");
			}else {
				System.out.println(i+"："+num+"枚あります。");
			}
		}
		
		int coin;
		int many;
		for(int i=0;i<5;i++) {
			while(true) {
				try {
					System.out.println("0:500,1:100,2:50,3:10,4:5,5:1");
					System.out.print("どの硬貨>>");
					coin=new java.util.Scanner(System.in).nextInt();
					System.out.print("何枚>>");
					many=new java.util.Scanner(System.in).nextInt();
					if(many<0 || (coin<0 || 5<coin)) {
						System.out.println("入力がおかしい");
						continue;
					}
					break;
				}catch(Exception e) {
					System.out.println("数値で入力してください");
				}
			}
			switch(coin) {
			case 0:
				cc.addCoins(coin, many);
				break;
			case 1:
				cc.addCoins(coin, many);
				break;
			case 2:
				cc.addCoins(coin, many);
				break;
			case 3:
				cc.addCoins(coin, many);
				break;
			case 4:
				cc.addCoins(coin, many);
				break;
			case 5:
				cc.addCoins(coin, many);
				break;
			}
		}
		System.out.println("0:500,1:100,2:50,3:10,4:5,5:1");
		for(int i=0;i<6;i++) {
			num=cc.getCount(i);
			if(num==-1) {
				System.out.println("そのようなコインはありません。");
			}else {
				System.out.println(i+"："+num+"枚あります。");
			}
		}
		System.out.println("総額は:"+cc.getAmount());
		
	}
	class CoinCase{//インナークラス
		private Map<Integer,Integer> array;
		
		public void addCoins(int coin,int many) {
			Integer num=array.get(coin);
			if(num!=null) {
				array.put(coin,many);
			}
		}
		public int getCount(int coin){
			Integer num=array.get(coin);
			if(num==null) {
				return -1;
			}else {
				return num;
			}
		}
		public int getAmount() {
			int sum=0;
			for(Integer num:array.keySet()) {
				switch(num) {
				case 0:
					sum+=500*array.get(num);
					break;
				case 1:
					sum+=100*array.get(num);
					break;
				case 2:
					sum+=50*array.get(num);
					break;
				case 3:
					sum+=10*array.get(num);
					break;
				case 4:
					sum+=5*array.get(num);
					break;
				case 5:
					sum+=1*array.get(num);
					break;
				}
			}
			return sum;
		}
		public CoinCase(Map<Integer,Integer> array) {
			this.array=array;
		}
	}
}
//練習問題7-6
class Q7_6{//アウタークラス
	public static void q() {
		Map<Integer,Integer> array=new LinkedHashMap<>();
		array.put(500,0);
		array.put(100,0);
		array.put(50,0);
		array.put(10,0);
		array.put(5,0);
		array.put(1,0);
		Q7_6 obj=new Q7_6();
		CoinCase cc=obj.new CoinCase(array);
		int num;
		
		
//		System.out.println("-----458-----");//462と同じ
//		for(Integer key:array.keySet()) {
//			System.out.println(key+"："+array.get(key));
//		}
		System.out.println("-----462-----");
		array=cc.getCount();
		for(Integer key:array.keySet()) {
			System.out.println(key+"："+array.get(key));
		}
		
		int coin;
		int many;
		for(int i=0;i<5;i++) {
			while(true) {
				try {
					System.out.println("\n硬貨の追加を行います。");
					System.out.println("500,100,50,10,5,1");
					System.out.print("どの硬貨>>");
					coin=new java.util.Scanner(System.in).nextInt();
					System.out.print("何枚>>");
					many=new java.util.Scanner(System.in).nextInt();
					if(many<0) {
						System.out.println("入力がおかしい");
						continue;
					}
					break;
				}catch(Exception e) {
					System.out.println("数値で入力してください");
				}
			}
			cc.addCoins(coin, many);
		}
		System.out.println("500,100,50,10,5,1");
		
//		for(Integer i:array.keySet()) {//500と同一
//			num=cc.getCount(i);
//			if(num==-1) {
//				System.out.println("そのようなコインはありません。");
//			}else {
//				System.out.println(i+"："+num);
//			}
//		}
		System.out.println("-----500-----");
		array=cc.getCount();
		for(Integer key:array.keySet()) {
			System.out.println(key+"："+array.get(key));
		}
		
		System.out.println("---硬貨別の総額---");
		for(Integer key:array.keySet())	{
			System.out.println(key+"の総額は"+key*array.get(key));
		}
		int sum=0;
		System.out.println("---硬貨の総枚数---");
		for(Integer key:array.keySet()) {
			sum+=array.get(key);
		}
		System.out.println(sum);
		
		System.out.println("---全体の総額---");
		System.out.println("総額は:"+cc.getAmount());
		
	}
	class CoinCase{//インナークラス
		private Map<Integer,Integer> array;
		
		public void addCoins(int coin,int many) {
			Integer num=array.get(coin);
			if(num!=null) {
				array.put(coin,many+num);
			}else {
				System.out.println("入力された硬貨はありませんでした。---505");
			}
		}
		public int getCount(int coin){
			Integer num=array.get(coin);
			if(num==null) {
				return -1;
			}else {
				return num;
			}
		}
		public Map<Integer,Integer> getCount() {
			return array;
		}
		public int getAmount() {
			int sum=0;
			for(Integer num:array.keySet()) {
				sum+=num*array.get(num);
			}
			return sum;
		}
		public int getAmount(int coin) {
			Integer num=array.get(coin);
			int sum=0;
			if(num!=null) {
				sum+=coin*num;
			}
			return sum;
		}
		public CoinCase(Map<Integer,Integer> array) {
			this.array=array;
		}
	}
}
//練習問題8-1
class Q8_1{//アウタークラス
	public static void q() {
		Q8_1 obj=new Q8_1();
		Cat cat=obj.new Cat();
		cat.name="ゴリラ";
		cat.age=2;
		cat.showProfile();
		cat.sleep();
	}
	class Cat extends Animal{
		public void sleep() {
			System.out.println("スースー");
		}
	}
	class Animal{
		public String name;
		public int age;
		public void showProfile() {
			System.out.println("名前は、"+this.name+"、"+this.age+"歳です。");
		}
	}
}
//練習問題8-2
class Q8_2{//アウタークラス
	public static void q() {
		Q8_1 obj1=new Q8_1();
		Q8_2 obj2=new Q8_2();
		Cat cat=obj1.new Cat();
		Dog dog=obj2.new Dog();
		cat.name="ゴリラ";
		cat.age=2;
		dog.name="キリン";
		dog.age=3;
		cat.showProfile();
		dog.showProfile();
		cat.sleep();
		dog.run();
		
	}
	class Dog extends Animal{//インナークラス
		public void run() {
			System.out.println("トコトコ");
		}
	}
	class Animal{
		public String name;
		public int age;
		public void showProfile() {
			System.out.println("名前は、"+this.name+"、"+this.age+"歳です。");
		}
	}
}
//練習問題8-3
class Q8_3{//アウタークラス
	public static void q() {
		Q8_3 obj=new Q8_3();
		Animal cat=obj.new Cat();
		Animal dog=obj.new Dog();
		dog.speak();
		cat.speak();
	}
	class Cat extends Animal{//アウタークラス
		public void speak() {
			System.out.println("ニャーニャー");
		}
	}
	class Dog extends Animal{
		public void speak() {
			System.out.println("ワンワン");
		}
	}
	class Animal{
		public String name;
		public int age;
		public void showProfile() {
			System.out.println("名前は、"+this.name+"、"+this.age+"歳です。");
		}
		public void speak() {
			System.out.println("......");
		}
	}
}
//練習問題8-4
class Q8_4{//アウタークラス
	public static void q() {
		Q8_4 obj=new Q8_4();
		Animal[] array=new Animal[4];
		array[0]=obj.new Cat();
		array[1]=obj.new Dog();
		array[2]=obj.new Cat();
		array[3]=obj.new Dog();
		for(Animal animal:array) {
			animal.speak();
		}
	}
	class Cat extends Animal{//インナークラス
		public void speak() {
			System.out.println("ニャーニャー");
		}
	}
	class Dog extends Animal{
		public void speak() {
			System.out.println("ワンワン");
		}
	}
	class Animal{
		public String name;
		public int age;
		public void speak() {
			System.out.println("......");
		}
	}
}
//練習問題8-4の匿名クラス
class Q8_5{//アウタークラス
	public static void q() {
		Q8_5 obj=new Q8_5();
		
		Animal cat=obj.new Animal("ゴリラ",2) {
			public void run() {
				System.out.println("runrun");
			}
			public void showPro() {
				System.out.println(this.name+"は"+this.age+"歳です。");
			}
		};
		cat.showPro();
	}
	abstract class Animal{//インナークラス
		protected String name;//親クラスのフィールドを継承させる場合は、修飾子はprotected以上の緩さでなければならない
		protected int age;
		public Animal(String name,int age) {
			this.name=name;
			this.age=age;
		}
		public void run() {
			System.out.println("......");
		}
		public abstract void showPro();
	}
}