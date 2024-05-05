package company.beans;


import company.exceptions.InvalidAgeException;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws InvalidAgeException {
       if(age < 0 || age > 125) {
           throw new InvalidAgeException("Provided age is out of range (0 - 125)");
       }

       this.name = name;
       this.age = age;
    }


    public String getName (){
        return name;
    }

    public void setName (String newName){
        this.name = newName;
    }

    public int getAge (){
        return age;
    }

    public void setAge (int newAge){
        this.age = newAge;
    }



}
