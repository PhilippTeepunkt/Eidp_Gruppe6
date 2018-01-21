package Aufgabe2;

import java.util.Scanner;

public class DLListTest {
	
	private static DLList list1;
	private static String[] contents = {"Jan","Peter","Olaf","Felix","Max","Tim"};
	private static final String LINESEPARATOR = "\n--------------------------------------";

	public static void main(String[]args) {
		
		list1 = new DLList();
		for(String i : contents) {
			list1.add(i);
		}
		
		TestCase(list1);
	}
	
	private static void TestCase(DLList list){
		
		StringBuilder sb = new StringBuilder();
		
		try {
			System.out.println("Start TestCase!");
			System.out.println("--------------------");
			
		//display,add,get
			System.out.println("display, add(Alex,3) ,get(3) : ");
			sb.append(System.getProperty("line.separator"));
			list.display();
			list.add(3,"Alex");
			sb.append(list.get(3));
			
			sb.append(LINESEPARATOR);
			System.out.println(sb.toString());
			sb.delete(0,sb.length());
			
		//getFirst, removeFirst, getFirst
			sb.append("getFirst, removeFirst ,getFirst : ");
			sb.append(System.getProperty("line.separator"));
			sb.append(list.getFirst());
			sb.append(System.getProperty("line.separator"));
			list.removeFirst();
			sb.append(list.getFirst());
		
			sb.append(LINESEPARATOR);
			System.out.println(sb.toString());
			sb.delete(0,sb.length());
			
			
		//getLast, removeLast, getLast
			System.out.println("getLast, removeLast ,getLast : ");
			sb.append(System.getProperty("line.separator"));
			sb.append(list.getLast());
			sb.append(System.getProperty("line.separator"));
			list.removeLast();
			sb.append(list.getLast());
			
			sb.append(LINESEPARATOR);
			System.out.println(sb.toString());
			sb.delete(0,sb.length());
			
		//contains, remove, find
			System.out.println("contains Olaf, remove Olaf ,find Olaf : ");
			sb.append(System.getProperty("line.separator"));
			if(list.contains("Olaf")) {
				sb.append("Position: " +list.find("Olaf"));
				sb.append(System.getProperty("line.separator"));				
				list.remove("Olaf");
				sb.append(list.find("Olaf"));
			}
			else {
				System.out.println("Olaf nicht enthalten!");
			}
			
			sb.append(LINESEPARATOR);
			System.out.println(sb.toString());
			sb.delete(0,sb.length());
			
		//concat
			System.out.println("concat: ");
			Scanner sc = new Scanner(System.in);
			DLList list2 = new DLList();
			boolean another = true;
			System.out.println("Add some Names!");
			while(another) {
				list2.add(sc.next());
				System.out.println("Another one? (Y/N)");
				if(sc.next().equals("N")) {
					another = false;
				}
			}
			sc.close();
			list.concat(list2);
			
			sb.append(LINESEPARATOR);
			System.out.println(sb.toString());
			sb.delete(0,sb.length());
			
		//display,clear,display
			System.out.println("display, clear, display : ");
			list.display();
			System.out.print("\n");
			list.clear();
			list.display();	
			
			System.out.println("Test successful!");
		}
		catch(Exception e) {
			
			System.out.println("Test failed!");
			System.out.println(System.lineSeparator());
			System.out.println(e);
			
		}
		
	}
	
}