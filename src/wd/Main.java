package wd;

import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        String F1Name;
        String F2Name;
        System.out.println("Введите адрес 1 файла:");
        F1Name =sc.nextLine();
        System.out.println("Введите адрес 2 файла:");
        F2Name =sc.nextLine();
        File file = new File(F1Name);
        File file2 = new File(F2Name);
        Scanner in = new Scanner(new FileReader(file));
        Scanner in_2 = new Scanner(new FileReader(file2));
        String s1 = "";
        while (in.hasNextLine()){
             s1 =s1 + in.nextLine();
        }
        String s2 = "";
        while (in_2.hasNextLine()){
            s2 =s2 + in_2.nextLine();
        }
        char [] ch1 = s1.toCharArray();
        char [] ch2 = s2.toCharArray();
        System.out.println("Всего символов в 1 файле:"+ch1.length+"\nВсего символов во 2 файле:"+ch2.length);
        int count = 0;
        System.out.println("  Отличающиеся символы:");
        System.out.println("Первый файл\t"+"Второй файл");
        for(int i = 0; i<Math.min(ch1.length, ch2.length); i++){
            if(ch1[i] != ch2[i]){
                System.out.println("\t"+ch1[i]+"\t\t\t"+ch2[i]);
                count++;
            }
        }
        System.out.println("========================");
        System.out.println("Всего символов в 1 файле:"+ch1.length+"\nВсего символов во 2 файле:"+ch2.length);
        System.out.println("Отличающихся символов: "+ count);
        System.out.println("Одинаковых символов: "+(Math.min(ch1.length, ch2.length)-count));
    }
}
