import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

   public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        prepare();
    }
    
    private void prepare()
    {
        Frog frog = new Frog();
        addObject(frog,500,400);
        
        
        Hippo hippo1 = new Hippo();
        Hippo hippo2 = new Hippo();
        Hippo hippo3 = new Hippo();
        Hippo hippo4 = new Hippo();
        

        addObject(hippo1,800,200);
        addObject(hippo2,400,300);
        addObject(hippo3,780,700);
         addObject(hippo4,100,500);
        
        
        Kangaroo kangaroo1 = new Kangaroo();
        Kangaroo kangaroo2 = new Kangaroo();
        Kangaroo kangaroo3 = new Kangaroo();
        Kangaroo kangaroo4 = new Kangaroo();
        Kangaroo kangaroo5 = new Kangaroo();
        Kangaroo kangaroo6 = new Kangaroo();
        
        addObject(kangaroo1,800,100);
        addObject(kangaroo2,500,200);
        addObject(kangaroo3,390,400);
        addObject(kangaroo4,250,600);
        addObject(kangaroo5,700,700);
        addObject(kangaroo6,850,300);
}
}
