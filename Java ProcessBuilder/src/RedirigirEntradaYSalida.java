import java.io.*;
public class RedirigirEntradaYSalida {

	public static void main(String[] args) {
		
		ProcessBuilder pb = new ProcessBuilder();
		try {
			pb.command("cmd.exe", "type").redirectInput(new File("C:\\Users\\Pablo\\Documents", "input.txt"))
											.redirectOutput(new File("C:\\Users\\Pablo\\Documents\\", "otroOutput.txt")).start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
