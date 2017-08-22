/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textgame;
import java.util.Scanner;
/**
 *
 * @author erwri
 */
public class TextGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player play = new Player();
        Scanner scan = new Scanner(System.in);
        String item1;
        String item2;
        String item3;
        String rollIt;
        
        
        System.out.println("Welcome to Surving Academy Mortgage. Let's start by getting your name.");
        System.out.println("TYPE YOUR NAME:");
        play.setName(scan.nextLine());
        play.setHealth(5);
       
        System.out.println("Welcome "+ play.getName());
        System.out.println("Let's get started! You are leaving for work. Do you take a pen or gum?");
        System.out.println("TYPE 'PEN' or 'GUM'");
        item1=scan.nextLine();
        
        while(!item1.equalsIgnoreCase("PEN")){
            if(item1.equalsIgnoreCase("GUM")){
                break;
            }else{
            System.out.println("PLEASE TRY AGAIN");
            item1=scan.nextLine();
            }
        }
        play.addInventory(item1);
        
        System.out.println("So you race off to work with your "+ item1.toUpperCase());
        System.out.println("As you pull up, your coworker offers you food. Do you take the donut or the carrot");
        System.out.println("TYPE 'DONUT' or 'CARROT'");
        item2=scan.nextLine();
        
        while(!item2.equalsIgnoreCase("DONUT")){
            if(item2.equalsIgnoreCase("CARROT")){
                break;
            }else{
            System.out.println("PLEASE TRY AGAIN");
            item2=scan.nextLine();
            }
        }
        play.addInventory(item2);
        
        System.out.println("You stuff the " + item2.toUpperCase()+ " in your pocket and race off to your morning stand up.");
        System.out.println("Oh no! you forgot something by your desk. You need it prior to stand up!");
        System.out.println("TYPE 'NOTEPAD' or 'LAPTOP'");
        item3=scan.nextLine();
        
        while(!item3.equalsIgnoreCase("NOTEPAD")){
            if(item3.equalsIgnoreCase("LAPTOP")){
                break;
            }else{
            System.out.println("PLEASE TRY AGAIN");
            item3=scan.nextLine();
            }
        }
        play.addInventory(item3);
        
        System.out.println("HIT 'ENTER' to continue.");
        scan.nextLine();
        
        System.out.println("You are finally to stand up!");
                
        System.out.println("Your Scrummaster asks you what you did yesterday. Luckily you brought your "+ item3.toUpperCase());
        
        if(item3.equalsIgnoreCase("laptop")){
            System.out.println("...except your battery is dead. You look bad.");
            play.loseHealth();
        }else{
            System.out.println("You have all your notes written down and report on them.");
            play.addHealth();
        }
        
        System.out.println("HIT 'ENTER' to continue.");
        scan.nextLine();
        
        System.out.println("Empergency Team Meeting! You sit down by your co worker and reach into your pocket to offer a snack.");
        
        if(item2.equalsIgnoreCase("carrot")){
            System.out.println("Your co worker graciously declines some "+ item2.toUpperCase()+". That's ok. more for you!");
            play.addHealth();
        }else{
            System.out.println("Ew gross. Smashed jelly donut and sweat from all the running around. Not cool.");
            play.loseHealth();
        }
        
        System.out.println("HIT 'ENTER' to continue.");
        scan.nextLine();
        
        System.out.println("Moving along! Looks like the department is going away and you need to interview for a new job. Sucks to be you right now.");
        play.loseHealth();
        play.loseHealth();
        System.out.println("What are you going to do "+play.getName()+"?!?!");
        
        System.out.println("HIT 'ENTER' to continue.");
        scan.nextLine();
        
        System.out.println("Looks like everyone has to interview right now. Luckily you have your "+ item1.toUpperCase()+" that you grabbed this morning on your way out.");
        
        if(item1.equalsIgnoreCase("gum")){
            System.out.println("You pop the "+item1.toUpperCase()+ " in your mouth and walk in.");
            System.out.println("You chew like a horse and it's distracting so you failed the interview. At least you have minty breath?");
            play.loseHealth();
            play.loseHealth();
            play.loseHealth();
            
            System.out.println("Last chance! Wanna roll the dice? you have a 3 in 20 chance of convincing your boss at this point to keep you?");
            System.out.println("TYPE 'YEAH' or 'NAH'");
            
             rollIt=scan.nextLine();
        
            while(!rollIt.equalsIgnoreCase("YEAH")){
                if(rollIt.equalsIgnoreCase("NAH")){
                    break;
                }else{
                System.out.println("PLEASE TRY AGAIN");
                rollIt=scan.nextLine();
                }
            }
            
             if(rollIt.equalsIgnoreCase("YEAH")){
                
                 System.out.println("You roll the dice...");
                
                 if(play.rollDice()>16){
                     System.out.println("You did it!");
                     
                     for(int i=0;i<5;i++){
                         play.addHealth();
                     }
                     
                 }else{
                     System.out.println("Ouch. Major fail.");
                     for(int i=0;i<5;i++){
                         play.loseHealth();
                     }
                 }
            }else{
                System.out.println("You had terrible luck all day. Better not to risk it.");
            }
            
            
            
        }else{
            System.out.println("It's your good luck charm. You get the offer to stay and can sign the offer letter on the spot!");
            play.addHealth();
            play.addHealth();
        }
        
        System.out.println("HIT 'ENTER' to continue.");
        scan.nextLine();
        
        if(play.getHealth()<0){
            
            System.out.println("You died of stress.");
        }else if(play.getHealth()>0 && play.getHealth()<5){
            System.out.println("You barely squeaked by. You will live to see another day.");
        }else{
            System.out.println("You are a ROCK STAR! You always had this.");
        }
        
        System.out.println("HIT 'ENTER' to continue.");
        scan.nextLine();
        
        play.getInventory();
        
        System.out.println("The End");
        System.out.println("Thanks for playing "+play.getName());
    }
    
}
