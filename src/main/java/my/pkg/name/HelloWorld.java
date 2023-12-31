package my.pkg.name;

public class HelloWorld {
	
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());
	}
	
	public String GetVersion() {
		Greeter greeter = new Greeter();
		return greeter.sayHello();
	}
}
