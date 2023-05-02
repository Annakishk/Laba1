/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package users;

import books.Books;
import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import prosto.Users;


public class Students extends Users{
    
public Students(String CompleteName) {
        super(CompleteName);
    }

public MutableTreeNode GetNode(ArrayList<String> books) {
    DefaultMutableTreeNode Nodes  = new DefaultMutableTreeNode(getCompleteName());
    for (String book : books){
          Nodes.add(new DefaultMutableTreeNode(book));
    }
    return Nodes;
        
}
      

   
   

  
}