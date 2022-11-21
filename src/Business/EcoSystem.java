/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author satyajitdas
 */
public class EcoSystem {
    
          private static EcoSystem business;
     
     public EcoSystem( User_Directory userDir) {

        this.userDir=userDir;
        
    }
     
     public boolean checkIfUserIsUnique(String userName){
//         for (UserAcc ua : userAccList){
//            if (ua.getUserName().equals(userName))
//            return false;
//        }
        return true;
         
    }
    
    
      public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
        
    }
      public static void setInstance(EcoSystem system) {	
        business = system;	
    }
    
    private EcoSystem(){
        super(null);
   
    }

       @Override
    public ArrayList<Roles> getRoleSupported() {
        ArrayList<Roles> rolesList=new ArrayList<>();
        rolesList.add(new System_Admin());
        return rolesList;
    }
}
