package overloadingOverriding;

public class Parent {
	public void greeting() {
		System.out.println("Hi");
	}

	public void welcome(String name) {
		System.out.println("Welcome " + name);

	}

	public static class Child extends Parent {
		@Override
		public void greeting() {
			System.out.println("Hello");
		}

		public void welcome(String name, String country) {
			System.out.println("Welcome " + name + "from " + country);
		}

		public static void main(String[] args) {
Parent p=new Child();
p.welcome("Gita.....");
//p.welcome("giriraj","Nepal");
p.greeting();


		}
	}
}