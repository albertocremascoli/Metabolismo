/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

/**
 *
 * @author Utente
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    private static int addizione(int arg0, int arg1) {
        metabolismo.FunzioniService service = new metabolismo.FunzioniService();
        metabolismo.Funzioni port = service.getFunzioniPort();
        return port.addizione(arg0, arg1);
    }

    private static float divisione(int arg0, int arg1) {
        metabolismo.FunzioniService service = new metabolismo.FunzioniService();
        metabolismo.Funzioni port = service.getFunzioniPort();
        return port.divisione(arg0, arg1);
    }
    
}
