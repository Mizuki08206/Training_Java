package practice;

public class Practice2 {

	public static void main(String[] args) {
		
		//�f�W�^���e�L�X�g4_2�܂�
//		Practice4_2 pr=new Practice4_2(10,7,3);
//		System.out.println(pr.width);
//		System.out.println(pr.height);
//		System.out.println(pr.depth);
//		System.out.println(pr.getVolume());
		
		Car car1=new Car("�|���V�F");
		car1.drive();
	}

}
//�f�W�^���e�L�X�g��l����K���_1
class Practice4_1{
	int width;
	int height;
	
	public int getArea() {
		int area=width*height;
		return area;
	}
	
}
//�f�W�^���e�L�X�g��l����K���_2
class Practice4_2 extends Practice4_1{//Practice4_1���p�������N���X
	int depth;
	public int getVolume() {
		return width*height*depth;
	}
	public Practice4_2(int width,int height,int depth) {
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
}
//�f�W�^���e�L�X�g��l����K���_3
abstract class Factory{
	public abstract String toString();
}
class FactoryImpl{
	String product;
	int price;
	public FactoryImpl(String product,int price) {
		this.product=product;
		this.price=price;
	}
}
interface Viewer{
	void view();
}

