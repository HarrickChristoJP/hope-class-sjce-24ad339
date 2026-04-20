package DAY21;
interface Math{
    int add(int a,int b);
    //int sub(int a,int b);
}
@FunctionalInterface
interface Exercise
{
    void sayHello();
}
public class LambdaExample {
    public static void main(String[] args)
    {
        Math obj=(a,b)->{
            System.out.println("Adding two numbers...");
            return a+b;
        };
        Exercise ex=()->System.out.println("Hello, welcome to Java 8!");
        ex.sayHello();
        // Math obj=new Math()
        // {
        //     @Override
        //     public int add(int a,int b)
        //     {
        //         return a+b;
        //     }
        // };
        System.out.println(obj.add(11,22));
    }
}
