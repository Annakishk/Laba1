/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mephi.books;
import books.EnglishFabric;
import java.util.ArrayList;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import prosto.Users;


public class MephiBook {

    public static void main(String[] args) {
           java.awt.EventQueue.invokeLater(() -> {//сообщает системе, что следующий блок кода должен быть выполнен в EDT.
            Customizer dialog = new Customizer(new javax.swing.JFrame(), true);//создается объект диалога кастомайзер и устанавливается его видимость для пользователя с помощью setVisible(true).
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
     }
        
    }

