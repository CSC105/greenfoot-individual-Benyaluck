import greenfoot.*;  
public class Flamingo extends Actor
{
    int counter = 0;

    public Flamingo(){
        GreenfootImage Flamingo = getImage();
        Flamingo.scale(55, 100);
        setImage(Flamingo);
    }

    public void act() 
    {
        counter++;

        if (Greenfoot.isKeyDown("up") == true) {
            setLocation( getX(), getY() - 5);
        }

        if (Greenfoot.isKeyDown("down") == true) {
            setLocation( getX(), getY() + 5);
        }

        if (Greenfoot.isKeyDown("left") == true) {
            setLocation( getX() - 5, getY());
        }

        if (Greenfoot.isKeyDown("right") == true) {
            setLocation( getX() + 5, getY());
        }

        if (Greenfoot.isKeyDown("space") ==true) {
            Flamingo power = new Flamingo();
            getWorld().addObject(power, getX(), getY());

        }

        Actor over1 = getOneIntersectingObject(Bee.class);
        if (over1 !=null) {
            //GameOver gover = new GameOver();
            //getWorld().addObject(gover, getWorld().getWidth()/2, getWorld().getHeight()/2);
            //Greenfoot.stop();
            Greenfoot.playSound("OUCH.mp3");

            // change to a new page

            Castle.backgroundMusic.stop();
            Greenfoot.setWorld(new RestartScreen());
        }
    }
}

