enum Status {
	Running, Failed, Pending, Success;
}

enum Laptop {
	// Mackbook(2000), XPS(2200), Surface(1500), ThinkPad(1800);
	Mackbook(2000), XPS(2200), Surface, ThinkPad(1800);

	private int price;

	private Laptop() {
		price = 500;
	}

	private Laptop(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
		System.out.println("in Laptop" + this.name());
	}
}

public class Enum {

	public static void main(String[] args) {

		int i = 5;
		// Status s = Status.Running;
		// Status s = Status.Failed;
		// Status s = Status.NoIdea;
		// Status s = Status.Success;

		// System.out.println(s);
		// System.out.println(s.ordinal());

		Status[] ss = Status.values();
		System.out.println(ss);

		for (Status s : ss) {
			System.out.println(s);
			System.out.println(s + " : " + s.ordinal());
		}

		// Laptop lap = Laptop.Mackbook;
		// System.out.println(lap + " : " + lap.getPrice());

		for (Laptop lap : Laptop.values()) {
			System.out.println(lap + " : " + lap.getPrice());
		}

	}

}
