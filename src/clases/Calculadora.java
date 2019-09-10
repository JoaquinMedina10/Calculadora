/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Alumno
 */
public class Calculadora {
    
    public float resultado;
    
    public void suma (float n) { 
        setResultado(getResultado() + n);
} 
    
  public  void resta (float n) { 
        setResultado(getResultado() - n);
}
       
   public void multiplicacion (float n) { 
        setResultado(getResultado() * n);
}  
      public void division (float n) { 
        setResultado(getResultado() / n);
}

    /**
     * @return the resultado
     */
    public float getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

  
    }
    