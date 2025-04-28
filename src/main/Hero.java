/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Pham Minh Hai
 */
public class Hero {
    private int currentX;
    private int currentY;
    private Map map;

    public Hero(int currentX, int currentY, Map map) {
        this.currentX = currentX;
        this.currentY = currentY;
        this.map = map;
    }

    
    
    public void moveUp(){
        int tmpY = currentY + 1;
        if (currentY == map.getHeight() - 1){
            System.out.println("can not go there");
        }else if(map.findBox(currentX, tmpY)){
            System.out.println("there is an object, can not go there");
        }else{
            ++currentY;
            System.out.println("move up, current pos: " + currentX + " " + currentY);
        }
    }
    
    public void turnRight(){
        int tmpX = currentX + 1;
        if (currentX == map.getWidth() - 1){
            System.out.println("can not go there");
        }else if (map.findBox(tmpX, currentY)){
            System.out.println("there is an object, can not go there");
        }else{
            ++currentX;
            System.out.println("turn right, current pos: " + currentX + " " + currentY);
        }
    }
    
    public void turnLeft(){
        int tmpX = currentX - 1;
        if (currentX == 1){
            System.out.println("can not go there");
        }else if (map.findBox(tmpX, currentY)){
            System.out.println("there is an object, can not go there");
        }else{
            --currentX;
            System.out.println("turn left, current pos: " + currentX + " " + currentY);
        }
    }
    
    public void moveDown(){
        int tmpY = currentY - 1;
        if (currentY == 1){
            System.out.println("can not go there");
        }else if(map.findBox(currentX, tmpY)){
            System.out.println("there is an object, can not go there");
        }else{
            --currentY;
            System.out.println("move down, current pos: " + currentX + " " + currentY);
        }
    }
    
    public void hitLeft(){
        int tmpX = currentX - 1;
        int findPos = map.findBox2(tmpX, currentY);
        if (findPos != -1){
            map.getBox()[findPos].setHealth(map.getBox()[findPos].getHealth() - 1);
        }else{
            System.out.println("hit nothing");
            return;
        }
        System.out.println("health left: " + map.getBox()[findPos].getHealth());
        if (map.getBox()[findPos].getHealth() == 0) map.getBox()[findPos].remove();
    }
    
    public void hitRight(){
        int tmpX = currentX + 1;
        int findPos = map.findBox2(tmpX, currentY);
        if (findPos != -1){
            map.getBox()[findPos].setHealth(map.getBox()[findPos].getHealth() - 1);
        }else{
            System.out.println("hit nothing");
            return;
        }
        System.out.println("health left: " + map.getBox()[findPos].getHealth());
        if (map.getBox()[findPos].getHealth() == 0) map.getBox()[findPos].remove();
    }
    
    public void hitUp(){
        int tmpY = currentY + 1;
        int findPos = map.findBox2(currentX, tmpY);
        if (findPos != -1){
            map.getBox()[findPos].setHealth(map.getBox()[findPos].getHealth() - 1);
        }else{
            System.out.println("hit nothing");
            return;
        }
        System.out.println("health left: " + map.getBox()[findPos].getHealth());
        if (map.getBox()[findPos].getHealth() == 0) map.getBox()[findPos].remove();
    }
    
    public void hitDown(){
        int tmpY = currentX - 1;
        int findPos = map.findBox2(currentX, tmpY);
        if (findPos != -1){
            map.getBox()[findPos].setHealth(map.getBox()[findPos].getHealth() - 1);
        }else{
            System.out.println("hit nothing");
            return;
        }
        System.out.println("health left: " + map.getBox()[findPos].getHealth());
        if (map.getBox()[findPos].getHealth() == 0) map.getBox()[findPos].remove();
    }
}
