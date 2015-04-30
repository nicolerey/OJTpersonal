/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity2;

import java.util.Scanner;

/**
 *
 * @author zeek
 */
public class Activity2{

    /**
     * @param args the command line arguments
     */
    private static final Hero h1 = new Hero("nicole","Ravage","Strength");
    private static final Hero h2 = new Hero("mark","Impale","Intelligence");
    private static final Hero h3 = new Hero("ralph","Rupture","Intelligence");
    private static final Hero h4 = new Hero("don","Tether","Agility");
    private static final Hero h5 = new Hero("0ne","Big Bite","Divergent");
        
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn = new Scanner(System.in);
        
        String strChoosenHero = "";
        String strChoosenSkill = "";
        String strMsg = "";
        int intHeroCheck;
        
        while(true){
            if(strChoosenHero.equals("")){
                System.out.print("Choose Hero: ");
                strChoosenHero = scn.nextLine();
            }
            
            intHeroCheck = isHero(strChoosenHero);
            if(intHeroCheck!=0){
                for (int i=0; i<11; i++)
                    System.out.println();
                System.out.println("Choosen hero: "+strChoosenHero);
                if(!strMsg.equals(""))
                    System.out.println(strMsg);

                System.out.println();
                System.out.println("1.) Attack");
                System.out.println("2.) Block");
                System.out.println("3.) Add skill");
                System.out.println("4.) Choose different Hero");
                String intSelection = scn.nextLine();

                if(intSelection.equals("1")){
                    displayHeroSkills(intHeroCheck, strChoosenHero);
                    System.out.print("Attack with: ");
                    strChoosenSkill = scn.nextLine();

                    if(checkSkill(strChoosenSkill, intHeroCheck)!= -1)
                        strMsg = strChoosenHero+" attacked with "+strChoosenSkill;
                    else
                        strMsg = "Skill does not exist!";
                }
                else if(intSelection.equals("2")){                    
                    displayHeroSkills(intHeroCheck, strChoosenHero);
                    System.out.print("Block with: ");
                    strChoosenSkill = scn.nextLine();

                    if(checkSkill(strChoosenSkill, intHeroCheck)!= -1)
                        strMsg = strChoosenHero+" blocked with "+strChoosenSkill;
                    else
                        strMsg = "Skill does not exist!";
                }
                else if(intSelection.equals("3")){
                    System.out.print("Add skill: ");
                    String strAddSkill = scn.nextLine();
                    
                    addSkill(strAddSkill, intHeroCheck);
                }
                else if(intSelection.equals("4")){
                    strChoosenHero = "";
                    strChoosenSkill = "";
                    strMsg = "";
                }
            }
            else
                strChoosenHero = "";
        }
    }    

    private static int isHero(String strChoosenHero) {
        if(h1.strHeroName.equals(strChoosenHero))
            return 1;
        else if(h2.strHeroName.equals(strChoosenHero))
            return 2;
        else if(h3.strHeroName.equals(strChoosenHero))
            return 3;
        else if(h4.strHeroName.equals(strChoosenHero))
            return 4;
        else if(h5.strHeroName.equals(strChoosenHero))
            return 5;
        else
            return 0;
    }

    private static int checkSkill(String strChoosenSkill, int intCheckHero) {
        int isSkill;
        
        if(intCheckHero==1){
            isSkill = (h1.strHeroSkills).indexOf(strChoosenSkill);
            System.out.println(strChoosenSkill);
        }
        else if(intCheckHero==2)
            isSkill = (h2.strHeroSkills).indexOf(strChoosenSkill);
        else if(intCheckHero==3)
            isSkill = (h3.strHeroSkills).indexOf(strChoosenSkill);
        else if(intCheckHero==4)
            isSkill = (h4.strHeroSkills).indexOf(strChoosenSkill);
        else
            isSkill = (h5.strHeroSkills).indexOf(strChoosenSkill);
        
        return isSkill;
    }

    private static void addSkill(String strAddSkill, int intHeroCheck) {
        if(intHeroCheck==1)
            h1.addSkill(strAddSkill);
        else if(intHeroCheck==2)
            h2.addSkill(strAddSkill);
        else if(intHeroCheck==3)
            h3.addSkill(strAddSkill);
        else if(intHeroCheck==4)
            h4.addSkill(strAddSkill);
        else
            h5.addSkill(strAddSkill);
    }

    private static void displayHeroSkills(int intHeroCheck, String strHeroName) {
        if(intHeroCheck==1)
            System.out.println(strHeroName+"'s skills: "+h1.strHeroSkills);
        else if(intHeroCheck==2)
            System.out.println(strHeroName+"'s skills: "+h2.strHeroSkills);
        else if(intHeroCheck==3)
            System.out.println(strHeroName+"'s skills: "+h3.strHeroSkills);
        else if(intHeroCheck==4)
            System.out.println(strHeroName+"'s skills: "+h4.strHeroSkills);
        else
            System.out.println(strHeroName+"'s skills: "+h5.strHeroSkills);
    }
}
