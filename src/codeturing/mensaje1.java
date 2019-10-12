
package codeturing;

import javax.swing.JOptionPane;
import java.lang.Math;


public class mensaje1 {
int cantcolunas = 0;
String lista2="";
String lista1="";
String lisr="";
String lista4="";
 String lista5="";
 String lista6="";
 String lista7="";
int n0=0;
int n1=0;
int n2=0;
int n3=0;
int n4=0;
int N1[];
    public void Encritar(String mensaje_para_encritar){
        try {
             int Cat = mensaje_para_encritar.length();
     System.out.println("cantidad"+Cat);
     String V[]= new String[Cat];
     for (int i = 0; i < V.length; i++) {
        V[i]=Character.toString(mensaje_para_encritar.charAt(i));
    if ((V[i].equals("C"))||(V[i].equals("c"))) {
                try {
                    cantcolunas=Integer.parseInt(V[i-1]);
                System.out.println("cantidad colu"+cantcolunas); 
                } catch (Exception e) {
                 System.out.println("revisarcodigo no se encontro numero"); 
                }
               
            }
     }
     System.out.println("es la "+V[5]);
     System.out.println("tamaño de la cadena"+V.length);    
     try {
         n1=cantcolunas;
         n2=n1;
         String listapru="";
        N1= new int[n1];
         for (int i = 0; i < n1; i++) {
              N1[i]=Integer.parseInt(V[V.length-n2]);
             listapru+=N1[i];
              n2--;
         }
       
     System.err.println("n1:"+n1+" los vines son"+listapru);   
        } catch (Exception e) {
        System.out.println("revisarcodigo no se encontro numero"); 
        }
     
     
        for (int i = 0; i < V.length; i++) {
        System.out.println(V[i]);
        }
        int fila;
    double ñ=Math.ceil(Cat/cantcolunas);
        fila =(int)ñ+1;     
        System.err.println("cantidadfila"+fila);
        String Matrix1[][] = new String[cantcolunas][fila];
        int cont=0;
        
        
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < cantcolunas; j++) {
                if(cont<V.length){
                Matrix1[j][i]=V[cont];
               lista1+=" "+Matrix1[j][i];
                }else{
                    Matrix1[j][i]="";
                    lista1+=" "+Matrix1[j][i];
                    }
               cont++;
                                
                    }
                lista1+="\n";
        }

        for (int i = 0; i < cantcolunas; i++) {
            for (int j = 0; j < fila; j++) {
             
              lista2+=""+Matrix1[i][j];
               cont++;
            }
        lista2+=" ";
        } 
        } catch (Exception e) {
         JOptionPane.showMessageDialog(null,"Error: revise bien el mensaje");
        }
      
        
 }
    
    
    
    public void Encritar2(String mensaje_para_encritar2){
  int Cat = mensaje_para_encritar2.length();
     System.err.println("cantidad"+Cat+"\t"+mensaje_para_encritar2+" cnt colu"+cantcolunas+" o es"+mandar());
  
     int filas2=(int)Math.ceil((Cat/cantcolunas)+1);
        System.out.println("filas"+filas2);
 String Matrix2[][]= new String[cantcolunas][filas2];
 int cont=0;    
  String V2[]= new String[Cat];
        for (int i = 0; i < V2.length; i++) {
            V2[i]=Character.toString(mensaje_para_encritar2.charAt(i));
            System.out.println(""+V2[i]);
        }
 
 
 
 for (int i = 0; i < filas2; i++) {
         for (int j = 0; j < cantcolunas; j++) {
             if (cont<Cat) {
                Matrix2[j][i]=Character.toString(mensaje_para_encritar2.charAt(cont));
        lista4+=" "+Matrix2[j][i];   
             }else{
               Matrix2[j][i]="";
        lista4+=" "+Matrix2[j][i];    
             }
            
        cont++;
         }
         lista4+="\n";
     }
     System.out.println("\n"+lista4);
    
     for (int i = 0; i < cantcolunas; i++) {
            for (int j = 0; j < filas2; j++) {
             
              lista5+=""+Matrix2[((N1[i])-1)][j];
               cont++;
            }
        lista5+=" ";
        }
 }
    
    public void Encritar3(String mensaje_para_encritar3){
        int Cat = mensaje_para_encritar3.length();
     
  
     int filas3=(int)Math.ceil((Cat/cantcolunas)+1);
        System.out.println("filas"+filas3);
 String Matrix3[][]= new String[cantcolunas][filas3];
   int cont=0; 
    for (int i = 0; i < filas3; i++) {
         for (int j = 0; j < cantcolunas; j++) {
             if (cont<Cat) {
                Matrix3[j][i]=Character.toString(mensaje_para_encritar3.charAt(cont));
        lista6+=" "+Matrix3[j][i];   
             }else{
               Matrix3[j][i]="";
        lista6+=" "+Matrix3[j][i];    
             }
            
        cont++;
         }
         lista6+="\n";
     }
    
    
      for (int i = 0; i < cantcolunas; i++) {
            for (int j = 0; j < filas3; j++) {
             
              lista7+=""+Matrix3[i][j];
               cont++;
            }
        lista7+=" ";
        }
    
    
    
    
    //////fin
    }
    
    
 public int mandar(){
     
     return n1; 
 }
    
}
