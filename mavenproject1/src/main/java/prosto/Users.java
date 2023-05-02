/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prosto;

import books.Books;
import java.util.ArrayList;
import javax.swing.tree.MutableTreeNode;


public abstract class Users {
    private String CompleteName;  // считываем полное имя пользователя библиотеки в переменную
  
    
    public Users(String CompleteName) {  // присваиваем имя пользователю
        this.CompleteName = CompleteName;
    }
    public String getCompleteName() { // гетеры - сетеры
        return CompleteName;
    }

    public void setCompleteName(String CompleteName) {                 
        this.CompleteName = CompleteName;
    }

   
  public abstract  MutableTreeNode GetNode(ArrayList<String> books);
}
