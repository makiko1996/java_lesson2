package jp.practice.javastudy;

class Staff {
	String name;
	int staffid;
	String email;
	
	public void sayhello() {
		System.out.print("Hello " + this.name);
	}
}

public class StaffInfo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Staff yamada = new Staff();
		yamada.name = "Taro Yamada";
		
		yamada.sayhello();

//		System.out.println(yamada.name);

	}

}
