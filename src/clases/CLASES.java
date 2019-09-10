/*
 * To change this license header, choose License H eaders in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


public class CLASES {

    
    public static void main(String[] args) {
       experimento exp=new experimento ();
       Calculadora Cal=new Calculadora ();
       experimento z = exp;
       System.out.println ("la suma es: "+exp.getcantidad());
       exp.contar();
       exp.contar();
       exp.contar();
       System.out.println ("exp"+exp.getcantidad());
       z.contar();
       System.out.println ("z"+z.getcantidad());
       Cal.setResultado(2);
       Cal.suma(8);
       System.out.println ("resultado:"+Cal.getResultado());
       
       calculadoradialog dlg=new calculadoradialog();
             dlg.setVisible (true){
             
             }
               }
    
}
