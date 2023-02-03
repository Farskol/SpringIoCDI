package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;
    private String surname;
    private int age;

//    @Autowired
//    public Person(Pet pet){
//        System.out.println("Person created");
//        this.pet = pet;
//    }

    public Person(){
        System.out.println("Person created!");
    }

    //pet -> setPet
    @Autowired
    @Qualifier("dog")
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }
    public void callYourPet(){
        System.out.println("Hello my lovely Pet!");
        this.pet.say();
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
}