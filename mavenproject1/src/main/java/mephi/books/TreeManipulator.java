/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi.books;

import books.Books;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import users.Students;
import users.Teachers;

/**
 *
 * @author Анна
 */
public class TreeManipulator {//добавляю в дерево узлы преподавателей и студентов 
   
    public MutableTreeNode getSudentNodes(ArrayList<Students> students, ArrayList<String> books) {
        DefaultMutableTreeNode studentnodes = new DefaultMutableTreeNode("Студенты"); 
        Random rand = new Random();
        for (Students student : students) {
       
        
         DefaultMutableTreeNode booknode = new DefaultMutableTreeNode(student.getCompleteName());
         for(int i=0; i<(int) Math.round(Math.random() * (10 - 3) + 3); i++){
           int book = rand.nextInt(books.size());
           booknode.add(new DefaultMutableTreeNode(books.get(book)));
           books.remove(book);
           studentnodes.add(booknode);
          }
        }
        return studentnodes;
    }
    public MutableTreeNode getPrepodNodes(ArrayList<Teachers> teachers, ArrayList<String> books) {
        DefaultMutableTreeNode teachernodes = new DefaultMutableTreeNode("Преподаватели");
        Random rand = new Random();
       for (Teachers teacher : teachers) {
         
     
        DefaultMutableTreeNode booknode = new DefaultMutableTreeNode(teacher.getCompleteName());
        for(int i=0; i<(int) Math.round(Math.random() * (10 - 3) + 3); i++){
            int book = rand.nextInt(books.size());
            booknode.add(new DefaultMutableTreeNode(book));
            books.remove(book);
            teachernodes.add(booknode);
          }
        }
          return teachernodes;
    }
   
}
