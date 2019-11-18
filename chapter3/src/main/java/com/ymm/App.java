package com.ymm;

import com.ymm.page40.ProcessFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
		System.out.println(processReadLine(
				(BufferedReader br) -> br.readLine()
		));

		System.out.println(processReadLine(
				(BufferedReader br) -> br.readLine() +"\n" + br.readLine()
		));
    }

    public static String processReadLine(ProcessFile p)throws  IOException{
		try(BufferedReader reader = new BufferedReader(new FileReader("/Users/yemingming/workspace/ideacode/java8-in-action/chapter3/src/main/java/com/ymm/page40/test.txt"))){
			return p.process(reader);
		}
	}
}
