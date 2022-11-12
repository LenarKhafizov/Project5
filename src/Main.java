import java.util.*;

public class Main {

    public static ArrayList<Person> generateClients() {
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Ленар", "Хафизов", 5));
        personList.add(new Person("Сергей", "Петров", 4));
        personList.add(new Person("Владимир", "Гуськов", 3));
        personList.add(new Person("Елена", "Якунина", 3));
        personList.add(new Person("Ирина", "Афанасьева"));
        return personList;
    }
    public static void main(String[] args) {
        System.out.println("\t Вас приветствует симулятор атракциона!");
        ArrayList<Person> clients = generateClients();
        Queue<Person> queue = new LinkedList<>();
        queue.offer(clients.get(0));
        queue.offer(clients.get(1));
        queue.offer(clients.get(2));
        queue.offer(clients.get(3));
        queue.offer(clients.get(4));
        while (true) {
            Person client = queue.poll();
            System.out.println(client.name + " " + client.surname + " прокатился(-ась) на атракционе.");
            if (client.ticketUsed()){
                queue.offer(client);
           }
           if (queue.size() == 0) {
               break;
           }
        }
    }
}