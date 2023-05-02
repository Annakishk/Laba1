/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package books;

import java.util.ArrayList;
import java.util.Random;
import mephi.books.BookFabric;
import org.apache.poi.xssf.usermodel.XSSFSheet;

/**
 *
 * @author Анна
 */
public class EnglishFabric extends BookFabric{
Random rand = new Random();
String CompleteName = null;

    public Books MakeTxtBook(XSSFSheet sheet) {
        
        
       ArrayList<String> EnglScien = getColumn(sheet,4);
       ArrayList<String> University = getColumn(sheet,5);
       ArrayList<String> Author = getColumn(sheet,6);
       CompleteName =  EnglScien.get(rand.nextInt(EnglScien.size()))+" "+ University.get(rand.nextInt(University.size()))+" "+Author.get(rand.nextInt(Author.size()));
       return new EngScient(CompleteName);
    }

    @Override
    public Books MakeFic(XSSFSheet sheet) { 
     
        ArrayList<String> EnglFic1 = getColumn(sheet,7);
        ArrayList<String> EnglFic2 = getColumn(sheet,8);
      CompleteName = EnglFic1.get(rand.nextInt(EnglFic1.size())) + EnglFic2.get(rand.nextInt(EnglFic2.size()));
        return new EngFic(CompleteName);
    }
    
}
