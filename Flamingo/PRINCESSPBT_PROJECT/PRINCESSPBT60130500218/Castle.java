import greenfoot.*; 

public class Castle extends World
{
    public static GreenfootSound backgroundMusic = new GreenfootSound("PRINCESS.mp3");
    
    int counter = 0;
    int counter1 = 0;
    Scores scores;
    int max = 50;
    int min = 10;

    public Castle()
    {    

        super(600, 400, 1); 
        
        //backgroundMusic.playLoop();
        backgroundMusic.play();

        Flamingo PBT = new Flamingo();

        addObject(PBT, 200, getHeight()/2);

        scores = new Scores();
        addObject(scores, 50, 20);

        prepare();
    }


    public void act() {
        counter++;
        counter1++;
        int range = max - min + 1;

        if (counter >= 100) {
            Fairy Fairy = new Fairy();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(Fairy, x, y);
            counter = 0;
        }
        if (counter1 >= 100) {
            Bee Bee = new Bee();
            int x = Greenfoot.getRandomNumber(range);
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(Bee, x, y);
            counter1 = 0;
        }
        
                
    }

    private void prepare()
    {
    }
}
