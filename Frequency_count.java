import java.util.*;
public class Frequency_count {
    public static void main(String[] args){

        String text="Hello world I like Java Hello ";

        Map<String,Integer> count= new HashMap<>();

        for(String word:text.split(" ")){

            count.put(word,count.getOrDefault(word,0)+1);
        }

        System.out.println("The Answer is :"+count);
    }
}
