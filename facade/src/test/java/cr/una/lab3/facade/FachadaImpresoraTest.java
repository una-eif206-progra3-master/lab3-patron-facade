/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.una.lab3.facade;

import org.junit.Test;
import static org.junit.Assert.*;
import cr.una.lab3.facade.FachadaImpresora;

/**
 *
 * @author mguzmana
 */
public class FachadaImpresoraTest {
    
    public FachadaImpresoraTest() {
    }

    @Test
    public void create() {
        Impresora impresora = new Impresora(
                "PDF", "A4", true, "texto1"
        );

        assertEquals("PDF", impresora.getTipoDocumento());
        assertEquals("A4", impresora.getHoja());
        assertEquals(true, impresora.isColor());
        assertEquals("texto1", impresora.getTexto());
    }

    @Test
    public void testFachadaImpresora() {
        FachadaImpresora impresora = new FachadaImpresora();
        String impresion1 = impresora.imprimirNormal("texto1");
        String impresion2 = impresora.imprimirDiferente("texto2");
        
        System.out.println(impresion2);
        
        assertEquals(impresion1, "Impresora {tipoDocumento=PDF, hoja=A4, color=true, texto=texto1}");
        assertEquals(impresion2, "Impresora {tipoDocumento=excel, hoja=a3, color=false, texto=texto2}");
    }
}