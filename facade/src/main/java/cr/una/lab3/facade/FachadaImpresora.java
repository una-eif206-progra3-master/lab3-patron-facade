/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.una.lab3.facade;

/**
 *
 * @author mguzmana
 */
public class FachadaImpresora {

    private ImpresoraNormal impresoraNormal;
    private ImpresoraAdicional impresoraAdicional;

    public FachadaImpresora() {
    }
    
    public String imprimirNormal(String texto) {
        impresoraNormal = new ImpresoraNormal(texto);
        return impresoraNormal.toString();
    }
    
    public String imprimirDiferente(String texto) {
        impresoraAdicional = new ImpresoraAdicional(texto);
        return impresoraAdicional.toString();
    }
    
}
