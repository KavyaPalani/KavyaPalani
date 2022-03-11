package week3.Day1.Assignment;

public class AxisBank {

	public void deposit() {
		System.out.println("Deposit Axis :13000");
	}
	public static void main(String[] args) {
		BankInfo bank=new BankInfo();
		bank.deposit();
		AxisBank axis=new AxisBank();
		axis.deposit();
	}

}
