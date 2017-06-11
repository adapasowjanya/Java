package com.microinfo.coreJava;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("C:/Users/Sowji/JavaEclipse/CoreJava/src/com/microinfo/coreJava/data.txt");
        InputStreamReader input=new InputStreamReader(file);
		BufferedReader br=new BufferedReader(input);
		
		String str = br.readLine();
		
		
		while(br.readLine() != null){
			
			System.out.println(str);

			}
		br.close();
}
}
