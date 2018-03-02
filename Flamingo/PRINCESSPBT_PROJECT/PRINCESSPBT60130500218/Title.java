import greenfoot.*; 

public class Title extends World
{
    GreenfootSound backgroundMusic = new GreenfootSound("PRINCESS.mp3");
    
    public Title()
    {    
        
        super(600, 400, 1); 
        prepare();
    }

    
    private void prepare()
    {
        
    }
    
    public void act(){
        backgroundMusic.play();
        if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new Castle());
            backgroundMusic.pause();
        }
        
    }
}


