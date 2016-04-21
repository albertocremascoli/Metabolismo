package Metabolismo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.*;
/**
 *
 * @author Utente
 */
@WebService()

public class Funzioni {
    GregorianCalendar dataN = new GregorianCalendar();
    /*
    @WebMethod(operationName="Addizione")
    public int addizione(int i, int a){
        int somma=i+a;
        return somma;
    }
    */
    @WebMethod(operationName="riceviDatiPersona")
    public void riceviDatiPersona(String nome, String cognome, float peso){
     try {
            System.out.println("Connetto Database");
            String driver = "org.apache.derby.jdbc.ClientDriver";
            Class.forName(driver);
            System.out.println("Eseguo Query");
            try {                
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Metabolismo","Andrea","andrea");              
                Statement sta = con.createStatement();
                sta.executeUpdate("insert into PERSONA(COGNOME, NOME, PESO)"
                        + "values('"+cognome+"','"+nome+"',"+peso+")");
        }catch (SQLException SQLexc){
            SQLexc.printStackTrace();}
            }catch(ClassNotFoundException e){
                e.printStackTrace();
            }  
    }
    
    @WebMethod(operationName="riceviDatiAlimento")
    public void riceviDatiAlimento(String nome, boolean tipo){
     try {
            System.out.println("Connetto Database");
            String driver = "org.apache.derby.jdbc.ClientDriver";
            Class.forName(driver);
            System.out.println("Eseguo Query");
            try {                
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Metabolismo","Andrea","andrea");              
                Statement sta = con.createStatement();
                sta.executeUpdate("insert into ALIMENTO(NOME, TIPO)"
                        + "values('"+nome+"',"+tipo+",)");
        }catch (SQLException SQLexc){
            SQLexc.printStackTrace();}
            }catch(ClassNotFoundException e){
                e.printStackTrace();
            }  
    }
    
    @WebMethod(operationName="riceviDatiProdotti")
    public void riceviDatiProdotti(boolean tipo){
     try {
            System.out.println("Connetto Database");
            String driver = "org.apache.derby.jdbc.ClientDriver";
            Class.forName(driver);
            System.out.println("Eseguo Query");
            try {                
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Metabolismo","Andrea","andrea");              
                Statement sta = con.createStatement();
                sta.executeUpdate("insert into PRODOTTI(TIPO)"
                        + "values("+tipo+")"); 
        }catch (SQLException SQLexc){
            SQLexc.printStackTrace();}
            }catch(ClassNotFoundException e){
                e.printStackTrace();
            }  
    }
    //da finire
    @WebMethod(operationName="riceviDatiAttivita")
    public void riceviDatiAttivita(String nome, String cognome, float peso){
     try {
            System.out.println("Connetto Database");
            String driver = "org.apache.derby.jdbc.ClientDriver";
            Class.forName(driver);
            System.out.println("Eseguo Query");
            try {                
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Metabolismo","Andrea","andrea");              
                Statement sta = con.createStatement();
                sta.executeUpdate("insert into PERSONA(COGNOME, NOME, PESO)"
                        + "values('"+cognome+"','"+nome+"',"+peso+")");
        }catch (SQLException SQLexc){
            SQLexc.printStackTrace();}
            }catch(ClassNotFoundException e){
                e.printStackTrace();
            }  
    }
}
