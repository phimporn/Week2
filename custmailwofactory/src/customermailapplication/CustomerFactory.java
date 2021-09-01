/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customermailapplication;

/**
 *
 * @author Phimporn
 */
public class CustomerFactory {
    public static Customer createCustomer(String type) {
        switch (type) {
            case "Delinquent Customer":
                return new DelinquentCustomer();
            case "Moutain Customer":
                return new MountainCustomer();
            case "Regular Customer":
                return new RegularCustomer();
        
        }
		return null;
    }
    
}
