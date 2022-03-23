import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Collections1 {
    public static void main(String[] args) throws IOException {

        try (Scanner scanner = new Scanner(new File("file.txt")))
        {
            int o = 0;
            Stack<Integer> stack=new Stack<>();

            while (scanner.nextInt()!=0 )
            {
                stack.push(scanner.nextInt());
                o++;

            }
            for (int i=0;i<o;o++){
            System.out.println(stack.pop());
            }



        }
        catch (FileNotFoundException e)
        {
            System.out.println("файла нет");
        }





    }
}
