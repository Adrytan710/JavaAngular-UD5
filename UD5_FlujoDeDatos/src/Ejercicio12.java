import javax.swing.JOptionPane;

public class Ejercicio12 {

	//  @author Adri?n Rodriguez
	
	public static void main(String[] args) {
		String passwd = "hola123";
		boolean correcto = false;
		
		for (int i = 0; i < 3 && !correcto; i++) {
			String password = JOptionPane.showInputDialog("Introduce una contrase?a");
			if (password.equals(passwd)) {
				System.out.println("Enhorabuena");
				correcto = true;
			} else {
				System.out.println("Contrase?a err?nea, prueba otra vez");
			}
		}
	}

}