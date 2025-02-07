class Test implements Testable {
	public void display() {
		System.out.println("Displaying the Test class content");
	}
	public static void main(String[] args) {
		Test testObj = new Test();
		testObj.display();
	}
}