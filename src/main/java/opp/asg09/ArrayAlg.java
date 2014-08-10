package oop.asg09;

public class ArrayAlg {
	
	public static<T> void printArray(T[] a){
		if(a==null||a.length==0){
			System.out.println("mang khong ton tai hoac khong co gia tri nao");
		}
		else{
			System.out.println("Mang a la: ");
			for(int i=0;i<a.length;i++){
				System.out.println(" "+a[i]);
			}
		}
	}
	
	public static<T> void printArray(T[] a, int start, int end){
		int count=0;
		if(start>end||start>=a.length){
			System.out.println(" loi ");
		}
		
		if(a==null||a.length==0){
			System.out.println("mang khong ton tai hoac khong co gia tri nao");
		}
		else{
			System.out.println("Mang a la tu "+(start+1)+" den "+end+" la:");
			for(int i=start;i<end;i++){
				count=count+1;
				System.out.println(" "+a[i]);
		    }
			System.out.println("so phan tu yen ra la:"+count);
		}
		
	}
	
	public static <T extends Comparable > Pair<T> maxTwo(T[] a){
		if(a==null||a.length==0) {
			return null;
		}
		T max = a[0];
		for(int i = 1;i<a.length;i++){
			if(max.compareTo(a[i])<0) max = a[i];
		}
		return new Pair<T> (max,null);
	}

}
