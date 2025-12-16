package model;

import java.util.List;

public class NotificationService {

	private List<Notifier> notifiers;
	
	public NotificationService(List<Notifier> notifiers) {
		this.notifiers = notifiers;
	}

	public void notifyUser(String message) {
		for (Notifier notifier : notifiers)
			notifier.notify(message);
	}
}
