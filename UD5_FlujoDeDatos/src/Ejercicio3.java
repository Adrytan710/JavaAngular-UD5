import javax.swing.JOptionPane;

public class Ejercicio3 {

	//  @author Adrián Rodriguez
	
	public static void main(String[] args) {
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		
		JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
	}
}