package practice;

public class Day0930 {

	public static void main(String[] args) {
		
//		//匿名クラス
//		//親クラスを継承した子クラスに名前を付けないのが匿名クラス
//		//特別Runnableインタフェースでなくてもよい。継承したいクラスやインタフェースで問題ない
//		//親クラス変数にサブクラスのインスタンスが入る
//		//匿名クラスはコンストラクタを作成することができない
//		//1つしかメソッドをオーバーライドできないということではない
		Runnable runner1=new Runnable() {
			@Override
			public void run() {
				System.out.println("匿名クラス!!!");
			}
		};
		runner1.run();
		
		//Parentインタフェースを実装した匿名クラス
		Parent child1=new Parent() {
			@Override
			public void output() {
				System.out.println("Child1!!!");
			}
			public int getInt() {
				return 150;
			}
		};
		child1.output();
		System.out.println(child1.getInt());
		//Childクラスを継承した匿名クラス
		Child ch1=new Child() {
			public void output() {//オーバーライド
				System.out.println("Childクラスの匿名クラス");
			}
		};
		ch1.output();
		
//		//ラムダ式
//		//ラムダ式はインタフェースでなければ実装できない
//		//Runnableインタフェースでなく、自作インタフェースでも実装は可能
//		//Runnableのrunをオーバーライドしている
		Runnable runner2=()->{System.out.println("ラムダ式!!!");};
		runner2.run();
		
//		//Parentインタフェースを実装したラムダ式
		Parent child2=()->{System.out.println("Child2!!!");};
		child2.output();
		
		
		/*ここから強めの質問
		匿名クラスではオーバーライドできるメソッドの数に制限はないが、
		ラムダ式はオーバーライドできるメソッドは1つと制限があるため、
		親の抽象メソッドが2つ以上あるインタフェースは実装できない
		
		*/
		
		
//		ArrayList<Parent> array=new ArrayList<>();
//		array.add(child1);
//		array.add(child2);
////		クラス名.メソッド名(str);と同じ
//		array.add(new Child());
		
//		for(Parent tmp:array) {//コレクションの中身を変数に入れて使用する
//			tmp.output();
//			System.out.println(tmp);
//		}
		
	}
}
interface Parent{
	public abstract void output();
	public abstract int getInt();
}
class Child implements Parent{
	@Override
	public void output() {
		System.out.println("Parentインタフェースを継承したChildクラス");
	}
	public int getInt() {
		return 100;
	}
}