/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

/**
 *
 * @author satyajitdas
 */
public class SystemConfig {
        public static EcoSystem SysConfigure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        
        UserAcc ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", new System_Admin());
        
        return system;
    }
}
