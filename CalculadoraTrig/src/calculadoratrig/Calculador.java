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
    double resultado;
    String Operacion;
    
    public double CalcularOperacion(/*String Operacion, double Num1,  double Num2*/){
        if (Operacion=="+"){
        resultado=Num1+Num2;
            return resultado;
    }
        if (Operacion=="-"){
            resultado=Num1-Num2;
            return resultado;
        }
        if (Operacion=="*"){
            resultado=Num1*Num2;
            return resultado;
        }
        if (Operacion=="/" && Num2!=0){
            resultado=Num1/Num2;
            return resultado;
        }
        if (Operacion=="Sen"){
            resultado=Math.sin(Num1);
            resultado=Math.toRadians(resultado);
            return resultado;
        }
        if (Operacion=="Cos"){
            resultado=Math.cos(Num1);
            resultado=Math.toRadians(resultado);
            return resultado;
        }
        if (Operacion=="Tan"){
            resultado=Math.tan(Num1);
            resultado=Math.toRadians(resultado);
            return resultado;
        }
        if (Operacion=="Cot"){
            resultado=Math.tan(1/Num1);
            resultado=Math.toRadians(resultado);
            return resultado;
        }
        if (Operacion=="Sec"){
            resultado=Math.cos(1/Num1);
            resultado=Math.toRadians(resultado);
            return resultado;
        }
        if (Operacion=="Cosc"){
            resultado=Math.sin(1/Num1);
            resultado=Math.toRadians(resultado);
            return resultado;
        }
    return 0;
}
}