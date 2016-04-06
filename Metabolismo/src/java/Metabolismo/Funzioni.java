package Metabolismo;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author Utente
 */
@WebService()
public class Funzioni {
    @WebMethod(operationName="Somma")
    public int somma(int i, int a, int c){
        int somma=i+a+c;
        return somma;
    }
}
