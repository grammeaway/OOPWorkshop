/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Starter;

import Aqr.IDomainFacade;
import Aqr.IUI;
import Domain.DomainFacade;
import UI.UI;

/**
 * 
 * @author madsd
 */
public class Starter {

    public static void main(String[] args) {
        IDomainFacade domain = new DomainFacade();
        IUI ui = new UI();
        ui.injectDomain(domain);
        
        ui.startApplication(args);
    }
}
