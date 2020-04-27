import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/**
 * Draws Flowers on the GUI
 *
 * @author Heather Harper
 * @version 27/04/2020
 */
public class Flower
{
    // variables for flower position
    private double flowerX = -100.0;
    private double flowerY = -100.0;
    private double left, top, bottom;
    
    // variables for flower dimensions
    private int flowerSize;
    private int flowerHeight;
    
    private Color color;
    
    /**
     * Constructor for objects of class flower
     * 
     * @param x a double for the x coordinate
     * @param y a double for the y coordinate 
     * @param size an int for the diameter of the flower
     * @param stem an int for the height of the stem
     * @param col a Color for the flower colour
     */
    public Flower(double x, double y, int size, int stem, Color col) {
        this.flowerX = x;
        this.flowerY = y;
        this.flowerSize = size;
        this.flowerHeight = stem;
        this.color = col;
        this.setTop();
        this.setLeft();
        this.setBottom();
    }
    
    /**
     * Set top of flower
     */
    private void setTop() {
        this.top = flowerY - (flowerSize / 2.0);
    }
    
    /**
     * Set left of flower
     */
    private void setLeft() {
        this.left = flowerX - (flowerSize / 2.0);
    }
    
    /**
     * Set bottom of flower
     */
    private void setBottom() {
        this.bottom = flowerY + flowerHeight; 
    }
}
