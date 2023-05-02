/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi.books;

import books.Books;
import books.EngFic;
import books.EngScient;
import books.EnglishFabric;
import books.RusFic;
import books.RusScient;
import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import users.Students;
import mephi.books.TreeManipulator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import users.Teachers;

/**
 *
 * @author Анна
 */
public class Manipulator {
    TreeManipulator tree = new TreeManipulator();; 
    ArrayList<Teachers> teach = new ArrayList<>();
    public ArrayList<String> allbooks = new ArrayList<>();  
    ArrayList<Students> stud = new ArrayList<>();
    public void CreateUsersStudent(int number_of_students)
    {
        //надо создать массив с уже готовыми книгами чтобы в методе TakeBook
       //уже из готовых выбирать и в другом методе же раздать по количеству 
       
        StudentFabric sf = new StudentFabric();
       
        ExlProvider s = new ExlProvider();
        UsersOfLibreryFabric user;
        user = new StudentFabric();
        s.run();
        ArrayList<XSSFSheet> a = s.journal.Conteiner2;// студенты
        for (int i = 0; i < number_of_students ; i++) {
            Students student = (Students) sf.CreateNewUser(a);
            stud.add(student);
        }
    }

       public void CreateUsersTeacher(int number_of_teachers)
    {
        TeacherFabric tf = new TeacherFabric();
        ExlProvider s = new ExlProvider();
        UsersOfLibreryFabric user;
        user = new TeacherFabric();
        s.run();
         ArrayList<XSSFSheet> b = s.journal.Conteiner ;//учителя 
         for (int i = 0; i < number_of_teachers ; i++) {
            Teachers teacher = (Teachers) tf.CreateNewUser(b);
            teach.add(teacher);
            
        }
    } 
       public void CreategBooks(int number_of_teachers,int number_of_students)
       { 
         ExlProvider s = new ExlProvider();
         EnglishFabric en = new EnglishFabric();
         RussianFabric rus = new RussianFabric();
         s.run();
         ArrayList<XSSFSheet> c = s.journal.Conteiner3;
          for (int i = 0; i < ((number_of_teachers+number_of_students)*10)/4 ; i++)
          { 
             
              EngFic book = (EngFic)en.MakeFic(c.get(0));
              EngScient book2 = (EngScient) en.MakeTxtBook(c.get(0));
              RusFic book3 = (RusFic) rus.MakeFic(c.get(0));
              RusScient book4 = (RusScient) rus.MakeTxtBook(c.get(0));
              allbooks.add(book.getCompleteName());
              allbooks.add(book2.getCompleteName());
              allbooks.add(book3.getCompleteName());
              allbooks.add(book4.getCompleteName());
             
            }
         
       }
       
       
       
       
    public TreeNode addInfotoGUI() {
     DefaultMutableTreeNode main = new DefaultMutableTreeNode(" Пользователи библиотеки ");
      this.CreategBooks(5, 5);
      main.add(tree.getSudentNodes(stud, allbooks));
      main.add(tree.getPrepodNodes(teach, allbooks));
      return main;
    }
}
