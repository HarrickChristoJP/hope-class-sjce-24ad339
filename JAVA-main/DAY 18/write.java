package Day18;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class write {
    public static void main(String[] args) {
        try {
            // FileWriter wr=new FileWriter("doc.txt"); //slow process
            BufferedWriter wr = new BufferedWriter(new FileWriter("doc.txt"));
            wr.write("content of the file");
            wr.write(" how");
            wr.newLine();
            wr.append(" djnffsej");
            wr.append(" " + 84829);
            wr.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
