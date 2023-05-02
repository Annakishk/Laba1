/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mephi.books;

import java.util.ArrayList;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import prosto.Users;

/**
 *
 * @author Анна
 */
public interface UsersOfLibreryFabric {
    
    Users CreateNewUser( ArrayList<XSSFSheet> sheets_of_names);
    
    
}
