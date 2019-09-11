import java.util.*;
import java.io.*;

public class ResumeScanner
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your input file:");
		FileGenerator.inputName = input.next();
		
		System.out.println("Please enter your output file:");
		FileGenerator.outputName = input.next();
		/*
		 File file = 
      new File("C:\\Users\\pankaj\\Desktop\\test.txt"); 
    Scanner sc = new Scanner(file); 
  
    while (sc.hasNextLine()) 
      System.out.println(sc.nextLine()); */
		
		input.close();
	}
}
---------------------------------


public class FileGenerator implements Runnable
{
	private static Queue<String> originalWords = new ArrayDeque<>();
	private static ConcurrentHashMap<String, List<String> > table = new ConcurrentHashMap<>();
	public static String inputName;
	public static String outputName;
	
	// method for reading in the contents of the file
	public static void readFile()
	{
		try(Scanner reader = new Scanner(new File(inputName)))
		{
			while (reader.hasNextLine())
			{
				// getting the current line
				String currentWord = reader.nextLine();
				
				// storing the possible words
				String[] wordList = currentWord.split(" ");
				
				StringBuilder newWord = new StringBuilder();
				
				// validating each space separated string
				for (int x = 0; x < wordList.length; x++)
				{
					for (Character current: wordList[x].toCharArray())
					{
						if (Character.isLetter(current))
						{
							newWord.append(current);
						}
						else
						{
							// case conditions when multiple words are read
							// or other special cases such as apostrophes 
							if (newWord.length() > 0)
							{
								originalWords.add(newWord.toString());
							}
							
							originalWords.add(current.toString());
							
							// resetting the new word
							newWord.setLength(0);
						}
					}
					
					// storing the word
					if (newWord.length() > 0)
					{
						originalWords.add(newWord.toString());
						newWord.setLength(0);
					}
					
					// adding space separator
					originalWords.add(" ");
				}
				
				// adding a new line
				if (reader.hasNextLine())
				{
					originalWords.add("\n");
				}
			}
		} 
		catch (FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	// method for writing the content to our output file
	public static void writeFile()
	{
		try(PrintWriter writer = new PrintWriter(new File(outputName)))
		{
			while (!originalWords.isEmpty())
			{
				// threshold condition to limit which words we replace
				// good range is avoid words with lengths less than 3 or 4
				// but can be easily customized to the user's need
				if (originalWords.peek().length() <= 4)
				{
					writer.print(originalWords.remove());
				}
				else
				{
					// section on replacing the original word with a possible synonym
					String result = getSynonym();
					
					// writing to file
					writer.print(result);
				}
			}
		} 
		
	}

}
