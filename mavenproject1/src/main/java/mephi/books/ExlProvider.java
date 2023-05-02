/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi.books;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExlProvider {//выгружаю файлик
    private File file;
    private  XSSFWorkbook wb;
    public Journal journal = new Journal();


    public void run()
    {
        LoadFile();
        Transfer();
       
    }
    public void Transfer()  // вытягиваем имена листов и отправляем на распределение вместе со всей книгой
    {
       journal.DispenseSheet(wb);//передали книгу на распределение 
        

    }
    public boolean LoadFile() 
    {
 

       try {

           this.file = new File("src\\resources\\DataTable.xlsx");//C:\\Users\\Anna\\BIGAT\\DataTable.xlsx
           FileInputStream fis = new FileInputStream(file);
            wb = new XSSFWorkbook(fis);
            fis.close();
            } 
      catch (IOException ex) {
               System.out.println("Error");
            }
       return true;
    }

  
 


}