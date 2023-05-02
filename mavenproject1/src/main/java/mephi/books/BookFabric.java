/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi.books;

import books.Books;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

/**
 *
 * @author Анна
 */
public abstract class BookFabric {
   
    public abstract Books MakeTxtBook(XSSFSheet sheet);//метод возвращает обьекты типа Books
     public abstract Books MakeFic(XSSFSheet sheet); 
     
      public ArrayList getColumn(XSSFSheet sheet, int number_of_column)
   {
      ArrayList<String> columnData = new ArrayList<>();
     for(Row row: sheet) 
     {
         Cell cell = row.getCell(number_of_column);
         if(cell!=null)
         {
             columnData.add(cell.getStringCellValue());
         }
     }
   return columnData;

       
   }
    
 }

