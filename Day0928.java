package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Tmp0928 {

	public static void main(String[] args) {
//		Writer.write();
//		Reader.read();
//		Operator.operate();
		Tmp0928 ob=new Tmp0928();
		Imagine im=ob.new Imagine(100,"toyota");
	}
	//インナークラスのインスタンスは外部クラスのインスタンスを生成していないと生成することができない。
	//外部クラスでも外部クラスのインスタンスを生成していないと作れない。
	public class Imagine{//インナークラスだとpublicをつけることができる。
		private int speed;
		private String name;
		public Imagine(int speed,String name) {
			this.speed=speed;
			this.name=name;
		}
		public void drive() {
			System.out.println(this.name+"は"+this.speed+"km/hで走った。");
		}
	}
}
//デジタルテキスト第5回練習問題１
class Writer {
	public static void write() {
		//パスはJavaプロジェクトからの相対パス
		try (BufferedWriter out = new BufferedWriter(new FileWriter("src/practice/data.txt"));) {
			String[] data = { "apple", "banana", "orange" };
			for (String str : data) {
				out.write(str);
				out.newLine();
				System.out.println("入力中...");
			}
			System.out.println("処理終了しました");
		} catch (Exception e) {
			System.out.println(e);//この二つ何が違う？
			System.err.println(e);
		}
	}
}
//デジタルテキスト第5回練習問題２
class Reader{
	public static void read() {
		try(BufferedReader in=new BufferedReader(new FileReader("src/practice/data.txt"));){
			String s;
			while((s=in.readLine())!=null) {
				System.out.println(s);
			}
		}catch (Exception e) {
			System.out.println(e);//この二つ何が違う？
			System.err.println(e);
		}
	}
}
//デジタルテキスト第5回練習問題３
class Operator{
	public static void operate() {
		StringBuilder sb=new StringBuilder();
		while(true) {
			try {
				System.out.print("数値>>");
				int in=new java.util.Scanner(System.in).nextInt();
				if(in==0) {
					System.out.println(sb);
					System.out.println("終わります。");
					break;
				}else {
					sb.append(in);
				}
			}catch(Exception e){
				System.out.println("整数を入力してください");
				System.out.println(e);
			}
		}
	}
}