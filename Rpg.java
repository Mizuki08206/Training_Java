package practice;

import java.util.ArrayList;

public class Rpg {

	public static void main(String[] args) {
		Person1 enemy=new Person1("�h���S��",25);
		Person1 player=new Person1("�݂���",100);
		Warrior player2=new Warrior("���Ƃ�",80);
		
		boolean turn=false;//false�Ńh���S����s
		boolean win;
		while(true) {
			if(turn) {//�v���C���[�̃^�[��
				
				if(player.getAlive()) {
					player.attack(enemy);
					if(!enemy.check()) {//enemy���|�ꂽ��
						win=true;
						break;
					}
				}
				if(player2.getAlive()) {
					player2.attack(enemy);
					if(!enemy.check()) {//enemy���|�ꂽ��
						win=true;
						break;
					}
				}
				
				turn=false;//�^�[���G���h
				
			}else {//�G�l�~�[�̃^�[��
				enemy.attack(player);
				enemy.attack(player2);
				player.died();
				player2.died();
				
				if(!player.getAlive() && !player2.getAlive()){
					win=false;
					break;
				}
				
				turn=true;//�^�[���G���h
			}
			System.out.println("---trun chenge---");
		}
		if(win) {//���s����
			System.out.println(enemy.getName()+"�͓|�ꂽ�B");
			System.out.println("�Q�[���N���A");
		}else {
			System.out.println(player.getName()+"��"+player2.getName()+"�͓|�ꂽ");
			System.out.println("�Q�[���I�[�o�[");
		}
		
		//�ǉ��ۑ�7
		ArrayList<Person1> monsters=new ArrayList<>();
		monsters.add(new Person1("�S�u����",40));
		monsters.add(new Person1("�I�[�N",60));
		monsters.add(new Person1("�X���C��",30));
		monsters.get(1).attack(player2);
		player2.attack(monsters.get(1));
	}

}
class Warrior extends Person1{
	public Warrior(String name, int hp) {
		super(name, hp);
		
	}
	public void attack(Person1 target) {
		System.out.println(this.getName()+"�̍U���I"+target.getName()+"��30�̃_���[�W");
		target.setHp(target.getHp()-30);
		
		//������check()���g�p�����hp:-�Z��������
		boolean garbage=target.check();
		System.out.println(target.getName()+"�̎c��HP�F"+target.getHp());//�����̓�����ς�����
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
	public void died() {//player�p�̃��\�b�h
		if(this.hp<=0) {
			this.hp=0;
			this.alive=false;
		}
	}
	public boolean check() {//�����c��`�F�b�N
		if(this.hp<=0) {
			this.alive=false;
			this.hp=0;
			return false;
		}else {
			return true;//�����c��
		}
	}
	public boolean getAlive() {
		return this.alive;
	}
	
	public void attack(Person1 target) {
		System.out.println(this.name+"�̍U���I"+target.getName()+"��10�̃_���[�W");
		target.setHp(target.getHp()-10);
		boolean garbage=target.check();
		System.out.println(target.getName()+"�̎c��hp�F"+target.getHp());
	}
}