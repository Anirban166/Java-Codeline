package assignmentsByAnirban;

import java.util.Random;

public class Compass
{

public enum Direction
{
    NORTH, EAST, SOUTH, WEST;
    private static Random rnd = new Random();

    static public Direction randomDirection()
    {
        return Direction.values()[rnd.nextInt(4)];
    }

    // Rotate 90 degrees clockwise
    public Direction rotate90()
    {
        return values()[(ordinal() + 1) % 4];
    }

    // Rotate 180 degrees
    public Direction rotate180() 
    {
        return values()[(ordinal() + 2) % 4];
    }

    // Rotate 270 degrees clockwise (90 counterclockwise)
    public Direction rotate270() 
    {
        return values()[(ordinal() + 3) % 4];
    }

    public Boolean isHorizontal() 
    {
        return this == EAST || this == WEST;
    }

    public Boolean isVertical()
    {
        return this == NORTH || this == SOUTH;
    }
    
  }//enum end
}
