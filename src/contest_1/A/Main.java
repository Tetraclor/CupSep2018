/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest_1.A;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException{
        FileWriter writer = new FileWriter("gifts.out");
        Scanner sc = new Scanner(new FileReader("gifts.in"));
        int N = sc.nextInt();
        int B = sc.nextInt();
        T t[] = new T[N];
        for(int i = 0; i < N; i++) t[i] = new T(sc.nextInt(), sc.nextInt());
        Arrays.sort(t);
        int k = 0;
        int max = 0;
        while(B - t[k].s >= 0){
            B -= t[k].s;
            if(max < t[k].z)max = t[k].z;
            k++;
        }
        B += max/2;
        boolean b = true;
        int l = k;
        while(l < N){
            if(B - t[l].s >= 0) {
                b = false;
                k++;
                break;
            }
            l++;
        }
        if(b){
            B -= max/2;
            l = k;
            while(l < N){
                if(B - t[l].p - t[l].z/2 >= 0){
                    k++;
                }
                l++;
            }
        }
        writer.write(k+"");
        writer.flush();
        writer.close();
    }
    static class T implements Comparable<T>{
        int z, p, s;
        T(int a, int b){
            z = a;
            p = b;
            s = a + b;
        }

        @Override
        public int compareTo(T o) {
            return this.s - o.s;
        }
        @Override
        public String toString(){
            return z + " " + p + " sum = " + s;
        }
    }
}
