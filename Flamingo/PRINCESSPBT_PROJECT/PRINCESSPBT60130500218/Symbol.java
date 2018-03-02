import greenfoot.*; 

public class Symbol extends Actor
{
    
    public void act() 
    {   
       
        if (isTouching(Bee.class) == false ) {
            getWorld().removeObject(this);
            
        }
        
    }    
}
