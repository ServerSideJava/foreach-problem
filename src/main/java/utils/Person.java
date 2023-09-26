package utils;




import java.util.Objects;


public class Person {


    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    int id;
    String name;
    String lastname;
    double gpax;

    public Person(int id,String name,String lastname,double gpax) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.gpax = gpax;

    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public double getGpax() {
        return gpax;
    }

    public void setGpax(double gpax) {
        this.gpax = gpax;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
