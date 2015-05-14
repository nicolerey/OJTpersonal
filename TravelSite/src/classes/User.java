/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.Subject;
import interfaces.Subscribers;

/**
 *
 * @author zeek
 */
public class User implements Subscribers{
    private String msg;
    private int id;
    
    public User(int id){
        this.id = id;
    }

    @Override
    public void update(String msg) {
        this.msg = msg;
        display();
    }    
    
    @Override
    public void display(){
        System.out.println("User id: "+id);
        System.out.println("Travel site message: "+msg);
    }
}
