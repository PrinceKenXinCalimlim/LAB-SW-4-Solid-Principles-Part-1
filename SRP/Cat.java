public class Cat implements PetBehavior {
    
    @Override
    public String makeSound(){
        return "Meow, Meow";
    }

    @Override
    public String eat(){
        return "Eating cat food";
    }

}