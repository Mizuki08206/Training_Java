package practice;

public class Tmp0927 {

	public static void main(String[] args) {
//		System.out.println("����ɂ���");
//		//���2
//		int[] n= {13,21,15,5,2,8};
//		for(int i=0;i<n.length;i++) {
//			if(n[i]>=10) {
//				System.out.println("10�ȏ�ł�");
//			}else {
//				System.out.println("10�����ł��B");
//			}
//		}
//		//���3
//		for(int i=0;i<n.length;i++) {
//			if(n[i]%2==0) {
//				System.out.println("�����ł��B");
//			}else {
//				System.out.println("��ł��B");
//			}
//		}
		//���4
//		Item item=new Item("�����S",100);
//		item.display();
		
		
		//���5
		while(true) {
			try{
				int num=new java.util.Scanner(System.in).nextInt();
				System.out.println("���̖ڂ�"+(7-num));
				System.out.println("�����܂����H�iy/n�j");
				String yn=new java.util.Scanner(System.in).nextLine();
				if(yn.charAt(0)!='y') {
					break;
				}			
			}catch(Exception e){
				System.out.println("���l����͂��Ă�������");
			}
		}
		
		//���6
//		int add=500;
//		while(true) {
//			try{
//				int sum=0;
//				System.out.print("�d���́H����");
//				int num=new java.util.Scanner(System.in).nextInt();
//				if(num<6) {
//					sum+=add;
//				}else {
//					sum+=add;
//					sum+=num*100;
//				}
//				System.out.println("�萔���Ƒ�����"+sum);
//				System.out.print("�����܂����H�iy/n�j");
//				String yn=new java.util.Scanner(System.in).nextLine();
//				if(yn.charAt(0)!='y') {
//					break;
//				}			
//			}catch(Exception e){
//				System.out.println("���l����͂��Ă�������");
//			}
//		}		
		
		//���7
//		String[][] array= {{"code","data"},{"apple","orange"},{"peach","grape"}};
//		for(String[] tmp:array) {
//			if(tmp[0].length()==tmp[1].length()) {
//				System.out.println("��");
//			}else {
//				System.out.println("�~");
//			}
//		}
		
		//���8
//		Car car1=new Car(100,"�����X");
//		Car car2=new Car("�x���c");
//		System.out.println(car1.getName()+"��"+car1.getSpeed()+"km/h�ő�����");
//		car1.drive();
	}
}
//���̃N���X�͑��N���X����C���X�^���X�����邩������Ȃ�����public�����āA
//Tmp0927��public�O���ׂ���������Ȃ�
////ANS:public�����Ă��Ȃ��Ă��A���N���X���p�P����C���X�^���X�����\
class Car{
	private int speed;
	private String name;
	public Car(int speed,String name) {//�R���X�g���N�^�A�����Q
		this.speed=speed;
		this.name=name;
	}
	public Car(String name) {//�R���X�g���N�^�A�����P
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
		System.out.println(this.name+"��"+this.speed+"km/h�ő�����");
	}
}
//���̃N���X�͑��N���X����C���X�^���X�����邩������Ȃ�����public�����āA
//Tmp0927��public�O���ׂ���������Ȃ�
////ANS:public�����Ă��Ȃ��Ă��A���N���X���p�P����C���X�^���X�����\
class Item{
	String name;
	int price;
	public Item(String name,int price) {
		this.name=name;
		this.price=price;
	}
	public void display() {
		System.out.println(name+"��"+price+"�~");
	}
}