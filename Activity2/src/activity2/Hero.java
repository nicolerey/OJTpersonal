/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity2;

/**
 *
 * @author zeek
 */
public class Hero {    
    protected String strHeroName;
    protected String strCurrentSkill;
    protected String strHeroSkills = "";
    protected String strType;
    
    public Hero(String strName, String strCurrentSkill, String strType){
        this.strHeroName = strName;
        this.strCurrentSkill = strCurrentSkill;
        this.strType = strType;
        this.strHeroSkills = strCurrentSkill;
    }
    
    public void addSkill(String strSkill){
        this.strHeroSkills = new StringBuilder().append(this.strHeroSkills).append(", ").append(strSkill).toString();
    }
}