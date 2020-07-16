/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacoDAO;
   import java.sql.Connection;
   import java.sql.DriverManager;
   import java.sql.SQLException;
   import javax.swing.JOptionPane;
/**
 *
 * @author Alexia
 */
public class conexao {
   

    public static Connection getConexao(){
        Connection conexao= null;
        String usuario="root";
        String senha= "";
        String caminho="jdbc:mysql://localhost:3306/bdvendas";
        
        try{
            conexao= DriverManager.getConnection(caminho,usuario,senha);
            System.out.println("conexao com sucesso!");
        }
        catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "erro ao efetuar a conexão"+erro);
        
        }
        return conexao;
    }

 
    
 
    
}
