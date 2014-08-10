package oop.asg09;

public class TestPair {
	public static void main(String [] arsg){
		Pair<String> S = new Pair<String>("Dog", "Car");
		
		Pair<Integer> I = new Pair<Integer>(1,2);
		
		S.toString();
		I.toString();
		System.out.println(S);
		System.out.println(I);

	}

}
