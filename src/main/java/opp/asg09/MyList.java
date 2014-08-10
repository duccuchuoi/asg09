package oop.asg09;



public class MyList<T>  implements Item{
	
	private Node first;
	private Node last;
	public MyList(){
		first=last=null;
	}
	
	public void append(Item insertItem){
		if(isEmpty()){
			first=last=new Node(insertItem,null);
		}
		else{
			last=last.next=new Node(insertItem,null);
		}
	}
	
	public void appendList(MyList mylist){
		if(isEmpty()){
			first=last=new Node(mylist,null);
		}
		else {
			last=last.next=new Node (mylist,null);
		}
		
	}
	
	public int length(){
		Node current=first;
		int count=0;
		while(current!=null){
			count=count+1;
		}
		return count;
	}
	
	
	
	
	public void invert(){
		Node a=null;
		Node b=null;
		while(first!=null){
			b=first;
			b=b.next;
			b.next=a;
			a=b;
		}
		first=b;
	}

	public void print(){
		if(isEmpty()){
			System.out.println(first.data.toString());
		}
		Node current=first;
		while(current!=null){
			System.out.println(current.data.toString());
			current=current.next;
		}
		System.out.println("\n");
	}
	
	private boolean isEmpty() {
		return first==null;
	}
	
	public Item clone(){
		return new MyList();
	}
	
	public String toString (){
		return ""+first.data.toString();
	}

	@Override
	public boolean equals(MyList mylist) {
		// TODO Auto-generated method stub
		return false;
	}
}