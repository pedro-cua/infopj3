import java.io.*;
import java.io.File;
import java.io.IOException;

public class Gramatica{

	public static void main(String[] args) throws Exception{
		//Su codigo aqui
		String path = args[0]; //Direccion del archivo que contiene la gramatica
		String bandera = args[1]; //Modo de ejecucion del codigo 
		String pathtxt = args[2]; // Directorio donde se creara el archivo de respuesta

		if(bandera.equals(-afd){

		}
	}

	String [] Variables;
	String [] alfabeto;
	String [] SimboloInicial;
	String [][] reglas;
	
	public Gramatica(String path){
		BufferedReader br = new BufferedReader(new FileReader(path));

		String aux = br.readLine();
		this.Variables = aux.split(",");

		String aux1 = br.readLine();
		this.alfabeto = aux1.split(",");


	}
}