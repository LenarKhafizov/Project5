import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Person> generateClients() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Ленар", "Хафизов", 5));
        personList.add(new Person("Сергей", "Петров", 4));
        personList.add(new Person("Владимир", "Гуськов", 3));
        personList.add(new Person("Елена", "Якунина", 4));
        personList.add(new Person("Ирина", "Афанасьева", 3));
        return personList;
    }
    public static void main(String[] args) {
        System.out.println("Вас приветствует симулятор атракциона!");
        List<Person> clients = generateClients();
        Person client  = clients.get(0);
        System.out.println(client.name);
    }
}