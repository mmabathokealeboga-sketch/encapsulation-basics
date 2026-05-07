package ritmo.com.mentee.encapsulation;

public class Person {
    private String name;
    private int age;
    private String email;

    public  Person(String newName,int newAge,String newEmail){
        name = newName;
        age = newAge;
        email = newEmail;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getEmail(){
        return email;
    }
    public Person(Person newPerson){
        name = newPerson.name;
        age = newPerson.age;
        email = newPerson.email;
    }
    public Person(){}

    public void setName(String newName){
        if (newName == null || newName.isEmpty()) throw new IllegalArgumentException();
        name = newName;
    }
    public void setAge(int newAge){
        if (newAge < 0 || newAge >150) throw new IllegalArgumentException();
        age = newAge;
    }
    public void setEmail(String newEmail){
        if (!newEmail.contains("@")) throw new IllegalArgumentException();
        email = newEmail;
    }
}
