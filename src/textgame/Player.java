/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textgame;

/**
 *
 * @author erwri
 */
public class Player {
    
    private String name;
    private int health;
    String[] item = new String[3];
    
    public void setName(String name){
        this.name =name;
    }
    public String getName(){
        return name.toUpperCase();
    }
    public void setHealth(int health){
        this.health=health;
    }
    public int addHealth(){
        health++;
        System.out.println("Health +1");
        return health;
    }
    public int loseHealth(){
        health--;
        System.out.println("Health -1");
        return health;
    }
    public int getHealth(){
        return health;
    }
    public void addInventory(String newItem){
        for(int i=0;i<item.length;i++){
            if(item[i]==null){
                item[i]=newItem;
                break;
            }
        }
    }
    public void getInventory(){
        System.out.println("You have the following on you: ");
        for(int i=0;i<item.length;i++)
        System.out.println(item[i].toUpperCase());
    }
    
    public int rollDice(){
        int roll = (int)(Math.random()*20)+1;
        return roll;
    }
}
