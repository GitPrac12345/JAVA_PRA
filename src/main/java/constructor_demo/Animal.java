package constructor_demo;

public class Animal {

    private String name;
    private int id;
    public Animal(String animalName,int animalId){
        name=animalName;
        id=animalId;
    }
    public void getDetails(){
        System.out.println("AnimalDetails:"+","+"id is "+id+","+"name is "+name);
    }
}
