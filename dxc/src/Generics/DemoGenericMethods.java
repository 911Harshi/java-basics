package Generics;

public class DemoGenericMethods {
	public static <E> void printarray(E[] elements) {
         for(E element : elements) {
        	 System.out.println(element);
        	 
         }
         System.out.println();
}
	public static void main(String[] args) {
	Integer[] intArray = {1,4,7,8,9};
	Character[] charArray= {'a','b','c','d','e'};
	printarray(intArray);
	printarray(charArray);
	}
}

