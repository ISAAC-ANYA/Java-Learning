public class InvoiceTest {
    public static void main(String[] args) {

        Invoice invoice = new Invoice("12345", "Widget", 10, 12.5);


        System.out.println("Invoice Details:");
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price Per Item: $" + invoice.getPricePerItem());
        System.out.println("Invoice Amount: $" + invoice.getInvoiceAmount());


        invoice.setQuantity(5);
        invoice.setPricePerItem(15.0);


        System.out.println("\nUpdated Invoice Details:");
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price Per Item: $" + invoice.getPricePerItem());
        System.out.println("Updated Invoice Amount: $" + invoice.getInvoiceAmount());
    }
}