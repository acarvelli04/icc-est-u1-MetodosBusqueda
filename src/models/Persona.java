package models;

public class Persona {
    //Disturbing the peace look into my eyes
    
    String name;
    int age;
    
    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
