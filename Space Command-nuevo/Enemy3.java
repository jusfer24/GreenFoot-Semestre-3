import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy3 extends Enemy
{
    /**
     * Act - do whatever the Enemy3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveEnemy3();
        EliminatePlayer();
        removeFromWorld();
    }
}
