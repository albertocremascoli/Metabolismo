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
    public int addizione(int i, int a, int c){
        int somma=i+a+c;
        return somma;
    }
    
    @WebMethod(operationName="Sottrazione")
    public int sottrazione(int i, int a, int c){
        int sottrazione=i-a-c;
        return sottrazione;
    }
}
