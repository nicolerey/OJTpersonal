/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import abstracts.ABS_Services;

/**
 *
 * @author zeek
 */
public class CLASS_Service extends ABS_Services{
    private double cost;
    
    public CLASS_Service(String svName, double cost){
        serviceName = svName;
        this.cost = cost;
    }
    
    public double cost(){
        return cost;
    }
}
