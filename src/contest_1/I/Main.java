package contest_1.I;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException{
        FileWriter writer = new FileWriter("test.out");
        Scanner sc = new Scanner(new FileReader("test.in"));
        writer.flush();
        writer.close(); 
    }
}
