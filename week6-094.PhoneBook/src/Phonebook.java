/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Jeffrey
 */
public class Phonebook {
    private final ArrayList<Person> phonebook;
    
    public Phonebook() {
        this.phonebook = new ArrayList<Person>();
    }
    
    public void add(String name, String number) {
        this.phonebook.add(new Person(name, number));
    }
    
    public String searchNumber(String name) {
        for (Person person : phonebook) {
            if (person.getName().equals(name)) {
                return person.getNumber();
            }
        }
        return "number not known";
    }
    
    public void printAll() {
        for (Person person : phonebook) {
            System.out.println(person);
        }
    }
}
