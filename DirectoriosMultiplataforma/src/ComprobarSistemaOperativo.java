
public class ComprobarSistemaOperativo {
	
	private static String so = System.getProperty("os.name").toLowerCase();
	
	public static boolean esWindows() {
		return (so.indexOf("win") >= 0);
	}
	
	public static boolean esLinux() {
		return (so.indexOf("nix") >= 0 || so.indexOf("nux") >= 0 || so.indexOf("aix") >= 0);
	}
}
