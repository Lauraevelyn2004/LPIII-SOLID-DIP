package model;

public class EmailSender implements Notifier {

	@Override
	public void notify(String message) {
		System.out.println(String.format("Novo e-mail \n%s\n", message));
	}
}
