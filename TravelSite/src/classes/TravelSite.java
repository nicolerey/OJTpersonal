/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.Subject;
import interfaces.Subscribers;
import java.util.ArrayList;

/**
 *
 * @author zeek
 */
public class TravelSite implements Subject{
    private ArrayList subs;
    private String msg;
    /**
     * @param args the command line arguments
     */
    public TravelSite(){
        subs = new ArrayList();
    }

    @Override
    public void addSubscriber(Subscribers sb) {
        subs.add(sb);
    }

    @Override
    public void removeSubscriber(Subscribers sb) {
        int x = subs.indexOf(sb);
        if(x>=0){
            subs.remove(x);
        }
    }

    @Override
    public void notifySubscribers() {
        for (int x=0;x<subs.size();x++) {
            Subscribers sb = (Subscribers)subs.get(x);
            sb.update(msg);
        }
    }
    
    public void msgChange(){
        notifySubscribers();
    }
    
    public void setMsg(String msg){
        this.msg = msg;
        msgChange();
    }
}
