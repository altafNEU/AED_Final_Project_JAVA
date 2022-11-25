/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles;

import Business.EcoSystem;

/**
 *
 * @author azizvohra
 */
public class Admin_PandemicTestCenter  extends Roles {
    public JPanel createWorkArea(JPanel userProcessContainer, UserAcc account, EcoSystem business) {
        return new UserAreaJPanel(userProcessContainer, account, business);
    } 
}
