package javainonevedio.interfaces;

class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("The amount paid by credit card  " + amount);
    }
}
