package model;

public class StringInvoiceFormatter implements InvoiceFormatter {
    @Override
    public String formatInvoice(Invoice invoice) {
        StringBuilder sb = new StringBuilder();
        sb.append("Invoice for customer: ").append(invoice.getCustomer()).append("\n");
        sb.append("Items:\n");
        for (Item item : invoice.getItems()) {
            sb.append("- ").append(item.getDescription())
              .append(", quantity: ").append(item.getQuantity())
              .append(", price: ").append(item.getPrice()).append("\n");
        }
        sb.append("Total: ").append(invoice.calculateTotal());
        return sb.toString();
    }
}
