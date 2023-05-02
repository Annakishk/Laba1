/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi.books;

import java.awt.print.Book;
import java.util.ArrayList;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Анна
 */
public class Journal {
    public ArrayList<XSSFSheet> Conteiner;
    public ArrayList<XSSFSheet> Conteiner2;
    public ArrayList<XSSFSheet> Conteiner3;
    public void DispenseSheet(XSSFWorkbook wb)
    {
        
         int n = wb.getNumberOfSheets();//количество листов в книге
        
         for(int i=0; i<n; i++)
        {
           
        XSSFSheet sheet = wb.getSheetAt(i); // используется для получения листа по индексу "i"
        String name = sheet.getSheetName();// получаем имя листа
           // System.out.println(name);
            if(name.equals("TeacherSurnames"))//выбирает листы Excel из книги
                {
                      Conteiner = new ArrayList();
                      Conteiner.add(wb.getSheetAt(i));//заполняем листы
                      Conteiner.add(wb.getSheetAt(i-2));
                      Conteiner.add(wb.getSheetAt(i+1));
                
                }
            if(name.equals("StudentSurnames"))
                {
                     Conteiner2= new ArrayList();
                     Conteiner2.add(wb.getSheetAt(i));
                     Conteiner2.add(wb.getSheetAt(i-1));
                     Conteiner2.add(wb.getSheetAt(i+2));

                }
            
            if(name.equals("Books"))
                { 
                    
                   
                   
                     Conteiner3 =new ArrayList();
                     Conteiner3.add(wb.getSheet("Books"));
                     n = wb.getNumberOfSheets();
                     
                   
                    
                }
                
          
        }
     
    }
    public ArrayList<XSSFSheet> getConteiner3()
    {  
       return Conteiner3; 
    }
    
    String n = new String();
    
     public ArrayList<XSSFSheet> getConteiner()
    {  
       return Conteiner;  
    }
     public ArrayList<XSSFSheet> getConteiner2()
    { 
       return Conteiner2;   
    }
}
