package view;

import model.EmailSender;
import model.Invoice;
import model.InvoiceFormatter;
import model.Item;
import model.Notifier;
import model.StringInvoiceFormatter;

public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("Cliente A");
        invoice.addItem(new Item("Produto 1", 10.0, 2));
        invoice.addItem(new Item("Produto 2", 20.0, 1));

        InvoiceFormatter formatter = new StringInvoiceFormatter();
        Notifier notifier = new EmailSender();

        String formattedInvoice = formatter.formatInvoice(invoice);
        notifier.notify("clientea@email.com", formattedInvoice);
    }
}