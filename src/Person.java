public class Person {
    protected String name;
    protected String surname;
    protected int bookAmount;

    public Person (String name, String surname, int bookAmount) {
        this.name = name;
        this.surname = surname;
        this.bookAmount = bookAmount;
    }
    public Person (String name) {
        this(name, "",0);
    }
}
