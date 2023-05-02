/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi.books;

import java.util.ArrayList;
import java.util.Random;
import static org.apache.poi.sl.usermodel.PlaceholderDetails.PlaceholderSize.full;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import prosto.Users;
import users.Students;
import users.Teachers;

/**
 *
 * @author Анна
 */
public class StudentFabric implements UsersOfLibreryFabric{
 Random random = new Random();
 Random rand = new Random();
 ArrayList<String> full = new ArrayList<>();
 String CompleteName = null;
    @Override
    public Users CreateNewUser(ArrayList<XSSFSheet> sheets_of_names) {
    
     XSSFSheet generalnames = sheets_of_names.get(0);
     XSSFSheet studentsurnames = sheets_of_names.get(1);
     XSSFSheet lastnames = sheets_of_names.get(2);
     ArrayList<String> mannames= getColumn(generalnames,0);
     ArrayList<String> womannames = getColumn(generalnames ,1);
     ArrayList<String> mansurnames = getColumn(studentsurnames,0);
     ArrayList<String> womansurnames = getColumn(studentsurnames,1);
     ArrayList<String> lastnamesall = getColumn(lastnames,0);
     
     for (int i = 0; i < lastnamesall.size(); i++){
        int a = random.nextInt(2);
        if(a == 0){
       // Добавляем окончание "а" к некоторым отчествам
        // С вероятностью 50% добавляем окончание "а"
        lastnamesall.set(i, lastnamesall.get(i) + "на");
        CompleteName =  womansurnames.get(rand.nextInt(womansurnames.size()))+" " + womannames.get(rand.nextInt(womannames.size()))+" "+lastnamesall.get(i);
       
        }
        else 
        {
          lastnamesall.set(i, lastnamesall.get(i) + "ич");
         CompleteName =  mansurnames.get(rand.nextInt(mansurnames.size()))+" " + mannames.get(rand.nextInt(mannames.size()))+" "+lastnamesall.get(i);
        }
       
       full.add(CompleteName);
      }
     int randomIndex = new Random().nextInt(full.size());// Получаем значение элемента по индексу
      String randomElement = full.get(randomIndex);// Выводим значение элемента
      return new Students(randomElement);
    }

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
