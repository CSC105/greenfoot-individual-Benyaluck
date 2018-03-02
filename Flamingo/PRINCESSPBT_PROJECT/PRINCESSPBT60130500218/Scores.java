import greenfoot.*; 

public class Scores extends Actor
{
    int Scores = 0;
    public Scores() {
        add(0);
    }
    public void add(int amount) {
        Scores = Scores + amount;
        GreenfootImage scoreImg = new GreenfootImage(100, 50);
        
        
        
        scoreImg.setColor(Color.BLACK);
        scoreImg.drawString("Scores: " + Scores, 10, 25);
        setImage(scoreImg);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
