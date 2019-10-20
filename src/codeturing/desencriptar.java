
package codeturing;

import java.util.Scanner;


public class desencriptar {
    String lista1="",listotal="";
    String tabla="0123456789";
    int colunas=0;
    int N1[];
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
      colunas=resultado;
      
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
        pos = 0;
        String cadena = "";
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (pos < saludo.length()) {
                  cadena += matrix[i][j];   
                }
               pos++;
            }
        }
        
        System.err.println(cadena);
     lista1=cadena;
     listotal=cadena;
      int n1=colunas;
         int n2=colunas;
          listotal= listotal.replaceAll("\\s","");
          listotal= listotal.replace("null","");
        String listapru="",li;
        System.err.println("n1:"+n1+" los fines son"+listapru+"lista"+lista1+"tamaño"+lista1.length()+"tamañototal"+listotal.length()+"total"+listotal); 
        N1= new int[n1];
         for (int i = 0; i < n1; i++) {
             if (Character.toString(listotal.charAt(listotal.length()-n2)).equals(" ")) {
                 System.err.println("n1:"+n1+" los fines son"+listapru+"lista"+lista1+"tamaño"+lista1.length()+"tamañototal"+listotal.length()+"total"+listotal); 
             }else{
               //  if (Character.isDigit(listotal.charAt(listotal.length()-n2))) {
                   N1[i]=Integer.parseInt(Character.toString(listotal.charAt(listotal.length()-n2)));
             li=Character.toString(listotal.charAt(listotal.length()-n2));
             System.err.println("n2:"+n2+" los fines son"+li);  
             listapru+=N1[i];  
              //   }
 
              
             }
            n2--; 
         }
     System.err.println("n1:"+n1+" los fines son"+listapru); 
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
    public void mensajedesenciptar2(String mensaje_para_desencriptar){
       int columnas=colunas; 
        int numFilas = getNumFilas((double) mensaje_para_desencriptar.length()/ (double) columnas);
        
         char matrix[][] = new char[numFilas][columnas];
         int pos = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(pos < mensaje_para_desencriptar.length()) {
                    matrix[j][((N1[i])-1)] = mensaje_para_desencriptar.charAt(pos);
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
         lista1=cadena;
    }
}
