package practice;

import java.util.ArrayList;

public class Rpg {

	public static void main(String[] args) {
		
		boolean tmp=true;
		if(tmp) {
			System.out.println("true");
			tmp=false;//ifのなかで書き換えても間に合うのか
		}else {
			System.out.println("false");
		}
		
		Battle bt=new Battle();
		bt.q();
		
		
//		Person enemy=new Person("ドラゴン",25);
//		Person player=new Person("みずき",100);
//		Warrior player2=new Warrior("おとも",80);
//		
//		boolean turn=false;//falseでモンスター先行
//		boolean win;//勝敗
		
//		while(true) {
//			if(turn) {//プレイヤーのターン
//				
//				if(player.getAlive()) {
//					player.attack(enemy);
//					if(!enemy.check()) {//enemyが倒れたら
//						win=true;
//						break;
//					}
//				}
//				if(player2.getAlive()) {
//					player2.attack(enemy);
//					if(!enemy.check()) {//enemyが倒れたら
//						win=true;
//						break;
//					}
//				}
//				
//				turn=false;//ターンエンド
//				
//			}else {//エネミーのターン
//				enemy.attack(player);
//				enemy.attack(player2);
//				player.died();
//				player2.died();
//				
//				if(!player.getAlive() && !player2.getAlive()){
//					win=false;
//					break;
//				}
//				
//				turn=true;//ターンエンド
//			}
//			System.out.println("---trun chenge---");
//		}
//		if(win) {//勝敗判定
//			System.out.println(enemy.getName()+"は倒れた。");
//			System.out.println("ゲームクリア");
//		}else {
//			System.out.println(player.getName()+"と"+player2.getName()+"は倒れた");
//			System.out.println("ゲームオーバー");
//		}
		
		//追加課題7
//		ArrayList<Person> monsters=new ArrayList<>();
//		monsters.add(new Person("ゴブリン",40));
//		monsters.add(new Person("オーク",60));
//		monsters.add(new Person("スライム",30));
		
		//お題8
		//3体の敵、それぞれに対して攻撃をしたり、されたりするようにしましょう
		//敵を3体倒したらゲームクリアと表示させましょう
//		boolean flag=false;
//		for(int i=0;i<monsters.size();i++) {//すべてのモンスターを倒しきるまで
//			turn=false;
//			boolean wl;
//			while(true) {//1体ずつ倒していく
//				if(turn) {//プレイヤーのターン
//					if(player.getAlive()) {
//						player.attack(monsters.get(i));
//						if(!monsters.get(i).check()) {//enemyが倒れたら
//							wl=true;
//							break;
//						}
//					}
//					if(player2.getAlive()) {
//						player2.attack(monsters.get(i));
//						if(!monsters.get(i).check()) {//enemyが倒れたら
//							wl=true;
//							break;
//						}
//					}
//					turn=false;//ターンエンド
//					
//				}else {//モンスターのターン
//					monsters.get(i).attack(player);
//					monsters.get(i).attack(player2);
//					player.died();
//					player2.died();
//					
//					if(!player.getAlive() && !player2.getAlive()){
//						wl=false;
//						break;
//					}
//					turn=true;//ターンエンド
//				}
//				System.out.println("\n---trun chenge---\n");
//			}
//			if(wl) {//勝敗判定
//				System.out.println(monsters.get(i).getName()+"は倒れた。\n\n");
//				if(i==monsters.size()-1) {
//					flag=true;
//				}
//			}else {
//				System.out.println(player.getName()+"と"+player2.getName()+"は倒れた");
//				System.out.println("GAMEOVER");
//				break;
//			}
//		}
//		if(flag) {
//			System.out.println("GAMECLEAR!!!");
//		}
//		System.out.println("ゲーム終了；");
		
	}
}
//お題8
//3体の敵、それぞれに対して攻撃をしたり、されたりするようにしましょう
//敵を3体倒したらゲームクリアと表示させましょう
class Battle{
	public static void q() {
		//インスタンス化
//		Person player=new Person("みずき",100);
//		Warrior player2=new Warrior("おとも",80);
		ArrayList<Person> players=new ArrayList<>();
		players.add(new Person("みずき",100));
		players.add(new Warrior("おとも",80));
		ArrayList<Person> monsters=new ArrayList<>();
		monsters.add(new Person("ゴブリン",40));
		monsters.add(new Person("オーク",60));
		monsters.add(new Person("スライム",30));
		
		//攻撃相手は集中させる
		boolean win=false;
		boolean lose=false;
		boolean turn=false;
		int pnum=0;
		int mnum=0;
		while(true) {
			if(turn) {//trueでプレイヤー攻撃
				for(Person player:players) {
					if(player.getAlive()) {
						player.attack(monsters.get(mnum));//プレイヤーの攻撃
						if(!monsters.get(mnum).check()) {//HPが0になったなら
							System.out.println("\n"+monsters.get(mnum).getName()+"は倒れた\n");
							mnum++;//ターゲットを変更する
							if(mnum==monsters.size()) {
								win=true;
								break;
							}
						}
					}
				}
				
				turn=false;//ターンエンド
			}else {//falseでモンスター攻撃
				for(Person monster:monsters) {
					if(monster.getAlive()) {
						monster.attack(players.get(pnum));//モンスターの攻撃
						if(!players.get(pnum).check()) {//HPが0になったら
							System.out.println("\n"+players.get(pnum).getName()+"は倒れた\n");
							pnum++;//ターゲットの変更
							if(pnum==players.size()) {
								lose=true;
								break;
							}
						}
					}
				}
				
				turn=true;//ターンエンド
			}
			
			if(win) {//勝敗判定
				System.out.println("GAMECLEAR");
				break;
			}else if(lose) {
				System.out.println("GAMEOVER");
				break;
			}
			System.out.println("\n---turn change---\n");
		}
	}
}




class Warrior extends Person{
	public Warrior(String name, int hp) {
		super(name, hp);
		
	}
	public void attack(Person target) {
		int att=(int)(Math.random()*20+15);
		System.out.println(this.getName()+"の攻撃！"+target.getName()+"に"+att+"のダメージ");
		target.setHp(target.getHp()-att);
		
		//ここでcheck()を使用すればhp:-〇を避けれる
		boolean garbage=target.check();
		System.out.println(target.getName()+"の残りHP："+target.getHp());
	}
}
class Person{
	private String name;
	private int hp;
	private boolean alive=true;
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
//	public void died() {//player用のメソッド
//		if(this.hp<=0) {
//			this.hp=0;
//			this.alive=false;
//			System.out.println(this.name+"は倒れた");
//		}
//	}
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
	
	public void attack(Person target) {
		int att=(int)(Math.random()*20+1);
		System.out.println(this.name+"の攻撃！"+target.getName()+"に"+att+"のダメージ");
		target.setHp(target.getHp()-att);
		boolean garbage=target.check();
		System.out.println(target.getName()+"の残りhp："+target.getHp());
	}
}