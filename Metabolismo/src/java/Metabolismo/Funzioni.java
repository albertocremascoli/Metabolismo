package Metabolismo;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author Utente
 */
@WebService()
public class Funzioni {
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
        int moltiplicazione=i-a;
        return moltiplicazione;
    }
    
    @WebMethod(operationName="Divisione")
    public int divisione(int i, int a){
        int divisione=i-a;
        return divisione;
    }
}
