import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SalidaDeDatos {

	public static void main(String[] args) {
		ProcessBuilder pb = new ProcessBuilder();
		pb.command("cmd.exe","/c", "ping -n 3 google.com");
		
		try {
			Process proceso = pb.start();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
			String linea;
			
			while((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
