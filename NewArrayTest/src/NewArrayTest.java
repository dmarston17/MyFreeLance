
public class NewArrayTest {
	
	//Java Program to illustrate how to declare, instantiate, initialize  
	//and traverse the Java array.  
	static class Testarray{  
	public static void main(String args[]){  
	int a[]=new int[5];  //declaration and instantiation  
	a[0]=10;  //initialization  
	a[1]=20;  
	a[2]=70;  
	a[3]=40;  
	a[4]=50;  
	//traversing array  
	for(int i=0;i<a.length;i++)  //length is the property of array  
	System.out.println(a[i]);  
	}
	
	}

}

//need to read up more on OOP, linkedlist, arrayList.



//success organization - proactive role - working with customers - helping grow the business and onboarding

//reactive role - troubleshooting

//take home assignment in java

/*
 *6.Using the language of your choosing, complete the following coding tasks.
 
1. Write code that will loop from 0 to x and performs the following:
•	On iterations that are evenly divisible by 3, print “foo”
•	On iterations that are evenly divisible by 5, print “bar”
•	On iterations that are evenly divisible by both 3 and 5, print “foobar”
 
2. Write code that will alphabetically sort an array of strings, for example ["banana", "apple", "pear", "cherry"]
 
3. Given a hash with strings for keys and an array of strings for values, write code that will search the values to find a certain string and prints the keys when matched. 
For example, given this hash (in Ruby syntax):
{
  "colors" => ["red", "blue", "orange"],
  "animals" => ["dog", "cat", "horse"],
  "fruits" => ["apple", "orange", "banana"]
}
If asked to search for “orange”, your code should print out:
colors
fruits  */
