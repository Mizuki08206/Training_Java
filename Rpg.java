package practice;

import java.util.ArrayList;

public class Rpg {

	public static void main(String[] args) {
		Person1 enemy=new Person1("ドラゴン",25);
		Person1 player=new Person1("みずき",100);
		Warrior player2=new Warrior("おとも",80);
		
		boolean turn=false;//falseでドラゴン先行
		boolean win;
		while(true) {
			if(turn) {//プレイヤーのターン
				
				if(player.getAlive()) {
					player.attack(enemy);
					if(!enemy.check()) {//enemyが倒れたら
						win=true;
						break;
					}
				}
				if(player2.getAlive()) {
					player2.attack(enemy);
					if(!enemy.check()) {//enemyが倒れたら
						win=true;
						break;
					}
				}
				
				turn=false;//ターンエンド
				
			}else {//エネミーのターン
				enemy.attack(player);
				enemy.attack(player2);
				player.died();
				player2.died();
				
				if(!player.getAlive() && !player2.getAlive()){
					win=false;
					break;
				}
				
				turn=true;//ターンエンド
			}
			System.out.println("---trun chenge---");
		}
		if(win) {//勝敗判定
			System.out.println(enemy.getName()+"は倒れた。");
			System.out.println("ゲームクリア");
		}else {
			System.out.println(player.getName()+"と"+player2.getName()+"は倒れた");
			System.out.println("ゲームオーバー");
		}
		
		//追加課題7
		ArrayList<Person1> monsters=new ArrayList<>();
		monsters.add(new Person1("ゴブリン",40));
		monsters.add(new Person1("オーク",60));
		monsters.add(new Person1("スライム",30));
		monsters.get(1).attack(player2);
		player2.attack(monsters.get(1));
	}

}
class Warrior extends Person1{
	public Warrior(String name, int hp) {
		super(name, hp);
		
	}
	public void attack(Person1 target) {
		System.out.println(this.getName()+"の攻撃！"+target.getName()+"に30のダメージ");
		target.setHp(target.getHp()-30);
		
		//ここでcheck()を使用すればhp:-〇を避けれる
		boolean garbage=target.check();
		System.out.println(target.getName()+"の残りHP："+target.getHp());//ここの動きを変えたい
	}
}
class Person1{
	private String name;
	private int hp;
	private boolean alive=true;
	public Person1(String name,int hp) {
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
	public void died() {//player用のメソッド
		if(this.hp<=0) {
			this.hp=0;
			this.alive=false;
		}
	}
	public boolean check() {//生き残りチェック
		if(this.hp<=0) {
			this.alive=false;
			this.hp=0;
			return false;
		}else {
			return true;//生き残り
		}
	}
	public boolean getAlive() {
		return this.alive;
	}
	
	public void attack(Person1 target) {
		System.out.println(this.name+"の攻撃！"+target.getName()+"に10のダメージ");
		target.setHp(target.getHp()-10);
		boolean garbage=target.check();
		System.out.println(target.getName()+"の残りhp："+target.getHp());
	}
}