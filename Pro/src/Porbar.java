import java.util.Scanner;

public class Porbar {
	
	
	public static void main(String [] args) {
		/*
		try {
			
			System.out.println(metodo());
		}catch(Exception e) {
			System.out.println("Excepción en método");
			e.printStackTrace();
		}*/
			/*
		double [] v = new double[15];

				try {
					acceso_por_indice(v,16);
				} catch (Exception e) {
					// TODO Bloque catch generado automáticamente
					e.printStackTrace();
				} */
		
		try {
			System.out.println(caracterEn2("Daniela", 7));
		} catch (Exception e) {
			//System.out.println(e.getStackTrace());	
			
		//System.out.println("has intentado recuperar una posicion de la cadena de caracteres que no existe");
		}
	}
	
	public static char caracterEn(String cadena, int numero) throws Exception{
		char caracter = ' ';
		int longitud = cadena.length();
		
		if(numero > longitud) {
			throw new Exception ("El número es mayor y no está dentro de la longitud de la cadena");
		}
		else {
			if( numero >= 0 && numero <= longitud) {
				caracter = cadena.charAt(numero);
				}
		}
		return caracter;	
	}	
	public static char caracterEn2(String cadena,int numero)throws Exception {
		char caracter = ' ';
		int longitud = cadena.length();
		
		try {
			if(numero > longitud) {
				throw new Exception("has intentado recuperar una posicion de la cadena de caracteres que no existe");
			}
			else{
				if(numero >= 0 && numero <= longitud) {
					caracter = cadena.charAt(numero);
					
			      }
		}
		}catch(Exception e) {
			throw e;
		}
		return caracter;
	}
	
	
	
	public static double acceso_por_indice(double [] v, int j)throws Exception{
			try {
				if((0<=j) && (j<=v.length)) {
					return v[j];
				}else {
					throw new RuntimeException ("El indice"+j+"No existe en el vector");
				}
			}catch(RuntimeException exc) {
				throw exc;
			}
		}
	
	private static int metodo() throws NumberFormatException {
		
		int valor=0;
		try {
			valor = valor+1;
			valor = valor + Integer.parseInt("w");
			valor = valor+1;
			System.out.println("Valor al final de try "+valor);
		}catch(NumberFormatException e) {
			valor = valor + Integer.parseInt("42");
			System.out.println("Valor al final del catch" +valor);
			throw e;
		}finally {
			valor = valor +1 ;
			System.out.println("Valor al final del finally" + valor);
		}
		valor = valor+1;
		System.out.println("Valor antes del return"+valor);
		return valor;
	}
}

class noNumero extends Exception{
	public noNumero() {
		super();
	}
	public noNumero(String mensaje) {
		super(mensaje);
	}
}
