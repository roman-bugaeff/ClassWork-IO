package com.tel_ran;

import java.io.*;
import java.util.Scanner;

public class WriteToFile {

    public static void main(String[] args) throws IOException {
        File file = new File("testFile");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream outputStream = new FileOutputStream(br.readLine());
        copyInFile(br, outputStream);
    }

    private static void copyInFile(BufferedReader br, OutputStream outputStream) throws IOException {
        int count = 0;
        while (true) {
            String data = br.readLine();
            if (data.equals("-1")) {
                break;
            }
            outputStream.close();
            outputStream = new FileOutputStream(("NewFile " + count));
            outputStream.write((data + "\r\n").getBytes());
            count++;
        }
        outputStream.close();
        br.close();
    }
}






