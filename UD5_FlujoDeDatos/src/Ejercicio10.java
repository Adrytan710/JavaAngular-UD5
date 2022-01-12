import javax.swing.JOptionPane;

public class Ejercicio10 {
	
	//  @author Adrián Rodriguez
	
	public static void main(String[] args) {
		String textoVentas = JOptionPane.showInputDialog("Introduce el número de ventas"); 
        int numVentas = Integer.parseInt(textoVentas);
        int sumaVentas = 0;
        
        for (int i = 0; i < numVentas; i++) {
            textoVentas = JOptionPane.showInputDialog("Introduce el precio de venta" + (i+1));
            int venta = Integer.parseInt(textoVentas);
            sumaVentas = sumaVentas + venta;
        }
        System.out.println(sumaVentas);
    }
}