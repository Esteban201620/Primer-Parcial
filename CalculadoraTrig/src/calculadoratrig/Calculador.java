/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoratrig;

/**
 *
 * @author estudiantes
 */
public class Calculador {
    double Num1;
    double Num2;
    int resultado;
    String Operacion;
    
    public double CalcularOperacion(){
        if (Operacion=="+"){
        return Num1+Num2;
    }
        if (Operacion=="-"){
            return Num1+Num2;
        }
        if (Operacion=="*"){
            return Num1*Num2;
        }
        if (Operacion=="/" && Num2!=0){
            return Num1/Num2;
        }
        if (Operacion=="Sen"){
            return //Num1+Num2;
        }
        if (Operacion=="Cos"){
            return //Num1+Num2;
        }
        if (Operacion=="Tan"){
            return //Num1+Num2;
        }
        if (Operacion=="Cotan"){
            return //Num1+Num2;
        }
        if (Operacion=="Sec"){
            return //Num1+Num2;
        }
        if (Operacion=="Cosec"){
            return //Num1+Num2;
        }
    return 0;
}
}