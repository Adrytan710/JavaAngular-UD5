import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		final double PI = Math.PI;
		String radio_num = JOptionPane.showInputDialog("Introduce el valor del radio");
		double radio = Double.parseDouble(radio_num);
		double area = PI*Math.pow(radio,2);
		
		System.out.println(area);

	}

}
