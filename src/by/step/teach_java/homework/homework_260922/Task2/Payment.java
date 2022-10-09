package by.step.teach_java.homework.homework_260922.Task2;

public abstract class Payment {
    String paymentTypeName;
    int tax;
    int childrenTax;

    public void setChildrenTax(int childrenTax) {
        if (childrenTax > 0) {
            this.childrenTax = 0;
        } else {
            this.childrenTax = 7;
        }
    }

    public abstract double calculateOfPayment (int payment);

    public abstract double calculateOfPaymentWithoutTax (int payment);

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    @Override
    public String toString() {
        return paymentTypeName +
                ANSI_RED + " Налог общий = " + (tax + childrenTax) + ANSI_RESET +
                ANSI_PURPLE + " в т.ч детские = " + childrenTax + ANSI_RESET;
    }
}
