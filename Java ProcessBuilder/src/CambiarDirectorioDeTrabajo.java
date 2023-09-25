import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class CambiarDirectorioDeTrabajo {

	public static void main(String[] args) {
		
		String homeDir = System.getProperty("user.home");
		ProcessBuilder pb = new ProcessBuilder();
		pb.command("cmd.exe", "/c", "dir");
		pb.directory(new File(homeDir));
		
		try {
			Process proceso = pb.start();
			BufferedReader br = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
			String linea = "";
			while((linea = br.readLine())!= null) {
				System.out.println(linea);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
