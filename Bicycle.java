package jp.practice.javastudy;

public class Bicycle {
	public static int count = 0;
	  private String name;
	  private String color;
	  private int distance = 0;
	  
	  Bicycle(String name, String color) {
	    this.name = name;
	    this.color = color;
	  }
	  
	  public void bicyclePrint() {
	    System.out.println("【自転車の情報】");
	    System.out.println("名前：" + this.name);
	    System.out.println("色：" + this.color);
	    System.out.println("走行距離：" + this.distance + "km");
	  }
	  
	  public void run(int distance) {
	    Bicycle.count += distance;
	    System.out.println("-----------------");
	    System.out.println(distance + "km走ります");
	    System.out.println("走行距離：" + Bicycle.count + "km");
	    
	  }

}
