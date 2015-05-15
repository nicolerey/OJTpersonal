/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import abstracts.ABS_AddOns;
import abstracts.ABS_Services;
import java.util.Scanner;

/**
 *
 * @author zeek
 */
public class Activity4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String[] serviceList;
        int choice, choice2;
        
        ABS_Services holder = null;
        
        ABS_Services Text = new CLASS_Service("Text", 1.5);
        ABS_Services Calls = new CLASS_Service("Calls", 5);
        ABS_Services Internet = new CLASS_Service("Internet", 1500);
        
        while(true){
            System.out.print("Applied Service/s & Total Cost: ");
            if(holder==null){
                System.out.println("");
                System.out.println("Choose: 1.)Choose Service 2.)RESET");
            }
            else{
                System.out.println(holder.getServiceName()+" $"+holder.cost());
                System.out.println("Choose: 1.)Add Service 2.)RESET");
            }
            choice = sc.nextInt();
            
            addSpace(5);
            if(choice==1){
                System.out.println("Available Services: 1.)Text 2.)Calls 3.)Internet");
                choice2 = sc.nextInt();
                if(holder==null){
                    if(choice2==1)
                        holder = Text;
                    else if(choice2==2)
                        holder = Calls;
                    else if(choice2==3)
                        holder = Internet;
                }
                else{
                    if(choice2==1)
                        holder = new CLASS_AddOn("Text", 1.5, holder);
                    else if(choice2==2)
                        holder = new CLASS_AddOn("Calls", 5, holder);
                    else if(choice2==3)
                        holder = new CLASS_AddOn("Internet", 1500, holder);
                }
            }
            else if(choice==2){
                holder = null;
            }
            addSpace(5);
        }
    } 
    
    public static void addSpace(int x){
        for(int y=0;y<x;y++){
            System.out.println("");
        }
    }
}
