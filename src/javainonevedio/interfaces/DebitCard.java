package javainonevedio.interfaces;

class DebitCard implements Payment {
    public void pay(double amount) {
        System.out.println("Debited amount  " + amount);
    }
}
