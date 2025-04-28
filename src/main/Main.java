/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Pham Minh Hai
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int height = 6;
        int width = 6;
        
        int numBox = 5;
        Box []box = new Box[numBox];
        for (int i = 0; i < numBox; i++){
            int health = (int)(Math.random() * (2 - 1 + 1)) + 1;
            int x = (int)(Math.random() * (5 - 1 + 1)) + 1;
            int y = (int)(Math.random() * (5 - 1 + 1)) + 1;
            System.out.println("random box : " + x + " " + y + " health " + health);
            box[i] = new Box(health, x, y);
        }
        Map map = new Map(height, width, numBox, box);
        Hero hero = new Hero(1, 1, map);
        while(true){
            char move = sc.nextLine().charAt(0);
            if (Character.toLowerCase(move) == 'w'){
                hero.moveUp();
            }else if (Character.toLowerCase(move) == 'a'){
                hero.turnLeft();
            }else if (Character.toLowerCase(move) == 's'){
                hero.moveDown();
            }else if (Character.toLowerCase(move) == 'd'){
                hero.turnRight();
            }else if (Character.toLowerCase(move) == 'p'){
                int direction = sc.nextLine().charAt(0);
                if (direction == 'w'){
                    hero.hitUp();
                }else if (direction == 'a'){
                    hero.hitLeft();
                }else if (direction == 's'){
                    hero.hitDown();
                }else if (direction == 'd'){
                    hero.hitRight();
                }else{
                    System.out.println("choose proper keys");
                }
            }else{
                System.out.println("choose proper keys");
            }
        }
    }
    
}
