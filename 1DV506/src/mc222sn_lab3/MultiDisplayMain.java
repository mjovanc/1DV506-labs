package mc222sn_lab3;

public class MultiDisplayMain {

	public static void main(String[] args) {
		MultiDisplay md = new MultiDisplay();
		
		md.setDisplayMessage("Hello World!");
		md.setDisplayCount(2);
		
		md.display();
		md.display("Goodbye cruel world!", 6);
		
		System.out.println("Current msg: " + md.getDisplayMessage());
	}

}
