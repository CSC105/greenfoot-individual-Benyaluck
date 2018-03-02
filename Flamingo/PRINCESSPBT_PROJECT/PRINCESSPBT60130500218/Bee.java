import greenfoot.*; 

public class Bee extends Actor
{   
    int speed =5;
    int max = 50;
    int min = 10;

    public void act() {
         move (speed);
            if ((isTouching(Symbol.class) == true) || (isAtEdge() == true))  {
             getWorld().removeObject(this);
            }
           
    }
            
        
}
