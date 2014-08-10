package oop.asg09;

public class testMyList {
	public static void main(String[] asrg){
		MyList<String> a = new MyList<String>();
		a.append(new StringItem("a"));
		a.append(new StringItem("b"));
		a.print();
	}

}
