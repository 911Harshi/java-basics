package generics;

public class GenericDemo {
	public static void main(String[] args) {
		Account<String> account = new Account<String>();
		account.setObj("sbi account");
		System.out.println("Account Name is "+account.getObj());

		Account<Integer> gpayAccount = new Account<>();
		gpayAccount.setObj(984569876);
		System.out.println("gpay account no is"+ gpayAccount.getObj());
	}

}
