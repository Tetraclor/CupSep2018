package contest_1.B;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException{
        FileWriter writer = new FileWriter("test.out");
        Scanner sc = new Scanner(new FileReader("test.in"));
        int N = sc.nextInt();
        int K = sc.nextInt();
        int m[] = new int[N];
        int ha[] = new int[K];
        int hb[] = new int[K];
        for(int i = 0; i < K; i++){
            ha[i] = sc.nextInt() - 1;
            hb[i] = sc.nextInt() - 1;
        }
        Arrays.sort(ha);
        Arrays.sort(hb);
        int k = 0;
        int j = 0;
        int l = 0;
        for(int i = 0; i < N; i++){
            while(j < ha.length && ha[j] == i){
                k++;
                j++;
            }
            m[i] += k;
            while(l < hb.length && hb[l] == i){
                k--;
                l++;
            }
        }
        Arrays.sort(m);
        writer.write(m[(N-1)/2]+"");
        
        writer.flush();
        writer.close(); 
    }
}
