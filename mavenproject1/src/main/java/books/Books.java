/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package books;

import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;

/**
 *
 * @author Анна
 */
public abstract class Books {
     private String CompleteName; 
  
      public Books(String fullName) {   // считываем название книги и записываем его
        this.CompleteName = fullName; 
    }
      public String getCompleteName() { // гетеры - сетеры
        return CompleteName;
    }

    public void setCompleteName(String CompleteName) {
        this.CompleteName = CompleteName;
    }
    
    
     public MutableTreeNode GetNode(ArrayList<Books> books) {
        DefaultMutableTreeNode Nodes  = new DefaultMutableTreeNode(getCompleteName());
        for (Books book : books){
            Nodes.add(new DefaultMutableTreeNode(book.getCompleteName()));
        }
        return Nodes;
        
    }
}
