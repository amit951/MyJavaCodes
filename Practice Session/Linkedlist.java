package practice;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Linkedlist {
	
	Node head;
	static class Node {
		
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}}

		void display() {
			Node n = head;
			while (n != null) {
				System.out.println(n.data + "\n");
				n = n.next;
			}
		}

		public static void main(String[] args) {
			Linkedlist ll = new Linkedlist();
			ll.head = new Node(100);
			Node sec = new Node(200);
			Node thi = new Node(300);
			ll.head.next = sec;
			sec.next = thi;
			ll.display();
		}
	
}