import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CrearDirectorios {
	
	static ComprobarSistemaOperativo cso = new ComprobarSistemaOperativo();
	static ArrayList<String> texto = new ArrayList<>();

	public static void main(String[] args) {
		
		String x;
		
		if(cso.esWindows() == true) {
			x = "Estamos en Windows";
			System.out.println(x);
			procesoEnWindows();
		}
		
		if(cso.esLinux() == true) {
			x = "Estamos en Linux";
			System.out.println(x);
		}
		
	}
	
	public static String preguntar(String pregunta) {
		Scanner sc = new Scanner(System.in);
		System.out.println(pregunta);
		String respuesta = sc.nextLine();
		return respuesta;
	}
	
	public static void procesoEnWindows() {
		String pregunta;
		while(true) {
			pregunta = preguntar("Introduce el texto del documento:");
			texto.add(pregunta);
			System.out.println("Añadido " +pregunta);
			if(pregunta.equals("exit")) {
				crearArchivoWindows();
				break;
			}
		}
	}
	
	public static void crearArchivoWindows() {
		String ruta = preguntar("Introduce la ruta donde se va a guardar el archivo:");
		String nombre = preguntar("Introduce el nombre del archivo:");
		String extension = preguntar("Introduce la extension del archivo:");
		String rutaCompleta = ruta + "\\" + nombre + "." +extension;
		File archivo = new File(rutaCompleta);
		try {
			FileWriter creador = new FileWriter(archivo);
			PrintWriter escritor = new PrintWriter(creador);
			for(String linea: texto) {
				System.out.println("Escribiendo " +linea);
				escritor.println(linea);
			}
			creador.close(); //Haz el close puto imbecil
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Se ha creado el archivo con ruta: " +rutaCompleta);
	}
	
	public static void procesoEnUbuntu() {
		String pregunta;
		while(true) {
			pregunta = preguntar("Introduce el texto del documento:");
			texto.add(pregunta);
			System.out.println("Añadido " +pregunta);
			if(pregunta.equals("exit")) {
				crearArchivoUbuntu();
				break;
			}
		}
	}
	
	public static void crearArchivoUbuntu() {
		String ruta = preguntar("Introduce la ruta donde se va a guardar el archivo:");
		String nombre = preguntar("Introduce el nombre del archivo:");
		String extension = preguntar("Introduce la extension del archivo:");
		
		String rutaCompleta = ruta + "\\" + nombre + "." +extension;
		File archivo = new File(rutaCompleta);
		try {
			FileWriter creador = new FileWriter(archivo);
			PrintWriter escritor = new PrintWriter(creador);
			for(String linea: texto) {
				System.out.println("Escribiendo " +linea);
				escritor.println(linea);
			}
			creador.close(); //Haz el close puto imbecil
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Se ha creado el archivo con ruta: " +rutaCompleta);
	}
}
