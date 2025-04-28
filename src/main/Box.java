/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Pham Minh Hai
 */
public class Box{
    private int health;
    private int objectX;
    private int objectY;

    public Box(int health, int objectX, int objextY) {
        this.health = health;
        this.objectX = objectX;
        this.objectY = objextY;
    }

    public int getHealth() {
        return health;
    }

    public int getObjectX() {
        return objectX;
    }

    public int getObjectY() {
        return objectY;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setObjectX(int objectX) {
        this.objectX = objectX;
    }

    public void setObjectY(int objectY) {
        this.objectY = objectY;
    }
    
    public void remove(){
        objectX = -1;
        objectY = -1;
    }
    
}
