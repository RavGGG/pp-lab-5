import company.beans.Person;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {

        int result = MathUtils.add(10, 7);
        
         



        EmailMessenger messenger = new EmailMessenger();
        messenger.sendMessage("the sum is " + result);


        
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
