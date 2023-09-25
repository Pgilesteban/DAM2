import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class RedireccionFlujoSalidaDeDatos {

	public static void main(String[] args) {
		
		var homeDir = System.getProperty("user.home");
		ProcessBuilder pb = new ProcessBuilder();
		pb.command("cmd.exe", "/c", "date /t");
		
		File fileName = new File(String.format("%s\\Documents\\output.txt", homeDir));
		
		pb.redirectOutput(fileName);
		try {
			Process proceso = pb.start();
			InputStreamReader isr = new InputStreamReader(proceso.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			
			String linea;
			while((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
