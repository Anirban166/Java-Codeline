package com.application;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your input file:");
		FileGenerator.inputName = input.next();
		
		System.out.println("Please enter your output file:");
		FileGenerator.outputName = input.next();
		
		input.close();
		
		ExecutorService threads = Executors.newFixedThreadPool(2);
		long begin = System.currentTimeMillis();
		threads.execute(new FileGenerator());
		threads.shutdown();
		try
		{
			threads.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
		}
		catch (InterruptedException e) 
		{
			System.out.println(e.getMessage());
		}
		long end = System.currentTimeMillis();
		
		System.out.println("Paraphrasing Finished in " + (end-begin)/1000.0 + " seconds");
	}
}
