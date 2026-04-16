package Day18;
import java.io.File;
import java.io.IOException;
/*
file handling:

I/O Streams:
      1.Byte streams -
*/
public class File_Handling {
    public static void main(String[] args) throws IOException{
        File newfile=new File("doc.txt");
        if(newfile.createNewFile()){
            System.out.println("file created: "+newfile.getName());
        }
        else
            System.out.println("file not created");
    }
}
