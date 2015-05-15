/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import abstracts.ABS_AddOns;
import abstracts.ABS_Services;

/**
 *
 * @author zeek
 */
public class CLASS_AddOn extends ABS_AddOns{
    ABS_Services absService;
    private String name;
    private double cost;
    
    public CLASS_AddOn(String name, double cost, ABS_Services absService){
        this.name = name;
        this.cost = cost;
        this.absService = absService;
    }

    @Override
    public String getServiceName() {
        return absService.getServiceName()+", "+name;
    }

    @Override
    public double cost() {
        return absService.cost() + cost;
    }
    
}
