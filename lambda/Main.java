package lambda;

public class Main {

	public static void main(String[] args) {
		Greeting addMe = (int a, int b) -> a + b;

		HelloWorld hi = new HelloWorld();
		hi.getHello();
		MyFirstLambda justPrint = () -> System.out.println("Hello world " + addMe.addMe2(2, 4));
		justPrint.foo();

		HelloWorld annonimus = new HelloWorld() {
			public void getHello() {
				System.out.println("Hello annonimus ");
			}
		};
		annonimus.getHello();
		StringLengthLambda typeInterface = s -> s.length();
	}

	@FunctionalInterface
	interface MyFirstLambda {
		void foo();
	}

	@FunctionalInterface
	interface Greeting {
		int addMe2(int a, int b);
	}

	@FunctionalInterface
	interface StringLengthLambda {
		int getLength(String s);
	}

}
