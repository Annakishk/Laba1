/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi.books;

import books.Books;
import books.RusFic;
import books.RusScient;
import java.util.ArrayList;
import java.util.Random;
import org.apache.poi.xssf.usermodel.XSSFSheet;

/**
 *
 * @author Анна
 */
public class RussianFabric extends BookFabric {
String CompleteName = null;
Random rand = new Random();
    @Override
    public Books MakeTxtBook(XSSFSheet sheet) {
         
       ArrayList<String> type = getColumn(sheet,0);
       ArrayList<String> topic = getColumn(sheet,1);
       CompleteName =  type.get(rand.nextInt(type.size())) +" "+ "по"+ " "+ topic.get(rand.nextInt(topic.size()));
       return new RusScient(CompleteName);
    }

    
    @Override
    public Books MakeFic(XSSFSheet sheet) {
       
        ArrayList<String> Rus1 = getColumn(sheet,2);
        ArrayList<String> Rus2 = getColumn(sheet,3);
        CompleteName =  Rus1.get(rand.nextInt(Rus1.size()))+" " + Rus2.get(rand.nextInt(Rus2.size()));
        return new RusFic(CompleteName);
    }
}
    

