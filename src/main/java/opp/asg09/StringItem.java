package oop.asg09;



public class StringItem implements Item{
	
	private String value;
	
	public StringItem(String value){
		this.value=value;
	}
	
	
	public Item clone(){
		return null;
	}
	
	public String toString(){
		return value;
	}


	@Override
	public boolean equals(MyList mylist) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
