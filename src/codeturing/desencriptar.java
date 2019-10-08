
package codeturing;

import java.util.Scanner;


public class desencriptar {
    String lista1="";
    String tabla="0123456789";
     public static int getNumFilas(double numero) {
        return (int)Math.ceil(numero);
    }
    public void Desencriptar1(String mensaje_para_desencriptar){
    int Cat = mensaje_para_desencriptar.length();
    int comtador=0;
        for (int i = 0; i < mensaje_para_desencriptar.length(); i++) {
            if(Character.isDigit(mensaje_para_desencriptar.charAt(i))){
              comtador++;
            }
        }
     int resultado = comtador-3;
     System.err.println(""+resultado);
      
      
        String saludo = mensaje_para_desencriptar;
        int columnas = resultado;
        //String saludo = "HHEA1EIR44IT0C2LL63";
        int numFilas = getNumFilas((double) saludo.length()/ (double) columnas);
        
        char matrix[][] = new char[numFilas][columnas];
        
        int pos = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(pos < saludo.length()) {
                    matrix[j][i] = saludo.charAt(pos);
                    pos++;
                }
            }
        }
        
        String cadena = "";
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < columnas; j++) {
                cadena += matrix[i][j];
            }
        }
        
        System.err.println(cadena);
     lista1=cadena;
     
     
     
     /*int re=Cat/resultado;
     int filas1=(int)Math.ceil((Cat/resultado)+1);
       System.out.println("FILA"+filas1);
       //fila son 4 y la coluna
      String Matriz1[][]=new String[filas1][resultado];
      int Cont=0;
      for (int i = 0; i < Matriz1[0].length; i++) {
            for (int j = 0; j < Matriz1.length; j++) {
             System.out.println("CONTADOR"+Cont+" CATIDAD"+Cat+" J"+j+" I"+i+" rsultado"+resultado);
                if(Cont<Cat){
                    
                           Matriz1[j][i]=Character.toString(mensaje_para_desencriptar.charAt(Cont)) ;               
                lista1+=" "+Matriz1[j][i];
                 System.out.println(""+lista1);
                    
                 
             }else{
               Matriz1[j][i]=" ";
             lista1+=" "+Matriz1[j][i];
             }
                Cont++;
            }
        lista1+="\n";
      }
     System.out.println(""+lista1);
      lista1="";
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < resultado; j++) {
                 lista1+=Matriz1[i][j];
            }
           
        }
      System.out.println(""+lista1);
    /*  String Matriz2[][] = new String[filas1][resultado];
    lista1="";
        for (int i = 0; i < resultado; i++) {
            for (int j = 0; j < filas1; j++) {
                if (re==3.5) {
                    Matriz2[j][i]="";
                }else{
                Matriz2[j][i]=Matriz1[j][i] ;
                lista1+=" "+Matriz1[i][j];
                }
                
                 
            }
            lista1+="\n";
        }
        System.out.println(""+lista1);
      */
    //esto no funciona por haora
    
    }
}
