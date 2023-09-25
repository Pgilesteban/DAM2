import java.io.IOException;

public class SincronizacionDeProcesos {

	public static void main(String[] args) {
		
		System.out.println("Lanzamos dos procesos a la vez");
		
		ProcessBuilder pb1 = new ProcessBuilder("notepad.exe", "C:\\Users\\Pablo\\Desktop\\Ficherin.txt");
		ProcessBuilder pb2 = new ProcessBuilder("notepad.exe", "C:\\Users\\Pablo\\Desktop\\Ficherin2.txt");
		
		try {
			Process proceso1 = pb1.start();
			Process proceso2 = pb2.start();
			
			proceso1.waitFor();
			proceso2.waitFor();
			
			System.out.println("Espera a que los dos procesos hayan finalizado!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		

	}

}
