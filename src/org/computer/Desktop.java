package org.computer;

public class Desktop extends Computer {
public void desktopSize() {
	System.out.println("Desktop size: 22inch");
}
public static void main(String[] args) {
	Desktop D =new Desktop();
	D.computerModel();
	D.desktopSize();
}
}
