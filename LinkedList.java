
import java.util.Scanner;
public class LinkedList {
	static Node head;
static Scanner s=new Scanner(System.in);
	static class Node {
		int id;
		
		String firstname = "", lastname = "",phone="";
		Node next;

		Node(String f, String l, int i, String p) {
			id = i;
			phone = p;
			firstname = f;
			lastname = l;
		}
	}

	// add node at end
	public static void append(String f, String l, int i, String p) {
		Node new_node = new Node(f, l, i, p);
		if (head == null) {
			head = new Node(f, l, i, p);
			return;
		}
		new_node.next = null;
		Node last = head;
		while (last.next != null)
			last = last.next;

		last.next = new_node;
		return;
	}

	// View the whole list
	public static void showlist() {
		Node n = head;
		int counter = 1;
		if(n==null){System.out.println("List is empty");return;}
		while (n != null) {
			System.out.println("--> " + counter + "\nID = " + n.id
					+ "\nFirst Name : " + n.firstname + "\nLast Name  : "
					+ n.lastname + "\nContact # : " + n.phone);
			n = n.next;
			counter = counter + 1;
		}
	}
	
	// delete the node
	
	public static void deleteNode(int i){
		Node temp=head,prev=null;
		if (temp==null){
			System.out.println("List is empty");
			return;
			}
		else if(temp!=null && temp.id==i){
			head=temp.next;
			return;
		}
		else {
			temp=head;
			while(temp.id!=i){
			prev=temp;
			temp=temp.next;
		}
			//System.out.println("prev :"+prev.id);
			//System.out.println("prev :"+temp.id);
			
			if(temp.next!=null)
		prev.next=temp.next;
			else
				prev.next=null;
			
		}
		
	}
	
// shuffle position
	
	public static void shuffle(int d,int x){
		
		if(head==null){
			System.out.println("No record found..");
			return;
		}
		Node prev=head;
		Node temp,remaining,current = null,tobechange;
		int len,counter=0;
		while(prev.id!=d){counter++;prev=prev.next;}
		
		tobechange=prev;
		
if(x==1){
		deleteNode(d);
		temp=head;
		head=tobechange;
		tobechange.next=temp;
		}
else if(x!=1){
	deleteNode(d);
	temp=head;
	for(int i=1;i<x;i++){
		current=temp;
		temp=temp.next;
	}
	remaining=current.next;
	tobechange.next=remaining;
	current.next=tobechange;
	}
	}
	
	// update record
	public static void update(int d){
		
		Node temp=head;
		while(temp.id!=d)
			temp=temp.next;
		
		if(temp.id!=d){
			System.out.println("\nRecord not found");
			return;
		}
		else{
			System.out.println("Enter updated first name :");
			temp.firstname=s.next();
			System.out.println("Enter updated last name :");
			temp.lastname=s.next();
			System.out.println("Enter updated Contact# :");
			temp.phone=s.next();
		}
		
		
	}
	
	// delete from last
	public static void lastdel(int num){
		Node temp=head;
		if(temp==null){System.out.println("List is empty");return;}
		if(temp.next==null && num>=1){temp=null;head=null;}
		//System.out.println("length : "+length());
		else{
		for(int i=1;i<(length()-num);i++){
			temp=temp.next;
		}
		temp.next=null;
		}
	}
	
	// Linked list length
	public static int length(){
		Node temp=head;
		int count=0;
		while(temp != null){
			count++;
			temp=temp.next;
		}
		return count;
	}
}
