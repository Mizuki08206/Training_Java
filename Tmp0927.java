package practice;

public class Tmp0927 {

	public static void main(String[] args) {
//		System.out.println("こんにちは");
//		//問題2
//		int[] n= {13,21,15,5,2,8};
//		for(int i=0;i<n.length;i++) {
//			if(n[i]>=10) {
//				System.out.println("10以上です");
//			}else {
//				System.out.println("10未満です。");
//			}
//		}
//		//問題3
//		for(int i=0;i<n.length;i++) {
//			if(n[i]%2==0) {
//				System.out.println("偶数です。");
//			}else {
//				System.out.println("奇数です。");
//			}
//		}
		//問題4
//		Item item=new Item("リンゴ",100);
//		item.display();
		
		
		//問題5
		while(true) {
			try{
				int num=new java.util.Scanner(System.in).nextInt();
				System.out.println("裏の目は"+(7-num));
				System.out.println("続けますか？（y/n）");
				String yn=new java.util.Scanner(System.in).nextLine();
				if(yn.charAt(0)!='y') {
					break;
				}			
			}catch(Exception e){
				System.out.println("数値を入力してください");
			}
		}
		
		//問題6
//		int add=500;
//		while(true) {
//			try{
//				int sum=0;
//				System.out.print("重さは？＞＞");
//				int num=new java.util.Scanner(System.in).nextInt();
//				if(num<6) {
//					sum+=add;
//				}else {
//					sum+=add;
//					sum+=num*100;
//				}
//				System.out.println("手数料と送料で"+sum);
//				System.out.print("続けますか？（y/n）");
//				String yn=new java.util.Scanner(System.in).nextLine();
//				if(yn.charAt(0)!='y') {
//					break;
//				}			
//			}catch(Exception e){
//				System.out.println("数値を入力してください");
//			}
//		}		
		
		//問題7
//		String[][] array= {{"code","data"},{"apple","orange"},{"peach","grape"}};
//		for(String[] tmp:array) {
//			if(tmp[0].length()==tmp[1].length()) {
//				System.out.println("●");
//			}else {
//				System.out.println("×");
//			}
//		}
		
		//問題8
//		Car car1=new Car(100,"ヤリス");
//		Car car2=new Car("ベンツ");
//		System.out.println(car1.getName()+"は"+car1.getSpeed()+"km/hで走った");
//		car1.drive();
	}
}
//このクラスは他クラスからインスタンス化するかもしれないからpublicをつけて、
//Tmp0927をpublic外すべきかもしれない
////ANS:publicがついていなくても、他クラス他パケからインスタンス生成可能
class Car{
	private int speed;
	private String name;
	public Car(int speed,String name) {//コンストラクタ、引数２
		this.speed=speed;
		this.name=name;
	}
	public Car(String name) {//コンストラクタ、引数１
		this.name=name;
	}
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getSpeed() {
		return this.speed;
	}
	public String getName() {
		return this.name;
	}
	public void drive() {
		System.out.println(this.name+"は"+this.speed+"km/hで走った");
	}
}
//このクラスは他クラスからインスタンス化するかもしれないからpublicをつけて、
//Tmp0927をpublic外すべきかもしれない
////ANS:publicがついていなくても、他クラス他パケからインスタンス生成可能
class Item{
	String name;
	int price;
	public Item(String name,int price) {
		this.name=name;
		this.price=price;
	}
	public void display() {
		System.out.println(name+"は"+price+"円");
	}
}