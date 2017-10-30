package com.uum._a1;


/*
Semester: #A171
Course: #STIW3054
Group: #A
Task: #Assignment1
Matrik: #238417
Name: Nur Amirah Syafiqah Bt. Abdul Roni
 */
import java.io.File;

public class Assignment1 {

    public static void main(String[] args) {

        File tesr = new File("C:/Users/User/Documents/238417/Git-Command/RealTime/src");
        File[] find = tesr.listFiles();

        int file = 0;

        for (File noOfFile : find) {
            if (noOfFile.isFile()) {
                if (noOfFile.getName().endsWith(".java")) {
                    file++;
                }
            }
        }

        System.out.println("Number of file: " + file);

    }
}
