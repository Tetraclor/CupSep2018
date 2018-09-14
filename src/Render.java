/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Render {
    public static void main(String args[]) throws IOException{
        System.out.println("Для генерация нового пакета контеста, \nвведите номер контеста и кол-во задач в нем (A B):");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int n = sc.nextInt();
        File file = new File("");
        String path = file.getAbsolutePath() + "\\src\\contest_" + c + "\\";
        Scanner sample = new Scanner(new FileReader(file.getAbsolutePath() + "\\src\\Main.java" ));
        sample.useDelimiter("42");
        String text = sample.next();
        for(int i = 0; i < n; i++){
            String str = path + (char)((int)'A' + i);
            System.out.println(str + " " + ((new File(str).mkdirs())?"created":"created error"));
            str += "\\Main.java";
            File th;
            boolean b;
            System.out.println("Main.java " + ((b = (th = new File(str)).createNewFile())?"created":"created error"));
            if(b){
                FileWriter fw = new FileWriter(th);
                fw.write("package contest_" + c + "." +(char)((int)'A' + i) + ";" + text);
                fw.flush();
                fw.close();
            }
        }
    }
}
