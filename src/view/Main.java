package view;

import java.util.ArrayList;
import java.util.List;

import model.EmailSender;
import model.NotificationService;
import model.Notifier;
import model.SMSSender;
import model.WhatsAppSender;

public class Main {

	public static void main(String[] args) {
		
		// Esses dados poderiam estar vindo de um Banco de Dados
		List<Notifier> notifiers = new ArrayList<>();
		notifiers.add(new EmailSender());
		notifiers.add(new WhatsAppSender());
		
		NotificationService notificationService = new NotificationService(notifiers);
		notificationService.notifyUser("Seu código de acesso é @eac82");
		
		// Mudando os notificadores
		notifiers.clear();
		notifiers.add(new SMSSender());
		notificationService = new NotificationService(notifiers);
		notificationService.notifyUser("Seu código de acesso é @eac15");
	}
}