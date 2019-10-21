
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
      //miguel
        String saludo = mensaje_para_desencriptar;
        int columnas = resultado;
        //String saludo = "HHEA1EIR44IT0C2LL63";
        int numFilas = getNumFilas((double) saludo.length()/ (double) columnas);
        
        
    }
    public void mensajedesenciptar2(String mensaje_para_desencriptar){
      
    }
    public void Desencriptar3(String mensaje_para_desencriptar){
     
     
    }
    public static String[][] MatrizDesenc(String mensaje,String matriz[][],int numcol,int numfil){
	
				int k=0;
				for(int j=0;j<numcol; j++){
					for(int i=0;i<numfil; i++){
						if(k<mensaje.length()){
							if(matriz[i][j].equals("")){
								
							}else{matriz[i][j]=Character.toString(mensaje.charAt(k));;
								k++;}
						}else{
							matriz[i][j]= "";
						}
						
					}
				}
				return matriz;//regresa la matriz
			}

    
    public static String[][] MatrizDesenc2(String mensaje,String matriz[][],int numcol,int numfil,String cod){
				
				 
				int k=0;
				String matriz2[][]=new String[numfil][numcol];
				 for(int j=0;j<numfil; j++){
					
					for(int i=0;i<numcol; i++){
						matriz2[j][i]="#";
					}
				}
				 
				for(int j=0;j<numcol; j++){
				int num = Integer.parseInt(Character.toString(cod.charAt(j)))-1;
					for(int i=0;i<numfil; i++){
						if(k<cod.length()){
							if(matriz[i][num].equals("")){
								 matriz2[i][j]="";
							}else{
							matriz2[i][j]=Character.toString(mensaje.charAt(k));
								k++;	
                                                           
							}
								
						}else{
							matriz2[i][j]= "";
						}
						
					}
				}
				return ordenarMatriz(matriz2,numcol, numfil,cod);//regresa la matriz
			}
			
			public static String[][] ordenarMatriz(String matriz[][],int numcol,int numfil,String cod){
			    String[] vectorCod= cod.split("");
                            String[] vecTemp = null;
				int numTemp = 0;
				for(int i=0;i<numcol-1; i++){
					for(int j=i+1;j<numcol; j++){
						if(cod.charAt(i)>cod.charAt(j)){
							numTemp=Integer.parseInt(Character.toString(cod.charAt(i)));
							for(int k=0;k<numfil; k++) vecTemp[k] = matriz[k][i];
							vectorCod[i]=vectorCod[j];
							for(int k=0;k<numfil; k++) matriz[k][i] = matriz[k][j];
							vectorCod[j] = Integer.toString(numTemp);
							for(int k=0;k<numfil; k++) matriz[k][j] = vecTemp[k];

						}
					}
				}
				return matriz;
			}
    
                        public static String codigoDesc(String matriz[][]){
				String cadena ="";
			int	n = matriz.length;
			int	m = matriz[0].length;
				for(int i=0;i<n; i++){
					for(int j=0;j<m; j++){
						cadena = cadena + matriz[i][j];				
					}
				}
				return cadena.substring(cadena.indexOf("C")+1);
			}
			
			public void escribirDesord(String matriz[][]){
				//divRP = document.getElementById(divc);
				String cadena ="",lis="";
				int n = matriz.length;
				int m = matriz[0].length;
				for(int i=0;i<n; i++){
					for(int j=0;j<m; j++){
						cadena = cadena + matriz[i][j];				
					}
				}
				lis =lis+cadena;
                               
                               
			}
               public static String[][] MatrizEnc(String mensaje,int numCol, int numfilas){
				String[] vecMensaje = mensaje.split("");//convierte una cadena en un vector
				String[][] matriz = null;//declara una matriz
				int k=0;
				int numi=numfilas;// se saca el numero de filas
				for(int i=0;i<numi; i++){
					//matriz[i]=[];
					for(int j=0;j<numCol; j++){
						if(k<vecMensaje.length){
							matriz[i][j]=vecMensaje[k];
							k++;
						}else{
							matriz[i][j]= "";
						}
						
					}
				}
				return matriz;//regresa la matriz
			}
			public void escribir(String matriz[][],String divc){
			//String divRP = document.getElementById(divc);
				String cadena ="";
				cadena = cadena + "<table>";
				for(int  i=0;i<matriz.length; i++){
					cadena = cadena + "<tr>";
					for(int j=0;j<matriz[i].length; j++){
						cadena = cadena +matriz[i][j]+"\n";				
					}
					cadena = cadena + "</tr>";
				}
				cadena = cadena + "</table>";
				//divRP.innerHTML =divRP.innerHTML + cadena;
				
			}
			public void escribirOrd(String matriz[][], String divc){
				//divRP = document.getElementById(divc);
				String cadena ="";
				int n = matriz.length;
				 int m = matriz[0].length;
				for(int i=0;i<m; i++){
					for(int j=0;j<n; j++){
						cadena = cadena + matriz[j][i];				
					}
				}
				//divRP.innerHTML =divRP.innerHTML + cadena;
			}
			public void escribirOrd2(String matriz[][],String divc,String orden){
				//divRP = document.getElementById(divc);
				String[]vecOrden = orden.split("");
				String cadena ="";
				int num =0;
                                int n = matriz.length;
				int m = matriz[0].length;				
				for(int i=0;i<m; i++){
					for(int j=0;j<n; j++){
						num=Integer.parseInt(vecOrden[i])-1;
						cadena = cadena + matriz[j][num];//escribe fila , columna que sale del vector de orden.				
					}
				}
				//divRP.innerHTML =divRP.innerHTML + cadena;
			}         
                        
}
