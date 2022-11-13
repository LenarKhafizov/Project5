public class Person {
    protected String name;
    protected String surname;
    protected int ticketAmount;

    public Person (String name, String surname, int ticketAmount) {
        this.name = name;
        this.surname = surname;
        this.ticketAmount = ticketAmount;
    }
    public Person (String name, String surname) {
        this(name, surname,1);
    }
    public void ticketUsed() {
        ticketAmount--;
    }
    public boolean hasTicket() {
        return ticketAmount > 0;
    }
}
