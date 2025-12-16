package model;

public class SMSSender implements Notifier {

	@Override
	public void notify(String message) {
		System.out.println(String.format("Nova SMS \n%s\n", message));
	}
}
