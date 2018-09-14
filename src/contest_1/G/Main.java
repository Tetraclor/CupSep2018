/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest_1.G;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException{
        FileWriter writer = new FileWriter("ctiming.out");
        Scanner sc = new Scanner(new FileReader("ctiming.in"));
        int D = sc.nextInt(), H = sc.nextInt(), M = sc.nextInt();
        int summ = D * 24 * 60 + H * 60 + M - 11 * (24 * 60 + 60 + 1);
        if (summ < 0) writer.write(-1);
        else writer.write(summ);
        writer.flush();
        writer.close();
    }
}
