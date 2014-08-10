package oop.asg09;

public class Node {
	Item data;
	Node next; //refers to the next item in the list
	Node (Item data) {
	this.data = data.clone();  // deep copy
	}
	
	Node(Item data,Node node){
		this.data=data;
		next=node;
	}

}
