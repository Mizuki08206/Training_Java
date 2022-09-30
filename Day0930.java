package practice;

import java.util.ArrayList;

public class Day0930 {

	public static void main(String[] args) {
		
//		//匿名クラス
//		//匿名クラスはRunnableインタフェースを継承し、runメソッドを実装する必要がある。
//		//特別Runnsbleインタフェースでなくてもよい。継承したいクラスで問題ない
//		//親クラスの変数にサブクラスのインスタンスを入れることは可能
		//匿名クラスはコンストラクタを作成することができない
//		Runnable runner1=new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("run");
//			}
//		};
//		runner1.run();
//		//ラムダ式
//		//匿名クラスから、new化とrunのオーバーライドを省略した形
//		//newを消して、runを->に置き換える
		//ラムダ式はインタフェースでなければ継承できない
//		Runnable runner2=()->{System.out.println("Lamda!");};
//		runner2.run();
		
		//Parentインタフェースを実装した匿名クラス
		Parent child1=new Parent() {
			@Override
			public void output() {
				System.out.println("Child1!!!");
			}
			
		};
//		child1.output();
		//Parentインタフェースを実装したラムダ式
		Parent child2=()->{System.out.println("Child2!!!");};
//		child2.output();
		
		ArrayList<Parent> array=new ArrayList<>();
		array.add(child1);
		array.add(child2);
		//配列からのみしないのであれば、child1などの変数は必要ない
//		クラス名.メソッド名("name");
//		String str="name";
//		クラス名.メソッド名(str);と同じ
		array.add(new Child());
		
		for(Parent tmp:array) {//コレクションの中身を変数に入れて使用する
			tmp.output();
			System.out.println(tmp);
		}
		
	}
}
interface Parent{
	public abstract void output();
}
class Child implements Parent{
	@Override
	public void output() {
		System.out.println("ParentインタフェースをしたChildクラス");
	}
}