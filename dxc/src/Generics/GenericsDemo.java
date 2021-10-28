package Generics;

public class GenericsDemo {
	public static void main(String[] args) {
	
		Account<Integer> gpayAccount = new Account<>();
		gpayAccount.setObj(984569876);
		System.out.println("gpay account no is"+ gpayAccount.getObj());

		Account <Float> phonePeAccount = new Account<>();
		phonePeAccount.setObj(3.14f);
		System.out.println("phonepay account no is"+ phonePeAccount.getObj());
	}
}
