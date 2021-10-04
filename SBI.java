abstract class Bank{
	abstract void OpenAccount();
	abstract void CloseAccount();	
	
}

class SBI extends Bank {
	void OpenAccount() {
		System.out.println("Open Account..");
	}
	void CloseAccount() {
		System.out.println("Close Account");
	}
	public static void main(String[] args) {
		Bank b = new SBI();
		b.OpenAccount();
		b.CloseAccount();
	}

}
