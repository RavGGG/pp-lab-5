import company.beans.Person;
import company.implementations.EmailMessenger;

public class Main {
    public static void main(String[] args) {

        EmailMessenger messenger = new EmailMessenger();
        messenger.sendMessage("Test message");


        
        try {
            Person person = new Person("Adam",33);
            System.out.println(person.getAge() + " age is ok");
        } catch (Exception e) {
            System.out.println(e);
        }


        try {
            Person person = new Person("Rafał", 130);
            System.out.println(person.getAge() + " age is ok");
        }  catch (Exception e) {
            System.out.println(e);
        }





    }
}
