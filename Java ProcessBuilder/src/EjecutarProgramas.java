import java.io.IOException;

public class EjecutarProgramas {

	public static void main(String[] args) {
		
//		Creamos un objeto ProcessBuilder y le decimos que nos ejecute el bloc de notas con el metodo command 
		ProcessBuilder pb = new ProcessBuilder();
		pb.command("notepad.exe");
		
		Process proceso;
		try {
//			Inicializamos el proceso y le decimos que espere hasta que ejecute el printf
			proceso = pb.start();
			int ret = proceso.waitFor();
			
			System.out.printf("Programa finalizado con el codigo: %d", ret);
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
