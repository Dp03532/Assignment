
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Scanner;

	  
	// A node of chains 
	class HashNode
	{ 
	  private int age; 
	  private int Phonenumber; 
	  private String FName; 
	  private String Lname;
	  private int roomNumber;
	  private int size;
	  
	  private  HashNode[] hashArray;
	  private int arraySize;
	  private HashNode nonItem;
	  
	  

	  
	  public void displayTable(int size) {
		  arraySize = size;
		  hashArray = new HashNode[arraySize];
		  
	  }
	  
	  public void displayTable() {
		  System.out.println("Table: ");
		  for(int i=0;i<arraySize;i++) {
			  if(hashArray[i] != null)
				  System.out.println(hashArray[i].getKey()+" ");
			  else 
				  System.out.println(" ");
		  }
		  System.out.println(" "); 
		  
	  }
	  
	  public int hashFuc(int key)
	  {
		  return key % arraySize; // hashFunction
	  }
	  
	  public void insert(HashNode info) {
		
		 int key = info.getKey();  // this will extract the key 
		 int hashVal = hashFuc(key);  // this will hash the key
		 
		 while(hashArray[hashVal] != null && 
				         hashArray[hashVal].getKey() !=-1)
		 {
			++hashVal;  // will go to the next cell 
			hashVal %= arraySize;
		 }
	
		hashArray[hashVal] = info;  
	  }
	  
	  
	  
	  public HashNode delete(int key) 
	  {
		 int hashVal = hashFuc(key);
		 
		 while(hashArray[hashVal] != null)  // until empty cell
		 {
			 if(hashArray[hashVal].getKey()== key) {
				HashNode info = hashArray[hashVal];  // will save the item
				hashArray[hashVal] = nonItem;  // will delelte the item
				return info;// returns the information
			 }
				++hashVal;
				hashVal %= arraySize;
			 }
		 return null;  
	  }	
	  
	  
	
		   
	
	
	  
	  
	  public HashNode find(int key)
	  {
		 int hashVal = hashFuc(key);
		 
		 while(hashArray[hashVal] != null) {
			if(hashArray[hashVal].getKey() == key) 
				return hashArray[hashVal];
			hashVal %= arraySize;
		 }
		 return null; // cant find the item 
	  }
	  
	  
	  
	  public HashNode(int age, int Phonenumber, int roomNumber, String FName, String Lname) {
		  age = age;
		  Phonenumber = Phonenumber; 
		  roomNumber = roomNumber;
		  FName = FName;
		  Lname = Lname; 
		  
	  }
	  
	  public int getKey() {
		  return 0 ; 
		  
	  }  
	
}
	
	 class hashCode {
		  
		  public static void main(String [] args) {
			  
			  
			  
			  Scanner scan = new Scanner(System.in);
			  
			  System.out.println("Enter Full Name");
			  String Fname = scan.nextLine();
			 
			  
			  System.out.println("Enter Full Name");
			  String LName = scan.nextLine();
			  
			  System.out.println("Enter age");
			  int age  = scan.nextInt();
			  
			  System.out.println("Enter phone number");
			  int Phonenumber  = scan.nextInt();
			  
			  System.out.println("Enter roomnumber");
			  int roomNumber  = scan.nextInt();
			  
			  
			  
			 
			  Hashtable information = new Hashtable();
		  }
	}
