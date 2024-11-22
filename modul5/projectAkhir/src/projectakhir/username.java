/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectakhir;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Admin
 */
public class username {
    private static String username, password;
    private static int level;
    
    
    protected String getUsername(){
        return this.username;
    }


    protected int getLevel(){
    return this.level;
    }
    
    protected void setUsername(String username){
        this.username = username;
    }

    protected void setLevel(int level){
        this.level = level;
        
    }
    
   

    
    
}

    
