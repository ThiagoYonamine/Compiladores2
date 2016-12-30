package t3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thyonamine
 */
public class ParserListener extends LaBaseListener{

    ParserListener(Saida sp) {
        
    }
    PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();
    @Override
    public void enterPrograma(LaParser.ProgramaContext ctx) {
       // System.out.println("OIIIIIIIIIi");
    }
    
    
}
