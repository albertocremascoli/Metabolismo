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

    @WebMethod(operationName="Sottrazione")
    public int sottrazione(int i, int a){
        int sottrazione=i-a;
        return sottrazione;
    }

    @WebMethod(operationName="Moltiplicazione")
    public int moltiplicazione(int i, int a){
        int moltiplicazione=i*a;
        return moltiplicazione;
    }

    @WebMethod(operationName="Divisione")
    public float divisione(int i, int a){
        float divisione=i/a;
        return divisione;
    }

    @WebMethod(operationName="Potenza")
    public int potenza(int num){
      return num*num;
    }
    */
    @WebMethod(operationName="riceviDati")
    public void riceviDati(String nome, String cognome, float peso){
     try {
         
        // java.util.Date utilDate = new java.util.Date();
         /*
        java.sql.Date sqlDate = new java.sql.Date(dataN.getTime());
        System.out.println("utilDate:" + dataN);
        System.out.println("sqlDate:" + sqlDate);
        */
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
