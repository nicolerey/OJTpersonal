/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracts;

/**
 *
 * @author zeek
 */
public abstract class ABS_Services {
    public String serviceName;
    
    public String getServiceName(){
        return serviceName;
    }
    
    public abstract double cost();
}
