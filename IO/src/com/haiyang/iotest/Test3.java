package com.haiyang.iotest;

import com.sun.xml.internal.bind.v2.runtime.reflect.Accessor;
import sun.reflect.generics.repository.FieldRepository;

import java.io.*;

public class Test3 {

    public static void main(String[] args) throws IOException {
        //高效字符流
        BufferedWriter bw = new BufferedWriter(new FileWriter("d.txt"));
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));

        //一次读取一行
        String len = null;
        while ((len = br.readLine()) != null){
            bw.write(len);
            bw.newLine();
            bw.flush();
        }
        br.close();
        bw.close();
    }
}
