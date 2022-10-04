package practice;

public class Inhe {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
//フィールドやメソッドは当然のように引き継がれ、そのクラスのフィールドのように扱われるが、
//コンストラクタを使用して値をセットする際は、thisは使えずsuperを使用しなければならない.
class Deku extends Allmight{//コメントアウトは継承
//	protected int att;
//	protected String name;
//	public void huyu() {
//		System.out.println(this.name+"は浮遊した");
//	}
//	public void attack() {
//		System.out.println(this.name+"は敵に"+this.att+"のダメージを与えた");
//	}
//	public void power() {
//		System.out.println(this.name+"は超パワーを使った");
//	}
	public void loud() {
		System.out.println("かっちゃん！！！");
	}
	public Deku(int att,String name) {
//		this.name=name;//なぜ使えない
//		this.att=att;//なぜ使えない
		super(att,name);
	}
}

//二代目
class Allmight extends Shimura{//コメントアウトは継承
//	protected int att;
//	protected String name;
//	public void huyu() {
//		System.out.println(this.name+"は浮遊した");
//	}
//	public void attack() {
//		System.out.println(this.name+"は敵に"+this.att+"のダメージを与えた");
//	}
	public void power() {
		System.out.println(this.name+"は超パワーを使った");
	}
	public Allmight(int att,String name) {
		super(att,name);
	}
}



//一代目
class Shimura{
	protected int att;
	protected String name;
	public void huyu() {
		System.out.println(this.name+"は浮遊した");
	}
	public void attack() {
		System.out.println(this.name+"は敵に"+this.att+"のダメージを与えた");
	}
	public Shimura(int att,String name) {
		this.att=att;
		this.name=name;
	}
}