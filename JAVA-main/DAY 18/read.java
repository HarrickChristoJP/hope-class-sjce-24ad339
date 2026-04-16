package Day18;

import java.io.FileReader;
import java.io.BufferedReader;

public class read {
    public static void main(String[] args) {
        try {
            /*
             * FileReader rd=new FileReader("doc.txt");
             * // rd.read();returns ASCII values, returns -1 when end of file is reached
             * int ch;
             * while ((ch = rd.read()) != -1) {
             * System.out.print((char) ch);
             * }
             * rd.close();
             */
            BufferedReader rd = new BufferedReader(new FileReader("doc.txt"));
            String line;
            while ((line = rd.readLine()) != null) {
                System.out.println(line);
            }
            rd.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
