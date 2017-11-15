import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Frog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frog extends Actor
{
    int punkty = 0;
    

    public void act() 
    {
        klawisze();
        jedzenie();
        pokazPunkty();
        zderzenie();
    }    
public void klawisze ()
    {
       
        if (Greenfoot.isKeyDown ("right")) move (2);
        if (Greenfoot.isKeyDown ("left")) move (-2);
        if (Greenfoot.isKeyDown ("up"))
        {
            turn (-90);
            move (2);
            turn (90);
        }
        if (Greenfoot.isKeyDown ("down"))
        {
            turn (-90);
            move (-2);
            turn (90);
        }
    }
       public void jedzenie ()
       {
           if (isTouching (Hippo.class))
           {
               removeTouching (Hippo.class);
               punkty++;
            }
               

}
 public void pokazPunkty ()
    {
        getWorld().showText ("Punkty:" +punkty, 100, 30);
    }
public void zderzenie ()
{
    
}
}

