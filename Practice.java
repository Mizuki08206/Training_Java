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
		
		
//		Chara c1=new Chara("��������",100);
//		System.out.println(c1.getName());
//		System.out.println(c1);
//		System.out.println("------------------------");
//		String str1="����ɂ���";
//		String str2="����΂��";
//		str1=str2;
//		str1="���͂悤�������܂�";//�V����str1�̃C���X�^���X����������Ă���H
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
		
//		Order order=new Order("�����S",5);
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
		return "���O:"+this.name+"HP:"+this.hp;
	}
}


//�f�W�^���e�L�X�g������K���
class Pra2_1{
	public void pra() {
		int sum=0;
		for(int i=1;i<101;i++) {
			sum+=i;
		}
		System.out.println("���v��"+sum);
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
		System.out.println("���v��"+sum);
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
			System.out.println((i+1)+"�ڂ̐�����2���"+square(array[i]));
		}
	}
	public int square(int num) {
		return num*num;
	}
}

//�f�W�^���e�L�X�g��O����K���
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
		System.out.println(name+"��"+num+"�������܂��B");
	}
	public Order(String name,int num) {
		this.name=name;
		this.num=num;
	}
}
class Cash{
	private int balance;
	
	public Cash() {//�������Ȃ��R���X�g���N�^
		
	}
	public Cash(int balance) {//��������̃R���X�g���N�^�A�c���̏����l��ݒ肷��
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