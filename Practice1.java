package practice;

import java.util.HashMap;
import java.util.Map;

public class Practice1 {

	public static void main(String[] args) {//���K���URL�Fhttps://kitako.tokyo/lib/JavaExercise.aspx?id=4
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
		
	}
}
//���K���4-1
class Q4_1{
	public static void q() {
		for(int i=0;i<10;i++) {
			System.out.println("SPAM");
		}
	}
}
//���K���4-2
class Q4_2{
	public static void q() {
		for(int i=3;i<28;i++) {
			System.out.println(i*3);
		}
	}
}
//���K���4-3
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
//���K���4-4
class Q4_4{
	public static void q() {
		int sum=7;
		for(int i=sum-1;i>0;i--) {
			sum*=i;
		}
		System.out.println(sum);
	}
}
//���K���4-5
class Q4_5{
	public static void q() {
		int sum=0;
		int i=0;
		while(true) {
			try {
				System.out.print("���������>>");
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
//���K���4-6
class Q4_6{
	public static void q() {
		int win=0;
		int lose=0;
		int num=0;
		while(true) {
			try {
				System.out.println("0:�����A1:����");
				int in=new java.util.Scanner(System.in).nextInt();
				if(in==0 || in==1) {
					if(in==0) {
						lose++;
					}else {
						win++;
					}
					num++;
				}else {
					System.out.println("0��1�œ��͂��Ă�������");
				}
				if(num==10) {
					System.out.println("---���͏I��---");
					System.out.println("�������F"+win);
					System.out.println("�������F"+lose);
					break;
				}
			}catch(Exception e) {
				System.out.println(e);
			}
		}

		
	}
}
//���K���4-7
class Q4_7{
	public static void q() {
		int hansin=0;
		int kyozin=0;
		int num=1;
		boolean flag=false;
		while(num<11) {
			try {
				if(!flag) {
					System.out.print(num+"��\�A���l�̓��_�́H");
					int tmp=new java.util.Scanner(System.in).nextInt();
					if(tmp<0) {
						System.out.println("���͒l����������");
					}else {
						kyozin+=tmp;
						flag=true;
					}
				}else {
					System.out.print(num+"�񗠁A��_�̓��_�́H");
					int tmp=new java.util.Scanner(System.in).nextInt();
					if(tmp<0) {
						System.out.println("���͒l����������");
					}else {
						hansin+=tmp;
						flag=false;
						num++;
					}
				}
			}catch(Exception e) {
				System.out.println("���l�œ��͂��Ă�������");
			}
		}
		System.out.println("���l�F"+kyozin+"�_�A��_�F"+hansin+"�_");
		if(kyozin>hansin) {
			System.out.println("���l�̏���");
		}else if(hansin==kyozin){
			System.out.println("��������");
		}else {
			System.out.println("��_�̏���");
		}
	}
}
//���K���4-8
class Q4_8{
	public static void q() {
		int num=0;
		int max=0;
		while(num<10) {
			try {
				System.out.print((num+1)+"��ڂ̓��́F");
				int input=new java.util.Scanner(System.in).nextInt();
				if(input<0) {
					System.out.println("���R���œ��͂��Ă�������");
					continue;
				}else {
					if(max<input) {
						max=input;
					}
					num++;
				}
			}catch(Exception e) {
				System.out.println("���l�œ��͂��Ă�������");
			}
		}
		System.out.println("�ő�l:"+max);
	}
}
//���K���4-9
class Q4_9{
	public static void q() {
		int num=0;
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		while(num<10) {
			try {
				System.out.print((num+1)+"��ڂ̓��́F");
				int input=new java.util.Scanner(System.in).nextInt();
				if(input<0) {//���͒l�����̐�
					System.out.println("���R���œ��͂��Ă�������");
					continue;
				}else {//���͒l�����̐�
					if(num==0) {//1��ڂ̓���
						min=input;
						max=input;
					}else {//2��ڈȍ~�̓���
						if(min>input) {
							min=input;
						}else if(max<input) {
							max=input;
						}
					}
					num++;
				}
				
			}catch(Exception e) {
				System.out.println("���l�œ��͂��Ă�������");
			}
		}
		System.out.println("�ő�l:"+max+"�A�ŏ��l:"+min);
	}
}
//���K���7-1
class Q7_1{//�A�E�^�[�N���X
	public static void q() {
		Q7_1 obj=new Q7_1();
		Dog dog=obj.new Dog();
		dog.setName("�|�`");
		dog.showProfile();
	}
	class Dog{//�C���i�[�N���X
		private String name;
		public void setName(String name) {
			this.name=name;
		}
		public void showProfile() {
			System.out.println("���O�́A"+this.name+"�ł��B");
		}
	}
}
//���K���7-2
class Q7_2{//�A�E�^�[�N���X
	public static void q() {
		Q7_2 obj=new Q7_2();
		Dog dog=obj.new Dog();
		dog.setName("�|�`");
		dog.setAge(3);
		dog.showProfile();
	}
	class Dog{//�C���i�[�N���X
		private String name;
		private int age;
		
		public void setName(String name) {
			this.name=name;
		}
		public void setAge(int age) {
			this.age=age;
		}
		public void showProfile() {
			System.out.println("���O��"+this.name+"�A�N���"+age+"�ł��B");
		}
	}
}
//���K���7-3
class Q7_3{//�A�E�^�[�N���X
	public static void q() {
		Q7_3 obj=new Q7_3();//�A�E�^�[�N���X��obj�P�ŃC���i�[�N���X�̃C���X�^���X��2�ȏ����
		Dog dog1=obj.new Dog();
		Dog dog2=obj.new Dog();
		dog1.setName("�|�`");
		dog2.setName("�^�}");
		dog1.setAge(2);
		dog2.setAge(3);
		dog1.showProfile();
		dog2.showProfile();
	}
	class Dog{//�C���i�[�N���X
		private String name;
		private int age;
		public void setName(String name) {
			this.name=name;
		}
		public void setAge(int age) {
			this.age=age;
		}
		public void showProfile() {
			System.out.println("���O��"+this.name+"�A�N���"+age+"�ł��B");
		}
	}
}
//���K���7-4
class Q7_4{//�A�E�^�[�N���X
	public static void q() {
		Q7_4 obj=new Q7_4();
		Dog dog=obj.new Dog("�����ς�");
		dog.setAge(2);
		dog.setName("�|�`");
		dog.showProfile();
	}
	class Dog{//�C���i�[�N���X
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
			System.out.println("���O��"+this.name+"�A�N���"+age+"�A�����"+this.type+"�ł��B");
		}
	}
}
//���K���7-5
class Q7_5{//�A�E�^�[�N���X
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
		int num=0;
		while(true) {
			try {
				System.out.println("0:500,1:100,2:50,3:10,4:5,5:1");
				System.out.print("�ǂ̍d��>>");
				int coin=new java.util.Scanner(System.in).nextInt();
				System.out.print("����>>");
				int many=new java.util.Scanner(System.in).nextInt();
				if(many<0) {
					System.out.println("���͂���������");
					continue;
				}
				
			}catch(Exception e) {
				System.out.println("���l�œ��͂��Ă�������");
			}
		}
		
	}
	class CoinCase{//�C���i�[�N���X
		private Map<Integer,Integer> array;
		
		public void addCoins(int coin,int many) {
			Integer num=array.get(coin);
			if(num!=null) {
				array.put(coin,many);
			}
		}
		public int getCount(int coin){
			Integer num=array.get(coin);
			if(num!=null) {
				return -1;
			}else {
				return num;
			}
		}
		public int getAmount() {
			int sum=0;
			for(Integer num:array.keySet()) {
				sum+=num;
			}
			return sum;
		}
		public CoinCase(Map<Integer,Integer> array) {
			this.array=array;
		}
		
	}
}









