package contest_1.C;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException{
        FileWriter writer = new FileWriter("test.out");
        Scanner sc = new Scanner(new FileReader("test.in"));
        char a[] = sc.next().toCharArray();
        char b[] = sc.next().toCharArray();
        int ans = 0;
        for(int i = 1; i < a.length; i++){
            char v = a[i];
            a[i] = v=='0'?'1':'0';
            for(int j = 0; j < b.length; j++){
                
                char d = b[j];
                for(int l = 0; l < 2; l++){
                    if(b[j] == '0')b[j] = '1';
                    else if(b[j] == '1')b[j] = '2';
                    else b[j] = '0';
                    if(Integer.parseInt(new String(a), 2) == Integer.parseInt(new String(b), 3)){
                        ans = Integer.parseInt(new String(a), 2);
                        writer.write(ans+"");
                        writer.flush();
                        writer.close(); 
                        return;
                    }
                }
                b[j] = d;     
            }
            a[i] = v;
        }  
    }
}
