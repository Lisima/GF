import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Hippo extends Actor
{ int krok = 2;
    
    
    /**
     * Act - do whatever the Hippo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(krok);
        if ( isAtEdge()  ) krok = krok * (-2);
        //krawędź- odbijanie sie
       if (krok > 400 ) krok = 2;
    // jezeli krok bedzie wiekszy od 100, to przywroc do 2.
    }    
}
