/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Pham Minh Hai
 */
public class Map {
    private int height;
    private int width;
    private Box []box;
    private int numBox;
    
    public Map(int height, int width, int numBox, Box []box) {
        this.height = height;
        this.width = width;
        this.numBox = numBox;
        this.box = box;
    }

    public Box[] getBox() {
        return box;
    }

    public int getHeight() {
        return height;
    }

    public int getNumBox() {
        return numBox;
    }

    public int getWidth() {
        return width;
    }
    
    public boolean findBox(int x, int y){
        for (int i = 0; i < numBox; i++){
            if (x == box[i].getObjectX() && y == box[i].getObjectY()){
                return true;
            }
        }
        return false;
    }
    
    public int findBox2(int x, int y){
        for (int i = 0; i < numBox; i++){
            if (x == box[i].getObjectX() && y == box[i].getObjectY()){
                return i;
            }
        }
        return -1;
    }
}
