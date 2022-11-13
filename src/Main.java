import java.util.*;

public class Main {

    public static List<Person> generateClients() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Ленар", "Хафизов", 5));
        personList.add(new Person("Сергей", "Петров", 4));
        personList.add(new Person("Владимир", "Гуськов", 3));
        personList.add(new Person("Елена", "Якунина", 3));
        personList.add(new Person("Ирина", "Афанасьева"));
        return personList;
    }
    public static void main(String[] args) {
        System.out.println("\t Вас приветствует симулятор атракциона!");
        List<Person> clients = generateClients();
        Queue<Person> queue = new LinkedList<>();
        for (Person person : clients) {
            queue.offer(person);
        }
        do {
            Person client = queue.poll();
            System.out.println(client.name + " " + client.surname + " прокатился(-ась) на атракционе.");
            client.ticketUsed();
            if (client.hasTicket()) {
                queue.offer(client);
            }
        } while (queue.size() != 0);
    }
}