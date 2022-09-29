package practice;

import java.util.HashMap;

public class Day0929 {

	public static void main(String[] args) {
		//マルチスレッドの処理
//		Thread t = new Thread() {
//			public void run() {
//				for (int i = 0; i < 3; i++) {
//					System.out.println("新しいスレッドのタスク");
//				}
//			}
//		};
//		t.start();
//		for(int i=1;i<10;i++) {
//			System.out.println("-----"+i+"-----");
//		}
//		System.out.println("メインスレッド終了");
		
//		Q1.q1();
//		Q2.q2();
//		Q3.q3();
//		Q4.q4();
//		Q5.q5();
//		Q6.q6();
//		Q7.q7();
//		Q8.q8();
//		Q9.q9();
//		Q10.q10();
//		Student.stu();
	}

}
//デジタルテキスト第六回練習問題１
class Student{
	public static void stu() {
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(101, "佐藤");
		hm.put(102, "鈴木");
		hm.put(103, "高橋");
		hm.put(104, "田中");
		hm.put(105, "渡辺");
		for(Integer key:hm.keySet()) {//キーの配列
			System.out.println(key);
		}
		System.out.println(hm.keySet());
		//[101, 102, 103, 104, 105]
		System.out.println(hm.values());
		//[佐藤, 鈴木, 高橋, 田中, 渡辺]
		System.out.println(hm.entrySet());
		//[101=佐藤, 102=鈴木, 103=高橋, 104=田中, 105=渡辺]
		while(true) {
			try {
				System.out.println("番号を入力してください");
				int num=new java.util.Scanner(System.in).nextInt();
				if(num==0) {
					System.out.println("終了します");
					break;
				}
				if(hm.get(num)!=null) {
					System.out.println(hm.get(num));
				}else {
					System.out.println("その番号の生徒はいません");
				}
			}catch(Exception e) {
				System.out.println(e);
				System.out.println("数値を入力してください");
			}
		}
	}
}



//オンライン集合研修の問題
class Q1{//出たサイコロの目に対する裏の目の出力
	public static void q1() {
		try {
			System.out.println("さいころの目を入力してください");
			int in=new java.util.Scanner(System.in).nextInt();
			if(in<1 || 6<in) {
				System.out.print("1～6で入力してください");
			}else {
				System.out.println("裏の目は:"+(7-in));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
class Q2{//与えた整数から、1までのカウントダウン
	public static void q2() {
		try {
			System.out.println("整数を入力してください");
			int num=new java.util.Scanner(System.in).nextInt();
//			for(int i=num;i>0;i--) {
//				System.out.println(i);
//			}
			while(num>0) {
				System.out.println(num);
				num--;
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
class Q3{//与える秒数を分数に変換する。出力は整数
	public static void q3() {
		try {
			System.out.println("秒数を入力してください");
			int num=new java.util.Scanner(System.in).nextInt();
			System.out.print((num/60)+"分"+(num%60)+"秒");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
class Q4{//宅配の送料を計算する。手数料は一律500円で、6kg未満無料、6kg以上は1kgごとに100円加算
	public static void q4() {
		try {
			int fee=500;//手数料
			int sum=fee;
			System.out.println("重量を入力してください");
			int num=new java.util.Scanner(System.in).nextInt();
			if(num<0) {
				System.out.println("正の数ではない");
		    }else if(num<6) {
				System.out.println("¥"+sum);
			}else {
				sum+=(num-5)*100;
				System.out.println("¥"+sum);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
class Q5{//2つの英単語の文字列の長さが一致すれば〇、一致しなければ×
	public static void q5() {
		String[][] array= {{"code","data"},{"apple","orange"},{"peach","grape"}};
		for(int i=0;i<array.length;i++) {
			if(array[i][0].length()==array[i][1].length()) {
				System.out.println("〇");
			}else {
				System.out.println("×");
			}
		}
		System.out.println(array.length);
		System.out.println(array[0].length);
	}
}
class Q6{//与えられる直径から、その円の円周の長さと面積を出力。小数点第二位以下は切り捨て
	public static void q6() {
		try {
			System.out.println("直径を入力してください");
			double full=new java.util.Scanner(System.in).nextInt();
			double len=full*3.14;
			double area=(full/2)*(full/2)*3.14;
			
			System.out.print(Math.floor(len*10)/10+","+Math.floor(area*10)/10);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
class Q7{//食事会の予算を計算して、金額と人数の合計の出力
	public static void q7() {
		try {
			int sum=0;
			for(int i=0;i<3;i++) {
				System.out.print("金額を入力してください>>");
				int money=new java.util.Scanner(System.in).nextInt();
				System.out.print("人数を入力してください>>");
				int num=new java.util.Scanner(System.in).nextInt();
				sum+=money*num;
			}
			System.out.println("¥"+sum);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
class Q8{//生産数と不良品数をもとに、不良率を計算する。%で表示し、小数点第二位以下を切り捨てる。
	public static void q8() {
		try {
			System.out.print("生産数は>>");
			double p=new java.util.Scanner(System.in).nextDouble();
			System.out.print("不良品数は>>");
			double dp=new java.util.Scanner(System.in).nextDouble();
			double ans=dp/p*100;
//			System.out.println(p);
//			System.out.println(dp);
//			System.out.println(ans);
			System.out.println(Math.floor(ans*10)/10+"%");
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
class Q9{//タクシーの運賃を計算する。初乗りが410円で、300mごとに90円加算
	public static void q9() {
		try {
			final int first=410;
			int dis=new java.util.Scanner(System.in).nextInt();
			int money=dis/300*90;
			System.out.println("¥"+(money+first));
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
class Q10{//バッティングのスコア。5球以上で初級、2～5で中級、2未満で上級
	public static void q10() {
		try {
			System.out.println("ストライクの数(0~10)>>");
			int strike=new java.util.Scanner(System.in).nextInt();
			if(strike<0 || 10<strike) {
				System.out.println("0~10の整数を入力してください");
			}else {
				if(strike>=5) {
					System.out.println("初級");
				}else if(strike>=2) {
					System.out.println("中級");
				}else {
					System.out.println("上級");
				}
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}


















