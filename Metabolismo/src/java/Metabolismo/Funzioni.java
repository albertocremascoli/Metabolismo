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
    
    //funziona
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
                        + "values('"+nome+"',"+tipo+")");
        }catch (SQLException SQLexc){
            SQLexc.printStackTrace();}
            }catch(ClassNotFoundException e){
                e.printStackTrace();
            }  
    }
    
    //funziona
    @WebMethod(operationName="riceviDatiAttivita")
    public void riceviDatIAttivita(double CCOSCIAINIZIO, double CCOSCIAFINE, double CAVAMBRACCIOINIZIO, double CAVAMBRACCIOFINE, double PESOINIZIALE, int DURATA, double PESOFINALE){
     try {
            System.out.println("Connetto Database");
            String driver = "org.apache.derby.jdbc.ClientDriver";
            Class.forName(driver);
            System.out.println("Eseguo Query");
            try {                
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Metabolismo","Andrea","andrea");              
                Statement sta = con.createStatement();
                sta.executeUpdate("insert into ATTIVITA(CCOSCIAINIZIO, CCOSCIAFINE, CAVAMBRACCIOINIZIO, CAVAMBRACCIOFINE, PESOINIZIALE, DURATA, PESOFINALE)"
                        + "values("+CCOSCIAINIZIO+","+CCOSCIAFINE+","+CAVAMBRACCIOINIZIO+","+CAVAMBRACCIOFINE+","+PESOINIZIALE+","+DURATA+","+PESOFINALE+")");
        }catch (SQLException SQLexc){
            SQLexc.printStackTrace();}
            }catch(ClassNotFoundException e){
                e.printStackTrace();
            }  
    }
    
    @WebMethod(operationName="riceviDatiGiornata")
    public void riceviDatiGiornata(int giorno, int mese, int anno, int idPersona){
     try {
            System.out.println("Connetto Database");
            String driver = "org.apache.derby.jdbc.ClientDriver";
            Class.forName(driver);
            System.out.println("Eseguo Query");
            try {                
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Metabolismo","Andrea","andrea");              
                Statement sta = con.createStatement();
                sta.executeUpdate("insert into GIORNATA(GIORNO, MESE, ANNO, IDPERSONA)"
                        + "values("+giorno+","+mese+","+anno+","+idPersona+")");
        }catch (SQLException SQLexc){
            SQLexc.printStackTrace();}
            }catch(ClassNotFoundException e){
                e.printStackTrace();
            }  
    }
    
    @WebMethod(operationName="riceviDatiInputG")
    public void riceviDatiInputG(int ore, int minuti, int idGiornata){
     try {
            System.out.println("Connetto Database");
            String driver = "org.apache.derby.jdbc.ClientDriver";
            Class.forName(driver);
            System.out.println("Eseguo Query");
            try {                
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Metabolismo","Andrea","andrea");              
                Statement sta = con.createStatement();
                sta.executeUpdate("insert into INPUTG(GIORNO, MESE, ANNO, IDPERSONA)"
                        + "values("+ore+","+minuti+","+idGiornata+")");
        }catch (SQLException SQLexc){
            SQLexc.printStackTrace();}
            }catch(ClassNotFoundException e){
                e.printStackTrace();
            }  
    }
    
    @WebMethod(operationName="riceviDatiOutputG")
    public void riceviDatiOutputG(int ore, int minuti, int idGiornata){
     try {
            System.out.println("Connetto Database");
            String driver = "org.apache.derby.jdbc.ClientDriver";
            Class.forName(driver);
            System.out.println("Eseguo Query");
            try {                
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Metabolismo","Andrea","andrea");              
                Statement sta = con.createStatement();
                sta.executeUpdate("insert into OUTPUTG(GIORNO, MESE, ANNO, IDPERSONA)"
                        + "values("+ore+","+minuti+","+idGiornata+")");
        }catch (SQLException SQLexc){
            SQLexc.printStackTrace();}
            }catch(ClassNotFoundException e){
                e.printStackTrace();
            }  
    }
    
    @WebMethod(operationName="riceviDatiPersona")
    public void riceviDatiPersona(String nome, String cognome, double peso){
     try {
            System.out.println("Connetto Database");
            String driver = "org.apache.derby.jdbc.ClientDriver";
            Class.forName(driver);
            System.out.println("Eseguo Query");
            try {                
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Metabolismo","Andrea","andrea");              
                Statement sta = con.createStatement();
                sta.executeUpdate("insert into PERSONA(NOME,COGNOME, PESO)"
                        + "values('"+nome+"','"+cognome+"',"+peso+")");
        }catch (SQLException SQLexc){
            SQLexc.printStackTrace();}
            }catch(ClassNotFoundException e){
                e.printStackTrace();
            }  
    }
    
    @WebMethod(operationName="riceviDatiProdottti")
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
}
