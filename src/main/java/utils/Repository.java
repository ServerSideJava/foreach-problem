package  utils;
import lombok.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Repository implements Iterable<Person> {


    @Setter
    String repo_name;

    public String getRepo_name() {
        return repo_name;
    }

    public Repository(String repo_name) {
        this.repo_name = repo_name;
    }

    Set<Person> studentSet = new HashSet<>();
    public int CountStudent(){
        return studentSet.size();
    }
    public void add(Person student){
        studentSet.add(student);

    }

    public Set<Person> getStudentSet() {
        return studentSet;
    }

    public void remove(int id){
        Person personToRemove = null;
        for(Person person : studentSet){
            if(person.getId() == id){
                personToRemove = person;
            }

        }
        if(personToRemove == null){
            System.out.println("Not found id ");
        }
        else{
            studentSet.remove(personToRemove);
        }
    }

    @Override
    public Iterator<Person> iterator() {
        return studentSet.iterator();
    }
}
