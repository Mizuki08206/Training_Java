package practice;

public class Day1005 {

	public static void main(String[] args) {
		Factorial f=new Factorial();
		f.run();
		int sum=1;
		for(int i=10;i>0;i--) {
			sum*=i;
		}
		System.out.println("\n10の階乗："+sum);
	}
}
class Tmp{
	
}
class Factorial{//https://ksuap.github.io/2016spring/basic/java.html#basic_form
	void run() {
		int number=10;
		int factorialValue=factorial(number);
		System.out.printf("%d! = %d%n", number,factorialValue);
	}
	
	//再帰処理
	//計算結果の保持と、戻り値が難しかった
	public int factorial(int number) {
		if(number>0) {//numberが0以上
			System.out.println("数："+(number));
			return number*factorial(number-1);//ここが難しい
		}else {
			System.out.println("0になった");
			return 1;//ここが難しい
		}
	}
}