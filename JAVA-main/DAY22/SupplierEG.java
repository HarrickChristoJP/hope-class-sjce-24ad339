package Day22;
/*
Supplier(functional interface):
     ->has only one abstract method get() which returns a value of any type.
     ->it does not take any input parameters.
*/
import java.util.function.Supplier;
class Person{
    String name="Garcia";
}

public class SupplierEG {
    public static void main(String[] args) {
        Supplier<Integer> s=()->(int)(Math.random()*100);//returns a random number between 0 and 100
        System.out.println(s.get());
        Supplier<Person> p1=()->new Person();
        System.out.println(p1.get().name);
    }
}
