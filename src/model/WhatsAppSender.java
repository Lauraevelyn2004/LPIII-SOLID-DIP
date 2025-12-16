package model;

public class WhatsAppSender implements Notifier {

	@Override
	public void notify(String message) {
		System.out.println(String.format("Nova mensagem de WhatsApp \n%s\n", message));
	}
}
