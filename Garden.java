/* Based on the VUW ecs100 template
 *
 */

import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/** 
 * Class to drive flower class
 *
 * @author Heather Harper
 * @version 27/04/2020
 */
public class Garden{
    // Initialise flowers
    private Flower f1 = new Flower(50, 100, 20, 50, Color.blue);
    private Flower f2 = new Flower(100, 100, 40, 50, Color.red);
    private Flower f3 = new Flower(150, 100, 30, 50, Color.yellow);
    
    /**
     * Constructor for objects of class Garden 
     */
    public Garden(){
        UI.initialise();
        UI.addButton("Grow", this::growGarden);
        UI.addButton("Quit", UI::quit);    // Comment out to checkstyle
    }

    /**
     * Script to animate the flowers
     */
    private void growGarden() {
        f1.draw();
        f2.draw();
        f3.draw();
        
        f1.grow();
        f2.grow();
        f1.grow();
        f3.grow();
        f2.grow();
        
        f1.erase();
    }

    /**
     * Main routine
     *
     */
    public static void main(String[] args){
        Garden obj = new Garden();
    }

}

