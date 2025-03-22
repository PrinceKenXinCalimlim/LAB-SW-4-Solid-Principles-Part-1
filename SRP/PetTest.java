
public class PetTest {
    public static void main(String[] args) {
    
    Pet pet1 = new Pet("Sylvester", "Oggy");
    PetBehavior cat = new Cat();

    System.out.println("Pet Name: " + pet1.getPetName());
    System.out.println("Owner: " + pet1.getOwner());
    System.out.println(cat.makeSound());
    System.out.println(cat.eat());
    }
}