/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Scanner;

/**
 *
 * @author zeek
 */
public class Activity {
        
    public static void main(String[] args) {
        User u1 = new User(1);
        User u2 = new User(2);
        User u3 = new User(3);
        TravelSite ts = new TravelSite();
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.println("Choose: 1.)u1 2.)u2 3.)u3 4.)Change message");
            String ch = sc.nextLine();
            if(ch.equals("4")){
                addSpace(3);
                System.out.println("Enter new message: ");
                String msg = sc.nextLine();
                ts.setMsg(msg);
            }
            else{
                addSpace(3);
                System.out.println("Choose 1.)Subscribe 2.)Unsubscribe");
                String sub = sc.nextLine();
                if(sub.equals("1")){
                    if(ch.equals("1"))
                        ts.addSubscriber(u1);
                    else if(ch.equals("2"))
                        ts.addSubscriber(u2);
                    else
                        ts.addSubscriber(u3);
                }
                else{
                    if(ch.equals("1"))
                        ts.removeSubscriber(u1);
                    else if(ch.equals("2"))
                        ts.removeSubscriber(u2);
                    else
                        ts.removeSubscriber(u3);
                }
            }
            addSpace(5);
        }
    }
    
    public static void addSpace(int y){
        for(int x=0;x<y;x++){
            System.out.println();
        }
    }
}
