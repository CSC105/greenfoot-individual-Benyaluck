import greenfoot.*;  


public class Fairy extends Actor
{
    public Fairy(){
        GreenfootImage Fairy = getImage();
        Fairy.scale(100, 100);
        setImage(Fairy);
    }
    public void act() 
    {   
        Actor di = getOneIntersectingObject(Flamingo.class);
        
        if (di != null) {
            
            ((Castle)(getWorld())).scores.add(50);
            getWorld().removeObject(this);
            Greenfoot.playSound("MAGIC.mp3");
        }
        
    }      
}
