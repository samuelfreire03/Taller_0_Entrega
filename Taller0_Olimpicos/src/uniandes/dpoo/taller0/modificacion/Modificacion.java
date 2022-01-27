package uniandes.dpoo.taller0.modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificacion 

{
	
	
	public static void main(String[] args)
	{
		System.out.println("Hola, mundo!");
		
		try 
		{
			CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
			System.out.println(calc.paisConMasMedallistas());
		} catch (FileNotFoundException e) {
			// El programa fallo
			e.printStackTrace();
		} catch (IOException e) {
			// El programa fallo
			e.printStackTrace();
		} 
	}
	

}
