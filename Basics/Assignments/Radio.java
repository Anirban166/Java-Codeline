package assignmentsByAnirban;
import java.util.*;

public class Radio
{
	static String power;
	static int channel;
	static int volume;
	static int quit;
 
    Radio()
    {
      power="OFF"; channel=0; volume=0; quit=0;
    }
   
    static void on()
    {
    
    boolean sim=true;
    int count=0;
    //Space for non-repeating menu	
    	
    Scanner s=new Scanner(System.in);
    do
    {   
    System.out.print("-------------------------| Radio Simulator Menu |--------------------------\n");
    System.out.println("Switch on the radio by pressing 'P':");
    System.out.println("Switch to next channel by pressing 'U':");
    System.out.println("Switch to previous channel by pressing 'D':");
    System.out.println("Turn volume up by pressing '+':");
    System.out.println("Turn volume down by pressing '-':");
    System.out.println("Exit/Quit simulation by pressing 'Q':");

    char x=s.next().charAt(0);
    
    switch(x)
    { case 'P': {  if(count%2==0) power="ON"; else power="OFF"; count++;
    System.out.println("Current State: Channel:"+channel+"AM ; Volume: "+volume+" ; Power: "+power);
    break; }
   
     case 'U': { if(power=="ON")
    { channel+=1;    
      System.out.println("Current State: Channel: "+channel+"AM ; Volume: "+volume+" ; Power: "+power);
    } else System.out.println("Radio is off");
      break; }
     
     case 'D': { if(power=="ON")
    { channel-=1;
      System.out.println("Current State: Channel: "+channel+"AM ; Volume: "+volume+" ; Power: "+power);
    } else System.out.println("Radio is off");
      break; }
     
     case '+': { if(power=="ON")
    { if(volume<100) volume+=1;
      System.out.println("Current State: Channel: "+channel+"AM ; Volume: "+volume+" ; Power: "+power);
    } else System.out.println("Radio is off");
      break; }
     
     case '-': { if(power=="ON")
     { if(volume>0) volume-=1;
       System.out.println("Current State: Channel: "+channel+"AM ; Volume: "+volume+" ; Power: "+power);
     } else System.out.println("Radio is off");
      break; }
     
     case 'Q': { sim=false;
      System.out.println("Simulation turned off.");
     break; }      
    } //switch end
    } while (sim==true);
    }
    
}   
