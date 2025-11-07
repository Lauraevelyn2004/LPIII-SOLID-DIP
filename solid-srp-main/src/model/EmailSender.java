package model;

public class EmailSender implements Notifier {
    @Override
    public void notify(String contact, String formattedContent) {
        // Aqui pode implementar o envio real de email, mas por enquanto:
        System.out.println("Enviando e-mail para " + contact);
        System.out.println(formattedContent);
    }
}
