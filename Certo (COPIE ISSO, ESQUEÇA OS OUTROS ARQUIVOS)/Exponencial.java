/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    package calculadora_avancada;
/**
 *
 * @author aluno
 */
public class Exponencial {
    public static double exponencial(double dnumeros1, double dnumeros2){
        int i=1;
        double result = 1;
        if(dnumeros2!=0){
        while(i<=dnumeros2){
            result = result * dnumeros1;
            i++;
        }    
        }else{
            result=1;
        }
        return result;
    }
}
