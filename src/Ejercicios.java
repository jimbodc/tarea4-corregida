
public class Ejercicios {
	
	//Devuelve el valor almacenado en el indice posicion
	static int obtenerValor(int arreglo[], int posicion)
	{
		
		return arreglo[posicion];//en el arreglo guardamos la posicion
	}
	
	//Devuelve el valor almacenado en el indice posicion
	static String obtenerValor(String arreglo[], int posicion)
	{
		return arreglo[posicion];
		//dentro de la variable string almacenamos la posiscion
	}
	
	//Devuelve la suma de todos los elementos del arreglo
	static int obtenerSuma(int arreglo[])
	
	{
		int suma = 0; 
	 		 //utilizamos el ciclo for para inicializando la varaible elemento en 0 y repitiendo
			for(int elemento = 0; elemento < arreglo.length; elemento++) 
		 		{ 
		 			suma = suma + arreglo[elemento]; 
		 		} 
		 		 
		 		return suma; 

	}
	
	//Devuelve el promedio de todos los elementos del arreglo
	static int obtenerPromedio(int arreglo[])
	{
		int suma = 0; //inicializamos en 0 la variable suma
		
		 		 
		 		for(int promedio = 0; promedio< arreglo.length; promedio++)//el ciclo for se repite hasta terminar la cantidad de elementos 
		 		{ 
		 			suma = suma + arreglo[promedio]; //realizamos la suma dentro del arreglo essta la variable promedio
		 		} 
		 		 
		 		return suma; 

	}
	
	//Devuelve true si valor esta 
	static boolean existe(char arreglo[], char valor)
	{
		//creamos la variable int existe inicializada en 0 y el ciclo for 
		for(int existe = 0; existe < arreglo.length; existe++) 
			 { 
			 	if(arreglo[existe] == valor) // si se cumple la condicion retorna verdadero
			 		{ 
			 				return true; 
			 			} 
			 		} 
			 		 
			 		return false; 

	}
		
	//Devuelve true si valor esta 
	static boolean existe(String arreglo[], String valor)
	{
		//utilizamos la variable tipo int que se llama esta dentro del ciclo for 
		for(int esta = 0; esta < arreglo.length; esta++) 
			 		{ 
			 			if(arreglo[esta] ==valor) //ponemos la condicion si se cumple retorna verdadero
			 			{ 
			 				return true; 
			 			} 
			 		} 
			 		 
			 		return false; 

	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
