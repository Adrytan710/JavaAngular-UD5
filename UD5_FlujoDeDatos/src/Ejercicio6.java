import javax.swing.JOptionPane;

public class Ejercicio6 {

	//  @author Adri�n Rodriguez
	
	public static void main(String[] args) {
		final double IVA = 0.21;
		String text_precio = JOptionPane.showInputDialog("Introduce el n�mero que quieras");
		double precio = Integer.parseInt(text_precio);

		JOptionPane.showMessageDialog(null, "El producto tiene un precio de " + precio +
				" y su precio final es de " + (precio+(precio *IVA)));
	}

}
