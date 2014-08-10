package oop.asg09;

public class Test {
	public static void main(String[] asrg){
		String[] a = {"car", "dog","bee","book", "class","public"};
		Integer[] I = {1,2,3,4,5,6,7,8,9};
		Double[] d = {1.1,1.3,3.4,5.6,2.9,4.5,6.7};
	    ArrayAlg.printArray(a);
	    ArrayAlg.printArray(a, 1, 5);
	    ArrayAlg.printArray(I, 2, 6);
	    ArrayAlg.printArray(d, 2, 5);
	    Pair<String> aa=ArrayAlg.maxTwo(a);
	    System.out.println(aa);
	}

}
