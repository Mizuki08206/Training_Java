package practice;

public class Exec {
	public static void main(String[] args) {
		Person player=new Person("みずき",100);
		Person enemy=new Person("ドラゴン",30);
		boolean turn=false;
		while(true) {
			int att;
			while(true) {//攻撃力の入力受付
				try {
					if(turn) {
						System.out.println("ドラゴンの攻撃！");
					}else {
						System.out.println("みずきの攻撃！");
					}
					System.out.println("ダメージは＞＞");
					att=new java.util.Scanner(System.in).nextInt();
					break;
				}catch(Exception e) {
					System.out.println("数値で入力してください");
				}
			}
			if(turn) {
				enemy.attack(player, att);
				if(!player.check()) {
					System.out.println(player.getName()+"は倒れた");
					System.out.println("ゲームオーバー");
					break;
				}
				turn=false;//ターンエンド
			}else {
				player.attack(enemy, att);
				if(!enemy.check()) {
					System.out.println(enemy.getName()+"は倒れた");
					System.out.println("ゲームクリア");
					break;
				}
				turn=true;//ターンエンド
			}
		}
	}
}
class Person{
	private String name;
	private int hp;
	public Person(String name,int hp) {
		this.name=name;
		this.hp=hp;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setHp(int hp) {
		this.hp=hp;
	}
	public String getName() {
		return this.name;
	}
	public int getHp() {
		return this.hp;
	}
	
	public boolean check() {//生き残りチェック
		if(this.hp<=0) {
			return false;
		}else {
			return true;//生き残り
		}
	}
	
	public void attack(Person ene,int att) {
		System.out.println(this.name+"の攻撃！"+ene.getName()+"に"+att+"のダメージ");
		ene.setHp(ene.getHp()-att);
		System.out.println(ene.getName()+"の残りhp："+ene.getHp());
	}
}