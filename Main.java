import company.beans.Person;
import company.exceptions.InvalidAgeException;
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


        Person[] people = new Person[5];
        int b = 10;

        try {
            people[0] = new Person("John Doe", 30);
            people[1] = new Person("John AAA", 50);
            people[2] = new Person("John BBB", 45);
            people[3] = new Person("John CCC", 18);
            people[4] = new Person("John DDD", 120);

            for (Person person : people) {
                int newAge = person.getAge() + b;
                if (newAge > 125) {
                    System.out.println("ERROR:age after calculation exceeds the range " + person.getName() +" " + newAge);
                } else {
                    result = MathUtils.add(person.getAge(), b);
                messenger.sendMessage(person.getName() + " age before: " + person.getAge() + ", age after calculation: " + result);
                }
                
            }
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }



    }
}
