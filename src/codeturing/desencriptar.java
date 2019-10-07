
package codeturing;


public class desencriptar {
    String lista1="";
    String tabla="0123456789";
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
      int filas1=(int)Math.ceil((Cat/resultado)+1);
       System.out.println("FILA"+filas1);
       //fila son 4 y la coluna
      String Matriz1[][]=new String[filas1][resultado];
      int Cont=0;
      for (int i = 0; i < resultado; i++) {
            for (int j = 0; j < filas1; j++) {
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
                 lista1+=" "+Matriz1[i][j];
            }
            lista1+="\n";
        }
      System.out.println(""+lista1);
      
    
      
    }
}
