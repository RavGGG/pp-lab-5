import company.beans.Person;

public class Main {
    public static void main(String[] args) {
        
        try {
            Person person = new Person("Adam",33);
            System.out.println("It's ok");
        } catch (Exception e) {
            System.out.println(e);
        }


        try {
            Person person = new Person("Rafał", 130);
        }  catch (Exception e) {
            System.out.println(e);
        }




    }
}
