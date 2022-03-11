package org.system;

public class Desktop {

	public void desktopSize() {
		System.out.println("Desktop Size : 5");
	}
	public static void main(String[] args) {
		Computer com=new Computer();
		com.computerModel();
		Desktop desk=new Desktop();
		desk.desktopSize();
	}

}
