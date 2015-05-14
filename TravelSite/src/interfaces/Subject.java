/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import classes.User;

/**
 *
 * @author zeek
 */
public interface Subject {
    public void addSubscriber(Subscribers sb);
    public void removeSubscriber(Subscribers sb);
    public void notifySubscribers();
}