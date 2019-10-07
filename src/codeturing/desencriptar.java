
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
      
    }
}
