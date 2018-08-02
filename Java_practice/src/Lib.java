
public class Lib {
	private String abc;

	public static void main(String[] args) {
		Book b1 = new Book("Sachin untold story");
		System.out.println(b1.getbookname());
		Member m1 = new Member("Dhiren");
		System.out.println(m1.getmember());
	}

	public String getmember() {
		return this.abc;
	}
}
